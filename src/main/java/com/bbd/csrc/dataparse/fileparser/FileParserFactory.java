package com.bbd.csrc.dataparse.fileparser;

import com.bbd.csrc.dataparse.utils.SpringContextUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * FileParser工厂类
 * Created by wish on 2018/10/19.
 */
public class FileParserFactory {
    /**
     * 获取fileParser
     * @param filePath 文件路径
     * @param fileName 文件名
     * @return
     */
    public static FileParser getFileParser(String filePath, String fileName) {
        if(StringUtils.endsWithIgnoreCase(fileName, ".csv")) {
            return SpringContextUtil.getBean("csvFileParser");
        }
        if(StringUtils.endsWithIgnoreCase(fileName, ".json")) {
            return SpringContextUtil.getBean("jsonFileParser");
        }
        if (filePath.contains("add")) {
            return SpringContextUtil.getBean("addJsonFileParser");
        }
        return null;
    }
}
