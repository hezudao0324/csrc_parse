package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * company_basic_info
 * @author 
 */
public class CompanyBasicInfo implements Serializable {
    /**
     * 公司名称
     */
    private String companyName;

    private String bbdQyxxId;

    /**
     * 法定代表人
     */
    private String legalRepresentative;

    /**
     * 注册地址
     */
    private String registerAddress;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 注册时间
     */
    private Date registerDate;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 注册资本
     */
    private Double registerAmount;

    /**
     * 上市板块
     */
    private String ipoType;

    /**
     * 市值规模(亿)
     */
    private Double marketValue;

    /**
     * 年度总资产
     */
    private Double yearAssert;

    /**
     * 年度净利润
     */
    private Double yearProfit;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 上市时间
     */
    private Date ipoDate;

    /**
     * 证券简称
     */
    private String securityName;

    /**
     * 员工总数
     */
    private Integer employeeAmount;

    /**
     * 一级行业代码
     */
    private String firstIndustryCode;

    /**
     * 二级行业代码
     */
    private String secondIndustryCode;

    /**
     * 董事长与总经理是否兼任
     */
    private Boolean partTime;

    /**
     * 独立董事人数
     */
    private Integer independentBoardAmount;

    /**
     * 独立董事比例
     */
    private Double independentBoardRatio;

    /**
     * 前十大股东持股比例合计
     */
    private Double shareHoldingRatio;

    /**
     * 会计师事务所变更
     */
    private Boolean accountingFirmChange;

    /**
     * 近三年一度非自然人关联方中被列为被执行人的数量
     */
    private Integer relatedPersonSubjectToEnforcement;

    /**
     * 近三年一度非自然人关联方中被列为失信被执行人的数量
     */
    private Integer relatedBreakFaithPersonSubjectToEnforcement;

    /**
     * 近三年一度非自然人关联方受到的证监会行政处罚、行政监管措施数
     */
    private Integer relatedAdministrativePenaltyOfCsrc;

    /**
     * 近三年一度非自然人关联方受到其他政府机构行政处罚数
     */
    private Integer relatedAdministrativePenaltyOfOtherGov;

    /**
     * 近三年一度非自然人关联方收到的交易所监管函件的函件数
     */
    private Integer relatedLetterOfExchange;

    /**
     * 近三年一度非自然人关联方收到的交易所关注函、问询函的数量
     */
    private Integer relatedSubLetterOfExchange;

    /**
     * 近三年一度非自然人关联方收到裁判文书数量
     */
    private Integer relatedJudicativePaper;

    /**
     * 公司的专利数量
     */
    private Integer patentAmount;

    /**
     * 公司的商标数量
     */
    private Integer trademarkAmount;

    /**
     * 公司的计算机软件著作权登记公告数量的计算机软件著作权登记公告数量
            
     */
    private Integer softwareCopyrightAmount;

    /**
     * 公司的分支机构数量
     */
    private Integer embranchmentAmount;

    /**
     * 公司存续年限
     */
    private Double existYear;

    /**
     * 近三年公司是否受到证监会行政处罚或行政监管措施
     */
    private Boolean csrcPunishment;

    /**
     * 近三年公司收到交易所问询函、关注函的数量
     */
    private Integer subLetterOfExchange;

    /**
     * 近三年公司收到交易所监管函件的数量
     */
    private Integer letterOfExchange;

    /**
     * 近三年公司作为被执行人的次数
     */
    private Integer personSubjectToEnforcement;

    /**
     * 近三年公司败诉数量
     */
    private Integer loseALawsuit;

    /**
     * 实际控制人
     */
    private String sHolderController;

    /**
     * 会计师事务所
     */
    private String agencyExaccountant;

    /**
     * 上市地点
     */
    private String sInfoExchmarket;

    /**
     * 第一大股东
     */
    private String firstHolderName;

    /**
     * 第一大股东持股比例
     */
    private Double firstHolderPct;

    /**
     * 行政区划_省份
     */
    private String sInfoAdministrativedivision1;

    /**
     * 行政区划_地级
     */
    private String sInfoAdministrativedivision2;

    /**
     * 行政区划_县级
     */
    private String sInfoAdministrativedivision3;

    private String companyNameFulltext;

    private static final long serialVersionUID = 1L;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBbdQyxxId() {
        return bbdQyxxId;
    }

