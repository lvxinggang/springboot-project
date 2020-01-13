package com.project.mes.systemmanage.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SysOrganization implements Serializable {
    /**
    * 工厂／车间／班组等组织ID
    */
    private Long orgid;

    /**
    * 组织名称
    */
    private String orgname;

    /**
    * 所属企业ID
    */
    private Long corpid;

    /**
    * 上级组织ID
    */
    private Long parentorgid;
    /**
     * 层级，最多4层：企业1工厂2车间3班组4
     */
    private Integer level;

    /**
    * 电话
    */
    private String tel;

    /**
    * 地址
    */
    private String address;

    /**
    * 上班时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String onworktime;

    /**
    * 下班时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String offworktime;

    /**
    * 联系人
    */
    private String contact;

    /**
    * 联系人电话
    */
    private String contacttel;

    /**
    * 管理人员1
    */
    private String manager1;

    /**
    * 管理人员1电话
    */
    private String manager1tel;

    /**
    * 管理人员2
    */
    private String manager2;

    /**
    * 管理人员2电话
    */
    private String manager2tel;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inputdatetime;

    /**
    * 备注
    */
    private String remark;
    /**
     * 一个企业对多个工厂,一个工厂对多个车间,一个车间对多个班组
     */
    private List<SysOrganization> factoryChild;
//    /**
//     * 一个工厂对多个车间
//     */
//    private List<SysOrganization> workshopChild;
//    /**
//     * 一个车间对多个班组
//     */
//    private List<SysOrganization> teamChild;


    public SysOrganization() {
    }

    @Override
    public String toString() {
        return "SysOrganization{" +
                "orgid=" + orgid +
                ", orgname='" + orgname + '\'' +
                ", corpid=" + corpid +
                ", parentorgid=" + parentorgid +
                ", level=" + level +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", onworktime='" + onworktime + '\'' +
                ", offworktime='" + offworktime + '\'' +
                ", contact='" + contact + '\'' +
                ", contacttel='" + contacttel + '\'' +
                ", manager1='" + manager1 + '\'' +
                ", manager1tel='" + manager1tel + '\'' +
                ", manager2='" + manager2 + '\'' +
                ", manager2tel='" + manager2tel + '\'' +
                ", inputempid=" + inputempid +
                ", inputempname='" + inputempname + '\'' +
                ", inputdatetime=" + inputdatetime +
                ", remark='" + remark + '\'' +
                ", factoryChild=" + factoryChild +
                '}';
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public Long getCorpid() {
        return corpid;
    }

    public void setCorpid(Long corpid) {
        this.corpid = corpid;
    }

    public Long getParentorgid() {
        return parentorgid;
    }

    public void setParentorgid(Long parentorgid) {
        this.parentorgid = parentorgid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOnworktime() {
        return onworktime;
    }

    public void setOnworktime(String onworktime) {
        this.onworktime = onworktime;
    }

    public String getOffworktime() {
        return offworktime;
    }

    public void setOffworktime(String offworktime) {
        this.offworktime = offworktime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public String getManager1() {
        return manager1;
    }

    public void setManager1(String manager1) {
        this.manager1 = manager1;
    }

    public String getManager1tel() {
        return manager1tel;
    }

    public void setManager1tel(String manager1tel) {
        this.manager1tel = manager1tel;
    }

    public String getManager2() {
        return manager2;
    }

    public void setManager2(String manager2) {
        this.manager2 = manager2;
    }

    public String getManager2tel() {
        return manager2tel;
    }

    public void setManager2tel(String manager2tel) {
        this.manager2tel = manager2tel;
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

    public List<SysOrganization> getFactoryChild() {
        return factoryChild;
    }

    public void setFactoryChild(List<SysOrganization> factoryChild) {
        this.factoryChild = factoryChild;
    }

    public SysOrganization(Long orgid, String orgname, Long corpid, Long parentorgid, Integer level, String tel, String address, String onworktime, String offworktime, String contact, String contacttel, String manager1, String manager1tel, String manager2, String manager2tel, Long inputempid, String inputempname, Date inputdatetime, String remark, List<SysOrganization> factoryChild) {
        this.orgid = orgid;
        this.orgname = orgname;
        this.corpid = corpid;
        this.parentorgid = parentorgid;
        this.level = level;
        this.tel = tel;
        this.address = address;
        this.onworktime = onworktime;
        this.offworktime = offworktime;
        this.contact = contact;
        this.contacttel = contacttel;
        this.manager1 = manager1;
        this.manager1tel = manager1tel;
        this.manager2 = manager2;
        this.manager2tel = manager2tel;
        this.inputempid = inputempid;
        this.inputempname = inputempname;
        this.inputdatetime = inputdatetime;
        this.remark = remark;
        this.factoryChild = factoryChild;
    }
}