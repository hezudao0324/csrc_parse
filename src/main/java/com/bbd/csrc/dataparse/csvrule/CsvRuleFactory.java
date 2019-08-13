package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.utils.SpringContextUtil;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * csv文件解析规则工厂类
 * Created by wish on 2018/9/19.
 */
public class CsvRuleFactory {

    /**
     * 文件名正则匹配返回csvRule实例
     * @param fileName
     * @return
     */
    public static CsvRule getCsvRule(String fileName) {
        Map<String,CsvRule> map = SpringContextUtil.getApplicationContext().getBeansOfType(CsvRule.class);
        for (Map.Entry<String, CsvRule> entry : map.entrySet()) {
            CsvRule csvRule = entry.getValue();
            Pattern pattern = Pattern.compile(csvRule.fileNameRegex());
            Matcher matcher = pattern.matcher( fileName);
            if(matcher.matches()) {
                return csvRule;
            }
        }
        return null;
    }
}
