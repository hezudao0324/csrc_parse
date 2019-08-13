package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * dib_shares_major_shareholder_info
 * @author 
 */
public class DibSharesMajorShareholderInfo implements Serializable {
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
     * 证券代码
     */
    private String secCode;

    /**
     * 股东名称
     */
    private String sharehName;

    /**
     * 股东性质
     */
    private String shareNature;

    /**
     * 持股比例（%)
     */
    private BigDecimal sharePerce;

    /**
     * 报告期末持股数量
     */
    private BigDecimal sharesHeld;

    /**
     * 报告期内增减变动情况
     */
    private String increaseDecrease;

    /**
     * 持有有限售条件的股份数量
     */
    private BigDecimal numRestricted;

    /**
     * 持有无限售条件的股份数量
     */
    private BigDecimal numNonRestricted;

    /**
     * 质押或冻结情况股份状态
     */
    private String pledgedFrozenShares;

    /**
     * 质押或冻结情况数量
     */
    private BigDecimal pledgedFrozenSharesNums;

    /**
     * 一致行动人状态
     */
    private Integer relatedPartiesStates;

    /**
     * 单位
     */
    private String unit;

    /**
     * 相关临时公告ID
     */
    private String temCninfoId;

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
     * 完成状态
     */
    private String finishState;

    /**
     * 审核人
     */
    private String auditBy;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 复审人
     */
    private String retrialBy;

    /**
     * 复审时间
     */
    private Date retrialTime;

    /**
     * 审核状态
     */
    private String auditState;

    /**
     * 删除状态
     */
    private Integer delState;

    /**
     * 股东排名
     */
    private Integer rank;

    /**
     * 报告期类型
     */
    private String reportDateType;

    /**
     * 报告期
     */
    private Date reportDate;

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

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getSharehName() {
        return sharehName;
    }

    public void setSharehName(String sharehName) {
        this.sharehName = sharehName;
    }

    public String getShareNature() {
        return shareNature;
    }

    public void setShareNature(String shareNature) {
        this.shareNature = shareNature;
    }

    public BigDecimal getSharePerce() {
        return sharePerce;
    }

    public void setSharePerce(BigDecimal sharePerce) {
        this.sharePerce = sharePerce;
    }

    public BigDecimal getSharesHeld() {
        return sharesHeld;
    }

    public void setSharesHeld(BigDecimal sharesHeld) {
        this.sharesHeld = sharesHeld;
    }

    public String getIncreaseDecrease() {
        return increaseDecrease;
    }

    public void setIncreaseDecrease(String increaseDecrease) {
        this.increaseDecrease = increaseDecrease;
    }

    public BigDecimal getNumRestricted() {
        return numRestricted;
    }

    public void setNumRestricted(BigDecimal numRestricted) {
        this.numRestricted = numRestricted;
    }

    public BigDecimal getNumNonRestricted() {
        return numNonRestricted;
    }

    public void setNumNonRestricted(BigDecimal numNonRestricted) {
        this.numNonRestricted = numNonRestricted;
    }

    public String getPledgedFrozenShares() {
        return pledgedFrozenShares;
    }

    public void setPledgedFrozenShares(String pledgedFrozenShares) {
        this.pledgedFrozenShares = pledgedFrozenShares;
    }

    public BigDecimal getPledgedFrozenSharesNums() {
        return pledgedFrozenSharesNums;
    }

    public void setPledgedFrozenSharesNums(BigDecimal pledgedFrozenSharesNums) {
        this.pledgedFrozenSharesNums = pledgedFrozenSharesNums;
    }

    public Integer getRelatedPartiesStates() {
        return relatedPartiesStates;
    }

    public void setRelatedPartiesStates(Integer relatedPartiesStates) {
        this.relatedPartiesStates = relatedPartiesStates;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTemCninfoId() {
        return temCninfoId;
    }

    public void setTemCninfoId(String temCninfoId) {
        this.temCninfoId = temCninfoId;
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

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRetrialBy() {
        return retrialBy;
    }

    public void setRetrialBy(String retrialBy) {
        this.retrialBy = retrialBy;
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

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getReportDateType() {
        return reportDateType;
    }

    public void setReportDateType(String reportDateType) {
        this.reportDateType = reportDateType;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}