package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;

/**
 * dib_shares_actual_controller
 * @author 
 */
public class DibSharesActualController implements Serializable {
    private Integer id;

    private String secCode;

    private String actualContrName;

    private String citizeCountry;

    private String reportDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getActualContrName() {
        return actualContrName;
    }

    public void setActualContrName(String actualContrName) {
        this.actualContrName = actualContrName;
    }

    public String getCitizeCountry() {
        return citizeCountry;
    }

    public void setCitizeCountry(String citizeCountry) {
        this.citizeCountry = citizeCountry;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }
}