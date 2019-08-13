package com.bbd.csrc.dataparse.task;

import com.bbd.csrc.dataparse.fileparser.FileParser;
import com.bbd.csrc.dataparse.fileparser.FileParserFactory;
import com.bbd.csrc.dataparse.parse.FileHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.util.Collections;
import java.util.List;

/**
 * Created by wish on 2018/9/24.
 */
@Slf4j
public abstract class AbstractDataFileParseTask extends BaseDataFileParseTask {

    @Autowired
    private FileHandler fileHandler;

    @Value("${dataparse.datashare.data.path}")
    private String dataPath;

    @Value("${dataparse.datashare.data.bakpath}")
    private String bakDataPath;

    //最大备份目录数
    private static final int MAX_BAK_DIC = 60;

    public  String getDataPath(){
        return dataPath;
    }

    public  String getBakDataPath(){
        return bakDataPath;
    }

    public void parseWithPath(String path) {
        List<String> files = fileHandler.findAllFiles(path);
        files.sort(String::compareTo);
        log.info("扫描路径{}结束，共扫描到文件{}个", path, files.size());
        for (String file : files) {
            //文件内容为空，直接删除
            if (fileHandler.isEmpty(file)) {
                fileHandler.deleteFile(file);
                continue;
            }

            String fileName = org.apache.commons.lang3.StringUtils.substringAfterLast(file, File.separator);
            String filePath = org.apache.commons.lang3.StringUtils.substringBeforeLast(file, File.separator) + File.separator;
            //获取文件解析器
            FileParser fileParser = FileParserFactory.getFileParser(filePath, fileName);
            //备份目录
            String targetPath = getBakDataPath() + StringUtils.substringAfter(filePath, StringUtils.replace(getDataPath(), "/", File.separator));
            if (fileParser == null) {
                log.info("文件{}{}跳过解析，无匹配的fileParser", filePath, fileName);
                fileHandler.moveFile(file, targetPath);
                continue;
            }
            lockWithFile(filePath, fileName);
            try {
                fileParser.handleWithFile(filePath, fileName);
                fileHandler.moveFile(file, targetPath);
            } catch (Exception e) {
                e.printStackTrace();
                log.error("处理文件：{}失败", file);
            } finally {
                unlockWithFile(filePath, fileName);
            }
        }

        clearExpireFile();
    }

    /**
     * 清理过期备份数据
     */
    private void clearExpireFile() {
        //备份目录
        String targetPath = getBakDataPath();

        List<String> files = fileHandler.list(targetPath);

        log.info("扫描备份路径{}结束，共扫描到文件{}个", targetPath, files.size());

        if(files.size() > MAX_BAK_DIC) {
            files.sort(String::compareTo);
            Collections.reverse(files);
            List<String> removeDics = files.subList(MAX_BAK_DIC, files.size());
            for (String removeDic : removeDics) {
                fileHandler.deleteFile(removeDic);
                log.info("删除过期备份文件{}", removeDic);
            }
        }
    }



    public abstract void parse();
}
