package com.bbd.csrc.dataparse.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * table_sample_illegal_guarantee
 * @author 
 */
@Data
public class TableSampleIllegalGuarantee implements Serializable {
    private Integer id;

    private String 公司名称;

    private String 分数;

    private String PARESHARRIGH;

    private String NONOREVE;

    private String PAYTAX;

    private String ACCOPAYA;


    private String ACQUASSETCASH;
    private String RIGHAGGR;

    private String INCOTAXEXPE;

    private String EPSFULLDILUTED;

    private String DILUTEDEPS;

    private String EPSBASIC;

    private String TOTALCURRLIAB;

    private String BASICEPS;

    private String INVEREDU;

    private String ADVAPAYM;

    private String BIZTAX;

    private String PAYAINCR;

    private String EequityTurnovertrend;

    private String OTHERRECE;

    private String TOTALNONCLIAB;

    private String TOTALNONCASSETS;

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

    public String getPARESHARRIGH() {
        return PARESHARRIGH;
    }

    public void setPARESHARRIGH(String PARESHARRIGH) {
        this.PARESHARRIGH = PARESHARRIGH;
    }

    public String getNONOREVE() {
        return NONOREVE;
    }

    public void setNONOREVE(String NONOREVE) {
        this.NONOREVE = NONOREVE;
    }

    public String getPAYTAX() {
        return PAYTAX;
    }

    public void setPAYTAX(String PAYTAX) {
        this.PAYTAX = PAYTAX;
    }

    public String getACCOPAYA() {
        return ACCOPAYA;
    }

    public void setACCOPAYA(String ACCOPAYA) {
        this.ACCOPAYA = ACCOPAYA;
    }

    public String getRIGHAGGR() {
        return RIGHAGGR;
    }

    public void setRIGHAGGR(String RIGHAGGR) {
        this.RIGHAGGR = RIGHAGGR;
    }

    public String getACQUASSETCASH() {
        return ACQUASSETCASH;
    }

    public void setACQUASSETCASH(String ACQUASSETCASH) {
        this.ACQUASSETCASH = ACQUASSETCASH;
    }

    public String getINCOTAXEXPE() {
        return INCOTAXEXPE;
    }

    public void setINCOTAXEXPE(String INCOTAXEXPE) {
        this.INCOTAXEXPE = INCOTAXEXPE;
    }

    public String getEPSFULLDILUTED() {
        return EPSFULLDILUTED;
    }

    public void setEPSFULLDILUTED(String EPSFULLDILUTED) {
        this.EPSFULLDILUTED = EPSFULLDILUTED;
    }

    public String getDILUTEDEPS() {
        return DILUTEDEPS;
    }

    public void setDILUTEDEPS(String DILUTEDEPS) {
        this.DILUTEDEPS = DILUTEDEPS;
    }

    public String getEPSBASIC() {
        return EPSBASIC;
    }

    public void setEPSBASIC(String EPSBASIC) {
        this.EPSBASIC = EPSBASIC;
    }

    public String getTOTALCURRLIAB() {
        return TOTALCURRLIAB;
    }

    public void setTOTALCURRLIAB(String TOTALCURRLIAB) {
        this.TOTALCURRLIAB = TOTALCURRLIAB;
    }

    public String getBASICEPS() {
        return BASICEPS;
    }

    public void setBASICEPS(String BASICEPS) {
        this.BASICEPS = BASICEPS;
    }

    public String getINVEREDU() {
        return INVEREDU;
    }

    public void setINVEREDU(String INVEREDU) {
        this.INVEREDU = INVEREDU;
    }

    public String getADVAPAYM() {
        return ADVAPAYM;
    }

    public void setADVAPAYM(String ADVAPAYM) {
        this.ADVAPAYM = ADVAPAYM;
    }

    public String getBIZTAX() {
        return BIZTAX;
    }

    public void setBIZTAX(String BIZTAX) {
        this.BIZTAX = BIZTAX;
    }

    public String getPAYAINCR() {
        return PAYAINCR;
    }

    public void setPAYAINCR(String PAYAINCR) {
        this.PAYAINCR = PAYAINCR;
    }

    public String getEequityTurnovertrend() {
        return EequityTurnovertrend;
    }

    public void setEequityTurnovertrend(String eequityTurnovertrend) {
        EequityTurnovertrend = eequityTurnovertrend;
    }

    public String getOTHERRECE() {
        return OTHERRECE;
    }

    public void setOTHERRECE(String OTHERRECE) {
        this.OTHERRECE = OTHERRECE;
    }

    public String getTOTALNONCLIAB() {
        return TOTALNONCLIAB;
    }

    public void setTOTALNONCLIAB(String TOTALNONCLIAB) {
        this.TOTALNONCLIAB = TOTALNONCLIAB;
    }

    public String getTOTALNONCASSETS() {
        return TOTALNONCASSETS;
    }

    public void setTOTALNONCASSETS(String TOTALNONCASSETS) {
        this.TOTALNONCASSETS = TOTALNONCASSETS;
    }

    public String getBbdQyxxId() {
        return bbdQyxxId;
    }

    public void setBbdQyxxId(String bbdQyxxId) {
        this.bbdQyxxId = bbdQyxxId;
    }

    @Override
    public String toString() {
        return "TableSampleIllegalGuarantee{" +
                "id=" + id +
                ", 公司名称='" + 公司名称 + '\'' +
                ", 分数='" + 分数 + '\'' +
                ", PARESHARRIGH='" + PARESHARRIGH + '\'' +
                ", NONOREVE='" + NONOREVE + '\'' +
                ", PAYTAX='" + PAYTAX + '\'' +
                ", ACCOPAYA='" + ACCOPAYA + '\'' +
                ", ACQUASSETCASH='" + ACQUASSETCASH + '\'' +
                ", RIGHAGGR='" + RIGHAGGR + '\'' +
                ", INCOTAXEXPE='" + INCOTAXEXPE + '\'' +
                ", EPSFULLDILUTED='" + EPSFULLDILUTED + '\'' +
                ", DILUTEDEPS='" + DILUTEDEPS + '\'' +
                ", EPSBASIC='" + EPSBASIC + '\'' +
                ", TOTALCURRLIAB='" + TOTALCURRLIAB + '\'' +
                ", BASICEPS='" + BASICEPS + '\'' +
                ", INVEREDU='" + INVEREDU + '\'' +
                ", ADVAPAYM='" + ADVAPAYM + '\'' +
                ", BIZTAX='" + BIZTAX + '\'' +
                ", PAYAINCR='" + PAYAINCR + '\'' +
                ", EequityTurnovertrend='" + EequityTurnovertrend + '\'' +
                ", OTHERRECE='" + OTHERRECE + '\'' +
                ", TOTALNONCLIAB='" + TOTALNONCLIAB + '\'' +
                ", TOTALNONCASSETS='" + TOTALNONCASSETS + '\'' +
                ", bbdQyxxId='" + bbdQyxxId + '\'' +
                '}';
    }
}