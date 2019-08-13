package com.bbd.csrc.dataparse.fileparser;

import com.bbd.csrc.dataparse.csvrule.CsvRule;
import com.bbd.csrc.dataparse.csvrule.CsvRuleFactory;
import com.bbd.csrc.dataparse.exception.CommonException;
import com.bbd.csrc.dataparse.utils.ReflectHelper;
import com.csvreader.CsvReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * csv 文件解析
 * Created by wish on 2018/10/16.
 */
@Component
@Slf4j
public class CsvFileParser implements FileParser {

    @Value("${dataparse.batch.insert.count}")
    private int batchInsertCount;

    @Override
    public void handleWithFile(String filePath, String fileName) {
        {
            InputStream in = null;
            CsvReader csvReader = null;
            try {
                in = new FileInputStream(filePath + fileName);
//                csvReader = new CsvReader(in,Charset.forName("gbk"));
                csvReader = new CsvReader(in, '\t',Charset.forName("utf8"));
                csvReader.setSafetySwitch(false);
                CsvRule csvRule = CsvRuleFactory.getCsvRule(fileName);
                if (csvRule == null) {
                    log.info("文件{}{}无相关解析器，跳过解析", filePath, fileName);
                    return;
                }
                csvRule.beforeDeal();
                csvReader.readHeaders();
                String[] headers = csvReader.getHeaders();
                List<Object> list = new ArrayList<>();
                while (csvReader.readRecord()) {
                    Object object = csvRule.getTargetClass().newInstance();
                    for (int i = 0; i < headers.length; i++) {
                        String header = headers[i];
                        if (StringUtils.isEmpty(header)) {
                            continue;
                        }
                        String filedValue = csvReader.get(header);
                        ReflectHelper.setValueByFieldName(object, header, filedValue);
                    }
                    list.add(object);
                    if (list.size() >= batchInsertCount) {
                        csvRule.dealWithResult(list);
                        list.clear();
                    }
                }
                if (list.size() > 0) {
                    csvRule.dealWithResult(list);
                }
                log.info("文件{}{}解析完成", filePath, fileName);
                csvRule.afterDeal();
            } catch (Exception e) {
                e.printStackTrace();
                log.error("解析csv文件失败");
                throw new CommonException("解析csv文件失败");
            } finally {
                csvReader.close();
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
