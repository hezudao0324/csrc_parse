package com.bbd.csrc.dataparse.controller;

import com.bbd.csrc.dataparse.service.CombinePersonBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyf on 2019-05-15.
 */
@RestController
public class CombinController {

    @Autowired
    CombinePersonBasicInfoService combinePersonBasicInfoService;

    /**
     * 合并人员信息
     * @return
     */
    @RequestMapping("/combine")
    public String combine() {
        combinePersonBasicInfoService.combineData();
        return "合并成功";
    }
}
