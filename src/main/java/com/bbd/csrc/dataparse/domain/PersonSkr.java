package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;

/**
 * person_skr
 * @author 
 */
public class PersonSkr implements Serializable {
    private Integer id;

    private String sec_code;

    private String actual_contr_name;

    private String citize_country;

    private String report_date;

    private static final long serialVersionUID = 1L;

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
        this.sec_code = sec_code;
    }

    public String getActual_contr_name() {
        return actual_contr_name;
    }

    public void setActual_contr_name(String actual_contr_name) {
        this.actual_contr_name = actual_contr_name;
    }

    public String getCitize_country() {
        return citize_country;
    }

    public void setCitize_country(String citize_country) {
        this.citize_country = citize_country;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }
}