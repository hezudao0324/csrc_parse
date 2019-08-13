package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * dib_director_keyresume
 * @author 
 */
public class DibDirectorKeyresume implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 公告ID
     */
    private String cninfoId;

    /**
     * 公告年份
     */
    private String cninfoYear;

    /**
     * 高管编号
     */
    private String managementId;

    /**
     * 证券代码
     */
    private String secCode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 职务
     */
    private String position;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生年份
     */
    private String birthyear;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 籍贯
     */
    private String nativeplace;

    /**
     * 学历
     */
    private String education;

    /**
     * 毕业院校
     */
    private String university;

    /**
     * 职称
     */
    private String title;

    /**
     * 报告期
     */
    private Date reportDate;

    /**
     * 更新状态
     */
    private String updateState;

    /**
     * 完成人
     */
    private String finishBy;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 报告来源
     */
    private String reportSource;

    /**
     * 新增人
     */
    private String addBy;

    /**
     * 新增时间
     */
    private Date addTime;

    /**
     * 更新人
     */
    private String updateBy;

    private Date updateTime;

    /**
     * 完成状态
     */
    private String finishState;

    /**
     * 审核人
     */
    private String auditBy;

    /**
     * 复审人
     */
    private String retrialBy;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 复审时间
     */
    private Date retrialTime;

    /**
     * 审核状态
     */
    private String auditState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 报告期类型
     */
    private String reportDateType;

    /**
     * 个人简介
     */
    private String resume;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCninfoId() {
        return cninfoId;
    }

    public void setCninfoId(String cninfoId) {
        this.cninfoId = cninfoId;
    }

    public String getCninfoYear() {
        return cninfoYear;
    }

    public void setCninfoYear(String cninfoYear) {
        this.cninfoYear = cninfoYear;
    }

    public String getManagementId() {
        return managementId;
    }

    public void setManagementId(String managementId) {
        this.managementId = managementId;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getUpdateState() {
        return updateState;
    }

    public void setUpdateState(String updateState) {
        this.updateState = updateState;
    }

    public String getFinishBy() {
        return finishBy;
    }

    public void setFinishBy(String finishBy) {
        this.finishBy = finishBy;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFinishState() {
        return finishState;
    }

    public void setFinishState(String finishState) {
        this.finishState = finishState;
    }

    public String getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy;
    }

    public String getRetrialBy() {
        return retrialBy;
    }

    public void setRetrialBy(String retrialBy) {
        this.retrialBy = retrialBy;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getRetrialTime() {
        return retrialTime;
    }

    public void setRetrialTime(Date retrialTime) {
        this.retrialTime = retrialTime;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReportDateType() {
        return reportDateType;
    }

    public void setReportDateType(String reportDateType) {
        this.reportDateType = reportDateType;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}