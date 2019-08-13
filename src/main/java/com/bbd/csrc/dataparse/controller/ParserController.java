package com.bbd.csrc.dataparse.controller;

import com.bbd.csrc.dataparse.service.ParseDibDataService;
import com.bbd.csrc.dataparse.task.DataShareDataFileParseTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyf on 2019-03-20.
 */
@RestController
@RequestMapping("/parse")
public class ParserController {

    @Autowired
    DataShareDataFileParseTask dataShareDataFileParseTask;
    @Autowired
    ParseDibDataService parseDibDataService;


    @RequestMapping("/file")
    public String parse() {
        dataShareDataFileParseTask.parse();
        return "解析完成";
    }

    /**
     * 职位
     * @return
     */
    @RequestMapping("/position")
    public String parse2() {
        parseDibDataService.parsePositon();
        return "解析完成";
    }

    /**
     * 股东
     * @return
     */
    @RequestMapping("/shareHolder")
    public String parse3() {
        parseDibDataService.parseHolder();
        return "解析完成";
    }

    /**
     * 实控人
     * @return
     */
    @RequestMapping("/controller")
    public String parse4() {
        parseDibDataService.parseController();
        return "解析完成";
    }
}
