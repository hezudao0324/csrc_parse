package com.bbd.csrc.dataparse.task;

import com.bbd.csrc.dataparse.parse.FileHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by wish on 2018/9/24.
 */
@Slf4j
@Component
public class DataShareDataFileParseTask extends AbstractDataFileParseTask {

    @Value("${dataparse.datashare.data.path}")
    private String dataPath;

    @Value("${dataparse.datashare.data.bakpath}")
    private String bakDataPath;

    @Autowired
    private FileHandler fileHandler;

    @Override
    public String getDataPath() {
        return dataPath;
    }

    @Override
    public String getBakDataPath() {
        return bakDataPath;
    }

    @Override
    public void parse() {

        List<String> dateDirectories = fileHandler.list(getDataPath());
        dateDirectories.sort(String::compareTo);

        for (String dateDirectory : dateDirectories) {
            if (!fileHandler.isDirectory(dateDirectory)) {
                continue;
            }
//            List<String> directories = fileHandler.list(dateDirectory);
//            for (String directory : directories) {
//                if (!fileHandler.isDirectory(directory)) {
//                    continue;
//                }
//                super.parseWithPath(directory);
//            }
            super.parseWithPath(dateDirectory);
//            fileHandler.delFolder(dateDirectory);
        }

    }

}
