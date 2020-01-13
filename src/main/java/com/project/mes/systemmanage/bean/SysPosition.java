package com.project.mes.systemmanage.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SysPosition implements Serializable {
    /**
     * 岗位ID
     */
    private Long postid;

    /**
     * 岗位名称
     */
    private String postname;

    /**
     * 所属企业ID
     */
    private Long corpid;

    /**
     * 录入人ID
     */
    private Long inputempid;

    /**
     * 录入人姓名
     */
    private String inputempname;

    /**
     * 录入时间
     */
    private Date inputdatetime;

    private String remark;

    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Long getCorpid() {
        return corpid;
    }

    public void setCorpid(Long corpid) {
        this.corpid = corpid;
    }

    public Long getInputempid() {
        return inputempid;
    }

    public void setInputempid(Long inputempid) {
        this.inputempid = inputempid;
    }

    public String getInputempname() {
        return inputempname;
    }

    public void setInputempname(String inputempname) {
        this.inputempname = inputempname;
    }

    public Date getInputdatetime() {
        return inputdatetime;
    }

    public void setInputdatetime(Date inputdatetime) {
        this.inputdatetime = inputdatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



}
