package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.PersonBasicInfoDAO;
import com.bbd.csrc.dataparse.domain.PersonBasicInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hyf on 2019-05-15.
 */
@Component
@Slf4j
public class PersonBasicInfoCsvRule implements CsvRule<PersonBasicInfo> {

    @Autowired
    PersonBasicInfoDAO personBasicInfoDAO;

    @Override
    public void beforeDeal() {
        log.info("开始处理个人法人信息");
        personBasicInfoDAO.truncateTable();
    }

    @Override
    public void afterDeal() {
        log.info("结束处理个人法人信息");
    }

    @Override
    public void dealWithResult(List<PersonBasicInfo> list) {
        list.stream().forEach(personBasicInfo -> {
            personBasicInfo.setType("法人");
            personBasicInfo.setReport_date("2017");
        });
        personBasicInfoDAO.insertBatch(list);
    }

    @Override
    public String fileNameRegex() {
        return "^(person_legal)*(.csv)$";
    }
}