    public void setBbdQyxxId(String bbdQyxxId) {
        this.bbdQyxxId = bbdQyxxId;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getRegisterAmount() {
        return registerAmount;
    }

    public void setRegisterAmount(Double registerAmount) {
        this.registerAmount = registerAmount;
    }

    public String getIpoType() {
        return ipoType;
    }

    public void setIpoType(String ipoType) {
        this.ipoType = ipoType;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public Double getYearAssert() {
        return yearAssert;
    }

    public void setYearAssert(Double yearAssert) {
        this.yearAssert = yearAssert;
    }

    public Double getYearProfit() {
        return yearProfit;
    }

    public void setYearProfit(Double yearProfit) {
        this.yearProfit = yearProfit;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Date getIpoDate() {
        return ipoDate;
    }

    public void setIpoDate(Date ipoDate) {
        this.ipoDate = ipoDate;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public Integer getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    public String getFirstIndustryCode() {
        return firstIndustryCode;
    }

    public void setFirstIndustryCode(String firstIndustryCode) {
        this.firstIndustryCode = firstIndustryCode;
    }

    public String getSecondIndustryCode() {
        return secondIndustryCode;
    }

    public void setSecondIndustryCode(String secondIndustryCode) {
        this.secondIndustryCode = secondIndustryCode;
    }

    public Boolean getPartTime() {
        return partTime;
    }

    public void setPartTime(Boolean partTime) {
        this.partTime = partTime;
    }

    public Integer getIndependentBoardAmount() {
        return independentBoardAmount;
    }

    public void setIndependentBoardAmount(Integer independentBoardAmount) {
        this.independentBoardAmount = independentBoardAmount;
    }

    public Double getIndependentBoardRatio() {
        return independentBoardRatio;
    }

    public void setIndependentBoardRatio(Double independentBoardRatio) {
        this.independentBoardRatio = independentBoardRatio;
    }

    public Double getShareHoldingRatio() {
        return shareHoldingRatio;
    }

    public void setShareHoldingRatio(Double shareHoldingRatio) {
        this.shareHoldingRatio = shareHoldingRatio;
    }

    public Boolean getAccountingFirmChange() {
        return accountingFirmChange;
    }

    public void setAccountingFirmChange(Boolean accountingFirmChange) {
        this.accountingFirmChange = accountingFirmChange;
    }

    public Integer getRelatedPersonSubjectToEnforcement() {
        return relatedPersonSubjectToEnforcement;
    }

    public void setRelatedPersonSubjectToEnforcement(Integer relatedPersonSubjectToEnforcement) {
        this.relatedPersonSubjectToEnforcement = relatedPersonSubjectToEnforcement;
    }

    public Integer getRelatedBreakFaithPersonSubjectToEnforcement() {
        return relatedBreakFaithPersonSubjectToEnforcement;
    }

    public void setRelatedBreakFaithPersonSubjectToEnforcement(Integer relatedBreakFaithPersonSubjectToEnforcement) {
        this.relatedBreakFaithPersonSubjectToEnforcement = relatedBreakFaithPersonSubjectToEnforcement;
    }

    public Integer getRelatedAdministrativePenaltyOfCsrc() {
        return relatedAdministrativePenaltyOfCsrc;
    }

    public void setRelatedAdministrativePenaltyOfCsrc(Integer relatedAdministrativePenaltyOfCsrc) {
        this.relatedAdministrativePenaltyOfCsrc = relatedAdministrativePenaltyOfCsrc;
    }

    public Integer getRelatedAdministrativePenaltyOfOtherGov() {
        return relatedAdministrativePenaltyOfOtherGov;
    }

    public void setRelatedAdministrativePenaltyOfOtherGov(Integer relatedAdministrativePenaltyOfOtherGov) {
        this.relatedAdministrativePenaltyOfOtherGov = relatedAdministrativePenaltyOfOtherGov;
    }

    public Integer getRelatedLetterOfExchange() {
        return relatedLetterOfExchange;
    }

    public void setRelatedLetterOfExchange(Integer relatedLetterOfExchange) {
        this.relatedLetterOfExchange = relatedLetterOfExchange;
    }

    public Integer getRelatedSubLetterOfExchange() {
        return relatedSubLetterOfExchange;
    }

    public void setRelatedSubLetterOfExchange(Integer relatedSubLetterOfExchange) {
        this.relatedSubLetterOfExchange = relatedSubLetterOfExchange;
    }

    public Integer getRelatedJudicativePaper() {
        return relatedJudicativePaper;
    }

    public void setRelatedJudicativePaper(Integer relatedJudicativePaper) {
        this.relatedJudicativePaper = relatedJudicativePaper;
    }

    public Integer getPatentAmount() {
        return patentAmount;
    }

    public void setPatentAmount(Integer patentAmount) {
        this.patentAmount = patentAmount;
    }

    public Integer getTrademarkAmount() {
        return trademarkAmount;
    }

    public void setTrademarkAmount(Integer trademarkAmount) {
        this.trademarkAmount = trademarkAmount;
    }

    public Integer getSoftwareCopyrightAmount() {
        return softwareCopyrightAmount;
    }

    public void setSoftwareCopyrightAmount(Integer softwareCopyrightAmount) {
        this.softwareCopyrightAmount = softwareCopyrightAmount;
    }

    public Integer getEmbranchmentAmount() {
        return embranchmentAmount;
    }

    public void setEmbranchmentAmount(Integer embranchmentAmount) {
        this.embranchmentAmount = embranchmentAmount;
    }

    public Double getExistYear() {
        return existYear;
    }

    public void setExistYear(Double existYear) {
        this.existYear = existYear;
    }

    public Boolean getCsrcPunishment() {
        return csrcPunishment;
    }

    public void setCsrcPunishment(Boolean csrcPunishment) {
        this.csrcPunishment = csrcPunishment;
    }

    public Integer getSubLetterOfExchange() {
        return subLetterOfExchange;
    }

    public void setSubLetterOfExchange(Integer subLetterOfExchange) {
        this.subLetterOfExchange = subLetterOfExchange;
    }

    public Integer getLetterOfExchange() {
        return letterOfExchange;
    }

    public void setLetterOfExchange(Integer letterOfExchange) {
        this.letterOfExchange = letterOfExchange;
    }

    public Integer getPersonSubjectToEnforcement() {
        return personSubjectToEnforcement;
    }

    public void setPersonSubjectToEnforcement(Integer personSubjectToEnforcement) {
        this.personSubjectToEnforcement = personSubjectToEnforcement;
    }

    public Integer getLoseALawsuit() {
        return loseALawsuit;
    }

    public void setLoseALawsuit(Integer loseALawsuit) {
        this.loseALawsuit = loseALawsuit;
    }

    public String getsHolderController() {
        return sHolderController;
    }

    public void setsHolderController(String sHolderController) {
        this.sHolderController = sHolderController;
    }

    public String getAgencyExaccountant() {
        return agencyExaccountant;
    }

    public void setAgencyExaccountant(String agencyExaccountant) {
        this.agencyExaccountant = agencyExaccountant;
    }

    public String getsInfoExchmarket() {
        return sInfoExchmarket;
    }

    public void setsInfoExchmarket(String sInfoExchmarket) {
        this.sInfoExchmarket = sInfoExchmarket;
    }

    public String getFirstHolderName() {
        return firstHolderName;
    }

    public void setFirstHolderName(String firstHolderName) {
        this.firstHolderName = firstHolderName;
    }

    public Double getFirstHolderPct() {
        return firstHolderPct;
    }

    public void setFirstHolderPct(Double firstHolderPct) {
        this.firstHolderPct = firstHolderPct;
    }

    public String getsInfoAdministrativedivision1() {
        return sInfoAdministrativedivision1;
    }

    public void setsInfoAdministrativedivision1(String sInfoAdministrativedivision1) {
        this.sInfoAdministrativedivision1 = sInfoAdministrativedivision1;
    }

    public String getsInfoAdministrativedivision2() {
        return sInfoAdministrativedivision2;
    }

    public void setsInfoAdministrativedivision2(String sInfoAdministrativedivision2) {
        this.sInfoAdministrativedivision2 = sInfoAdministrativedivision2;
    }

    public String getsInfoAdministrativedivision3() {
        return sInfoAdministrativedivision3;
    }

    public void setsInfoAdministrativedivision3(String sInfoAdministrativedivision3) {
        this.sInfoAdministrativedivision3 = sInfoAdministrativedivision3;
    }

    public String getCompanyNameFulltext() {
        return companyNameFulltext;
    }

    public void setCompanyNameFulltext(String companyNameFulltext) {
        this.companyNameFulltext = companyNameFulltext;
    }
}