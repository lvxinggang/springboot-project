package com.project.mes.systemmanage.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SysEmployee implements Serializable {
    /**
    * 人员ID
    */
    private Long empid;

    /**
    * 人员姓名
    */
    private String empname;

    /**
    * 工号
    */
    private String empno;

    /**
    * 性别
    */
    private String sex;

    /**
    * 生日
    */
    private String birthday;

    /**
    * 身份证号
    */
    private String idcardno;

    /**
    * 入职日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date indate;

    /**
    * 离职日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date outdate;

    /**
    * 工种：HS后勤管理，PM生产管理，生产工人PW
    */
    private String worktype;

    /**
    * 所属企业ID
    */
    private Long corpid;
    /**
     * 所属工厂ID
     */
    private Long factoryid;
    /**
     * 所属车间ID
     */
    private Long workShopid;
    /**
     * 所属班组ID
     */
    private Long classid;

    /**
    * 岗位ID
    */
    private Long posid;

    /**
    * 银行卡号
    */
    private String cardno;

    /**
    * 开户银行
    */
    private String cardbank;

    /**
    * 联系电话
    */
    private String tel;

    /**
    * 邮件
    */
    private String email;

    /**
    * MD5加密
    */
    private String passwd;

    /**
    * 录入人ID
    */
    private String inputempid;

    /**
    * 录入人姓名
    */
    private String inputempname;

    /**
    * 录入日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date inputdatetime;
    /**
    * 备注
    */
    private String remark;

    /**
    * 1：在职；2：暂停；3：离职；4：作废
    */
    private String status;
}