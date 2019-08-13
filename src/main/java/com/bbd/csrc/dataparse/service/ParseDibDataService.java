package com.bbd.csrc.dataparse.service;

/**
 * Created by hyf on 2019-06-18.
 * 解析迪博数据
 */
public interface ParseDibDataService {

    /**
     * 解析职位信息
     * dib_director_keyresume
     */
    void parsePositon();

    /**
     * 解析股东信息
     * dib_shares_major_shareholder_info
     */
    void parseHolder();

    /**
     * 解析实际控制人
     * dib_director_keyresume
     */
    void parseController();

}

