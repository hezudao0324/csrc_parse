package com.bbd.csrc.dataparse.service.impl;

import com.bbd.csrc.dataparse.dao.PersonBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.PersonDjgDAO;
import com.bbd.csrc.dataparse.dao.PersonGdDAO;
import com.bbd.csrc.dataparse.dao.PersonSkrDAO;
import com.bbd.csrc.dataparse.domain.PersonBasicInfo;
import com.bbd.csrc.dataparse.domain.PersonDjg;
import com.bbd.csrc.dataparse.domain.PersonGd;
import com.bbd.csrc.dataparse.domain.PersonSkr;
import com.bbd.csrc.dataparse.service.CombinePersonBasicInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyf on 2019-05-15.
 */
@Service
@Slf4j
public class CombinePersonBasicInfoServiceImpl implements CombinePersonBasicInfoService {

    @Autowired
    PersonBasicInfoDAO personBasicInfoDAO;
    @Autowired
    PersonDjgDAO personDjgDAO;
    @Autowired
    PersonGdDAO personGdDAO;
    @Autowired
    PersonSkrDAO personSkrDAO;


    @Override
    public void combineData() {
        //董监高
        log.info("》》》》》》》》》》》开始合并董监高");
        String djgYear = "2017";
        List<PersonDjg> personDjgList = personDjgDAO.selectByYear(djgYear);
        personDjgList.stream().forEach(personDjg -> {
            PersonBasicInfo info = new PersonBasicInfo();
            info.setSec_code(personDjg.getSec_code());
            info.setName(personDjg.getName());
            info.setSex(personDjg.getSex());
            info.setAge(String.valueOf(personDjg.getAge()));
            info.setEducation(personDjg.getEducation());
            info.setPosition(personDjg.getPosition());
            info.setReport_date(personDjg.getReport_date());
            info.setResume(personDjg.getResume());
            PersonBasicInfo existInfo = personBasicInfoDAO.selectBySecCodeAndName(personDjg.getSec_code(), personDjg.getName());
            if (existInfo != null) {
                if (existInfo.getType() != null && !existInfo.getType().contains("董监高")) {
                    info.setType(existInfo.getType() + "、" + "董监高");
                }else{
                    info.setType(existInfo.getType());
                }
                personBasicInfoDAO.updateBySecCodeAndName(info);
            } else {
                info.setType("董监高");
                personBasicInfoDAO.insert(info);
            }
        });
        log.info("》》》》》》》》》》》结束合并董监高");

        //股东
        log.info("》》》》》》》》》》》开始合并股东");
        List<PersonGd> personGdList = personGdDAO.selectByType();
        personGdList.stream().forEach(personGd -> {
            PersonBasicInfo info = new PersonBasicInfo();
            info.setSec_code(personGd.getSec_code());
            info.setName(personGd.getShareh_name());
            info.setRatio(personGd.getShare_perce());
            info.setReport_date(personGd.getCninfo_year());
            PersonBasicInfo existInfo = personBasicInfoDAO.selectBySecCodeAndName(personGd.getSec_code(), personGd.getShareh_name());
            if (existInfo != null) {
                if (existInfo.getType() != null && !existInfo.getType().contains("股东")) {
                    info.setType(existInfo.getType() + "、" + "股东");
                }else{
                    info.setType(existInfo.getType());
                }
                personBasicInfoDAO.updateBySecCodeAndName(info);
            } else {
                info.setType("股东");
                personBasicInfoDAO.insert(info);
            }
        });
        log.info("》》》》》》》》》》》结束合并董股东");

        //实控人
        log.info("》》》》》》》》》》》开始合并实控人");
        String skrYear = "2018";
        List<PersonSkr> personSkrList = personSkrDAO.selectByYear(skrYear);
        personSkrList.stream().forEach(personSkr -> {
            PersonBasicInfo info = new PersonBasicInfo();
            info.setSec_code(personSkr.getSec_code());
            info.setName(personSkr.getActual_contr_name());
//            info.setNationality(personSkr.getCitize_country());
            info.setReport_date(personSkr.getReport_date());
            PersonBasicInfo existInfo = personBasicInfoDAO.selectBySecCodeAndName(personSkr.getSec_code(), personSkr.getActual_contr_name());
            if (existInfo != null) {
                if (existInfo.getType() != null && !existInfo.getType().contains("实控人")) {
                    info.setType(existInfo.getType() + "、" + "实控人");
                }else{
                    info.setType(existInfo.getType());
                }
                personBasicInfoDAO.updateBySecCodeAndName(info);
            } else {
                info.setType("实控人");
                personBasicInfoDAO.insert(info);
            }
        });
        log.info("》》》》》》》》》》》结束合并实控人");
    }


}
