package com.bbd.csrc.dataparse.domain;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * person_basic_info
 *
 * @author
 */
public class PersonBasicInfo implements Serializable {
    private Integer id;

    /**
     * 证券代码
     */
    private String sec_code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 类型
     */
    private String type;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 学历
     */
    private String education;

    /**
     * 职位
     */
    private String position;

    /**
     * 持股比例
     */
    private String ratio;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 报告年度
     */
    private String report_date;

    private String resume;

    private static final long serialVersionUID = 1L;


    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSec_code() {
        return sec_code;
    }

    public void setSec_code(String sec_code) {
        if (StringUtils.isNotEmpty(sec_code)) {
            this.sec_code = sec_code;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNotEmpty(name)) {
            this.name = name;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (StringUtils.isNotEmpty(type)) {
            this.type = type;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (StringUtils.isNotEmpty(sex)) {
            this.sex = sex;
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if (StringUtils.isNotEmpty(age)) {
            this.age = age;
        }
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        if (StringUtils.isNotEmpty(education)) {
            this.education = education;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (StringUtils.isNotEmpty(position)) {
            this.position = position;
        }
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        if (StringUtils.isNotEmpty(ratio)) {
            this.ratio = ratio;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (StringUtils.isNotEmpty(nationality)) {
            this.nationality = nationality;
        }
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        if (StringUtils.isNotEmpty(report_date)) {
            this.report_date = report_date;
        }
    }
}