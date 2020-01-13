package com.project.mes.systemmanage.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysRole implements Serializable {
    /**
     * 角色ID
     */
    private Long roleid;

    /**
     * 角色名称
     */
    private String rolename;

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
     * 录入日期
     */
    private Date inputdatetime;

    /**
     * 备注
     */
    private String remark;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
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
