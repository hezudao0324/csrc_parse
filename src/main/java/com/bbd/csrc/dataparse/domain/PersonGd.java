package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;

/**
 * person_gd
 * @author 
 */
public class PersonGd implements Serializable {
    private Integer id;

    private String sec_code;

    private String shareh_name;

    private String share_perce;

    private String cninfo_year;

    private String share_nature;

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

    public String getShareh_name() {
        return shareh_name;
    }

    public void setShareh_name(String shareh_name) {
        this.shareh_name = shareh_name;
    }

    public String getShare_perce() {
        return share_perce;
    }

    public void setShare_perce(String share_perce) {
        this.share_perce = share_perce;
    }

    public String getCninfo_year() {
        return cninfo_year;
    }

    public void setCninfo_year(String cninfo_year) {
        this.cninfo_year = cninfo_year;
    }

    public String getShare_nature() {
        return share_nature;
    }

    public void setShare_nature(String share_nature) {
        this.share_nature = share_nature;
    }
}