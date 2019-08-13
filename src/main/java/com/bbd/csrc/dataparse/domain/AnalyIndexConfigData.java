package com.bbd.csrc.dataparse.domain;

import java.io.Serializable;

/**
 * analy_index_config_data
 * @author 
 */
public class AnalyIndexConfigData implements Serializable {
    private Integer id;

    /**
     * 列名
     */
    private String name;

    /**
     * 一级分类Id
     */
    private Integer one;

    /**
     * 二级分类Id
     */
    private Integer two;

    /**
     * 风险类型
     */
    private Integer type;

    private Integer parentType;

    private String comment;

    /**
     * 权重分数-洋气
     */
    private String score;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AnalyIndexConfigData other = (AnalyIndexConfigData) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOne() == null ? other.getOne() == null : this.getOne().equals(other.getOne()))
            && (this.getTwo() == null ? other.getTwo() == null : this.getTwo().equals(other.getTwo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getParentType() == null ? other.getParentType() == null : this.getParentType().equals(other.getParentType()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOne() == null) ? 0 : getOne().hashCode());
        result = prime * result + ((getTwo() == null) ? 0 : getTwo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getParentType() == null) ? 0 : getParentType().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", one=").append(one);
        sb.append(", two=").append(two);
        sb.append(", type=").append(type);
        sb.append(", parentType=").append(parentType);
        sb.append(", comment=").append(comment);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}