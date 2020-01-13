package com.project.mes.systemmanage.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
public class SysCompany implements Serializable {
    //企业id
    private Long corpId;
    //企业名称
    private String corpName;
    //法人代表
    private String legalPerson;
    //组织机构编码
    private String orgCode;
    //联系人
    private String contact;
    //联系人电话
    private String contactTel;
    //财务人员
    private String finance;
    //财务人员电话
    private String financeTel;
    //地址
    private String address;
    //电话
    private String tel;
    //传真
    private String fax;
    //银行卡号/账号
    private String cardNo;
    //开户银行
    private String cardBank;
    //户头
    private String accountName;
    //服务启用时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date serviceUseDateTime;
    //服务终止时间,空代表永久
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date serviceStopDateTime;
    //录入人ID
    private String inputEmpId;
    //录入人姓名
    private String inputEmpName;
    //录入时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inputDateTime;
    //停用操作人ID
    private String stopEmpId;
    //停用操作人姓名
    private String stopEmpName;
    //停用操作时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopDateTime;
    //1启用0停用
    private String status;
    //备注
    private String remark;

    @Override
    public String toString() {
        return "SysCompany{" +
                "corpId=" + corpId +
                ", corpName='" + corpName + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", contact='" + contact + '\'' +
                ", contactTel='" + contactTel + '\'' +
                ", finance='" + finance + '\'' +
                ", financeTel='" + financeTel + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", fax='" + fax + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cardBank='" + cardBank + '\'' +
                ", accountName='" + accountName + '\'' +
                ", serviceUseDateTime=" + serviceUseDateTime +
                ", serviceStopDateTime=" + serviceStopDateTime +
                ", inputEmpId='" + inputEmpId + '\'' +
                ", inputEmpName='" + inputEmpName + '\'' +
                ", inputDateTime=" + inputDateTime +
                ", stopEmpId='" + stopEmpId + '\'' +
                ", stopEmpName='" + stopEmpName + '\'' +
                ", stopDateTime=" + stopDateTime +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getFinanceTel() {
        return financeTel;
    }

    public void setFinanceTel(String financeTel) {
        this.financeTel = financeTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardBank() {
        return cardBank;
    }

    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getServiceUseDateTime() {
        return serviceUseDateTime;
    }

    public void setServiceUseDateTime(Date serviceUseDateTime) {
        this.serviceUseDateTime = serviceUseDateTime;
    }

    public Date getServiceStopDateTime() {
        return serviceStopDateTime;
    }

    public void setServiceStopDateTime(Date serviceStopDateTime) {
        this.serviceStopDateTime = serviceStopDateTime;
    }

    public String getInputEmpId() {
        return inputEmpId;
    }

    public void setInputEmpId(String inputEmpId) {
        this.inputEmpId = inputEmpId;
    }

    public String getInputEmpName() {
        return inputEmpName;
    }

    public void setInputEmpName(String inputEmpName) {
        this.inputEmpName = inputEmpName;
    }

    public Date getInputDateTime() {
        return inputDateTime;
    }

    public void setInputDateTime(Date inputDateTime) {
        this.inputDateTime = inputDateTime;
    }

    public String getStopEmpId() {
        return stopEmpId;
    }

    public void setStopEmpId(String stopEmpId) {
        this.stopEmpId = stopEmpId;
    }

    public String getStopEmpName() {
        return stopEmpName;
    }

    public void setStopEmpName(String stopEmpName) {
        this.stopEmpName = stopEmpName;
    }

    public Date getStopDateTime() {
        return stopDateTime;
    }

    public void setStopDateTime(Date stopDateTime) {
        this.stopDateTime = stopDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public SysCompany() {
    }

    public SysCompany(Long corpId, String corpName, String legalPerson, String orgCode, String contact, String contactTel, String finance, String financeTel, String address, String tel, String fax, String cardNo, String cardBank, String accountName, Date serviceUseDateTime, Date serviceStopDateTime, String inputEmpId, String inputEmpName, Date inputDateTime, String stopEmpId, String stopEmpName, Date stopDateTime, String status, String remark) {
        this.corpId = corpId;
        this.corpName = corpName;
        this.legalPerson = legalPerson;
        this.orgCode = orgCode;
        this.contact = contact;
        this.contactTel = contactTel;
        this.finance = finance;
        this.financeTel = financeTel;
        this.address = address;
        this.tel = tel;
        this.fax = fax;
        this.cardNo = cardNo;
        this.cardBank = cardBank;
        this.accountName = accountName;
        this.serviceUseDateTime = serviceUseDateTime;
        this.serviceStopDateTime = serviceStopDateTime;
        this.inputEmpId = inputEmpId;
        this.inputEmpName = inputEmpName;
        this.inputDateTime = inputDateTime;
        this.stopEmpId = stopEmpId;
        this.stopEmpName = stopEmpName;
        this.stopDateTime = stopDateTime;
        this.status = status;
        this.remark = remark;
    }
}
