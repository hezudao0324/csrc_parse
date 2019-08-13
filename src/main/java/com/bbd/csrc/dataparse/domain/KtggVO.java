package com.bbd.csrc.dataparse.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hyf on 2019-03-28.
 */
@Data
public class KtggVO implements Serializable {

    private String key;

    private String bbd_qyxx_id;

    private String company_name;

    private String credit_code;

    private String jgdm;

    private String regnum;

    /**
     * 数据ID
     */
    private String id;

    /**
     * 案由
     */
    private String action_cause;

    /**
     * 数据抓取日期
     */
    private String bbd_dotime;

    /**
     * 数据抓取时间戳
     */
    private String bbd_uptime;

    /**
     * 开庭日期
     */
    private String trial_date;

    /**
     * 案号
     */
    private String case_code;

    /**
     * 城市
     */
    private String city;

    /**
     * 当事人
     */
    private String litigant;

    /**
     * 案件标题
     */
    private String title;

    /**
     * 相关信息唯一ID
     */
    private String bbd_xgxx_id;

    /**
     * 数据源分类
     */
    private String bbd_type;

    /**
     * 创建时间
     */
    private String create_time;

    /**
     * 链接地址
     */
    private String bbd_url;

    /**
     * 数据来源
     */
    private String bbd_source;

    /**
     * 原开庭地点
     */
    private String original_trial_court;

    /**
     * 结案日期
     */
    private String closure_date;

    /**
     * 法庭
     */
    private String court;

    /**
     * 原告
     */
    private String accuser;

    /**
     * 发布日期
     */
    private String pubdate;

    /**
     * 书记员
     */
    private String clerk;

    /**
     * 主审法官
     */
    private String trial_judge;

    /**
     * 案件类别
     */
    private String case_type;

    /**
     * 立案日期
     */
    private String register_date;

    /**
     * 审判长
     */
    private String chief_judge;

    /**
     * 案件信息
     */
    private String flag;

    /**
     * 案件状态
     */
    private String case_state;

    /**
     * 承办人电话
     */
    private String agent_phone;

    /**
     * 是否撤销上诉
     */
    private String is_revoke;

    /**
     * 原开庭时间
     */
    private String original_trial_date;

    /**
     * 法庭用途
     */
    private String court_behoof;

    /**
     * 承办部门
     */
    private String org_depart;

    /**
     * 被告/被上诉人
     */
    private String defendant;

    /**
     * 审理法院
     */
    private String trial_court;

    private String id_type;

    /**
     * 省份
     */
    private String province;

    /**
     * 合议庭成员
     */
    private String collegial_member;

    /**
     * 案件名称
     */
    private String action_name;

    /**
     * 承办人
     */
    private String org_agent;

    /**
     * 数据版本
     */
    private String bbd_version;
}
