package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;

/**
 * dib_shares_major_shareholder_info
 * @author 
 */
public class DibSharesMajorShareholderInfoWithBLOBs extends DibSharesMajorShareholderInfo implements Serializable {
    /**
     * 股东关联关系或一致行动的说明
     */
    private String relatedPartiesChange;

    /**
     * 战略投资者或一般法人因配售新股成为前10名股东的情况
     */
    private String strategicInvestors;

    /**
     * 股东关联关系或一致行动的说明
     */
    private String relatedParties;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getRelatedPartiesChange() {
        return relatedPartiesChange;
    }

    public void setRelatedPartiesChange(String relatedPartiesChange) {
        this.relatedPartiesChange = relatedPartiesChange;
    }

    public String getStrategicInvestors() {
        return strategicInvestors;
    }

    public void setStrategicInvestors(String strategicInvestors) {
        this.strategicInvestors = strategicInvestors;
    }

    public String getRelatedParties() {
        return relatedParties;
    }

    public void setRelatedParties(String relatedParties) {
        this.relatedParties = relatedParties;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}