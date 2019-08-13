package com.bbd.csrc.dataparse.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * table_sample_bond_default
 * @author 
 */
@Data
public class TableSampleBondDefault implements Serializable {
    private Integer id;

    private String 公司名称;

    private String 分数;

    private String AVAIDISTSHAREPROF;

    private String AVAIDISTPROF;

    private String Companycashflow;

    private String UNDIPROF;

    private String FreeCashflowtocompany;

    private String TOTALNONCLIAB;

    private String WorkingCapital;

    private String FinancialExpenseRate;

    private String FINEXPE;

    private String PREPtoLABOPAYC;

    private String TOTALSHARE;

    private String FINNETCFLOW;

    private String FINNETCFLOW1;

    private String COMPINCOAMT;

    private String CashReinvestmentRatio;

    private String NoncurrentAssetTurnover;

    private String PARENETP;

    private String NPCUT;

    private String NETPROFIT;

    private String CURFDS;

    private String bbdQyxxId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get公司名称() {
        return 公司名称;
    }

    public void set公司名称(String 公司名称) {
        this.公司名称 = 公司名称;
    }

    public String get分数() {
        return 分数;
    }

    public void set分数(String 分数) {
        this.分数 = 分数;
    }

    public String getAVAIDISTSHAREPROF() {
        return AVAIDISTSHAREPROF;
    }

    public void setAVAIDISTSHAREPROF(String AVAIDISTSHAREPROF) {
        this.AVAIDISTSHAREPROF = AVAIDISTSHAREPROF;
    }

    public String getAVAIDISTPROF() {
        return AVAIDISTPROF;
    }

    public void setAVAIDISTPROF(String AVAIDISTPROF) {
        this.AVAIDISTPROF = AVAIDISTPROF;
    }


    public String getUNDIPROF() {
        return UNDIPROF;
    }

    public void setUNDIPROF(String UNDIPROF) {
        this.UNDIPROF = UNDIPROF;
    }


    public String getTOTALNONCLIAB() {
        return TOTALNONCLIAB;
    }

    public void setTOTALNONCLIAB(String TOTALNONCLIAB) {
        this.TOTALNONCLIAB = TOTALNONCLIAB;
    }

    public String getFINEXPE() {
        return FINEXPE;
    }

    public void setFINEXPE(String FINEXPE) {
        this.FINEXPE = FINEXPE;
    }

    public String getPREPtoLABOPAYC() {
        return PREPtoLABOPAYC;
    }

    public void setPREPtoLABOPAYC(String PREPtoLABOPAYC) {
        this.PREPtoLABOPAYC = PREPtoLABOPAYC;
    }

    public String getTOTALSHARE() {
        return TOTALSHARE;
    }

    public void setTOTALSHARE(String TOTALSHARE) {
        this.TOTALSHARE = TOTALSHARE;
    }

    public String getFINNETCFLOW() {
        return FINNETCFLOW;
    }

    public void setFINNETCFLOW(String FINNETCFLOW) {
        this.FINNETCFLOW = FINNETCFLOW;
    }

    public String getFINNETCFLOW1() {
        return FINNETCFLOW1;
    }

    public void setFINNETCFLOW1(String FINNETCFLOW1) {
        this.FINNETCFLOW1 = FINNETCFLOW1;
    }

    public String getCOMPINCOAMT() {
        return COMPINCOAMT;
    }

    public void setCOMPINCOAMT(String COMPINCOAMT) {
        this.COMPINCOAMT = COMPINCOAMT;
    }

    public String getPARENETP() {
        return PARENETP;
    }

    public void setPARENETP(String PARENETP) {
        this.PARENETP = PARENETP;
    }

    public String getNPCUT() {
        return NPCUT;
    }

    public void setNPCUT(String NPCUT) {
        this.NPCUT = NPCUT;
    }

    public String getNETPROFIT() {
        return NETPROFIT;
    }

    public void setNETPROFIT(String NETPROFIT) {
        this.NETPROFIT = NETPROFIT;
    }

    public String getCURFDS() {
        return CURFDS;
    }

    public void setCURFDS(String CURFDS) {
        this.CURFDS = CURFDS;
    }

    public String getCompanycashflow() {
        return Companycashflow;
    }

    public void setCompanycashflow(String companycashflow) {
        Companycashflow = companycashflow;
    }

    public String getFreeCashflowtocompany() {
        return FreeCashflowtocompany;
    }

    public void setFreeCashflowtocompany(String freeCashflowtocompany) {
        FreeCashflowtocompany = freeCashflowtocompany;
    }

    public String getWorkingCapital() {
        return WorkingCapital;
    }

    public void setWorkingCapital(String workingCapital) {
        WorkingCapital = workingCapital;
    }

    public String getFinancialExpenseRate() {
        return FinancialExpenseRate;
    }

    public void setFinancialExpenseRate(String financialExpenseRate) {
        FinancialExpenseRate = financialExpenseRate;
    }

    public String getCashReinvestmentRatio() {
        return CashReinvestmentRatio;
    }

    public void setCashReinvestmentRatio(String cashReinvestmentRatio) {
        CashReinvestmentRatio = cashReinvestmentRatio;
    }

    public String getNoncurrentAssetTurnover() {
        return NoncurrentAssetTurnover;
    }

    public void setNoncurrentAssetTurnover(String noncurrentAssetTurnover) {
        NoncurrentAssetTurnover = noncurrentAssetTurnover;
    }

    public String getBbdQyxxId() {
        return bbdQyxxId;
    }

    public void setBbdQyxxId(String bbdQyxxId) {
        this.bbdQyxxId = bbdQyxxId;
    }

    @Override
    public String toString() {
        return "TableSampleBondDefault{" +
                "id=" + id +
                ", 公司名称='" + 公司名称 + '\'' +
                ", 分数='" + 分数 + '\'' +
                ", AVAIDISTSHAREPROF='" + AVAIDISTSHAREPROF + '\'' +
                ", AVAIDISTPROF='" + AVAIDISTPROF + '\'' +
                ", Companycashflow='" + Companycashflow + '\'' +
                ", UNDIPROF='" + UNDIPROF + '\'' +
                ", FreeCashflowtocompany='" + FreeCashflowtocompany + '\'' +
                ", TOTALNONCLIAB='" + TOTALNONCLIAB + '\'' +
                ", WorkingCapital='" + WorkingCapital + '\'' +
                ", FinancialExpenseRate='" + FinancialExpenseRate + '\'' +
                ", FINEXPE='" + FINEXPE + '\'' +
                ", PREPtoLABOPAYC='" + PREPtoLABOPAYC + '\'' +
                ", TOTALSHARE='" + TOTALSHARE + '\'' +
                ", FINNETCFLOW='" + FINNETCFLOW + '\'' +
                ", FINNETCFLOW1='" + FINNETCFLOW1 + '\'' +
                ", COMPINCOAMT='" + COMPINCOAMT + '\'' +
                ", CashReinvestmentRatio='" + CashReinvestmentRatio + '\'' +
                ", NoncurrentAssetTurnover='" + NoncurrentAssetTurnover + '\'' +
                ", PARENETP='" + PARENETP + '\'' +
                ", NPCUT='" + NPCUT + '\'' +
                ", NETPROFIT='" + NETPROFIT + '\'' +
                ", CURFDS='" + CURFDS + '\'' +
                ", bbdQyxxId='" + bbdQyxxId + '\'' +
                '}';
    }
}