package com.project.mes.systemmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.project.mes.systemmanage.bean.SysCompany;
import com.project.mes.systemmanage.bean.SysOrganization;
import com.project.mes.systemmanage.dao.SysCompanyMapper;
import com.project.mes.systemmanage.dao.SysOrganizationMapper;
import com.project.mes.systemmanage.service.SysOrganizationService;
import com.project.mes.util.DataUill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class SysOrganizationServiceImpl implements SysOrganizationService {
    @Autowired
    private SysOrganizationMapper sysOrganizationMapper;
    @Autowired
    private SysCompanyMapper sysCompanyMapper;
    @Override
    public boolean addSysOrganization(String params) {

        JSONObject jsonObject = JSONObject.parseObject(params);
        //获取时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SysOrganization sysOrganization=null;

        if(params!=null&&!"".equals(params)){
            //添加工厂信息
            sysOrganization=new SysOrganization();
            sysOrganization.setOrgname(jsonObject.getString("orgname"));
            sysOrganization.setCorpid(jsonObject.getLong("corpid"));
            sysOrganization.setParentorgid(jsonObject.getLong("parentorgids"));
            sysOrganization.setLevel(jsonObject.getInteger("level"));
            sysOrganization.setTel(jsonObject.getString("tel"));
            sysOrganization.setAddress(jsonObject.getString("address"));
            Date dayStartTime = DataUill.getDayStartTime(new Date());
            sysOrganization.setOnworktime(sdf.format(dayStartTime));
            Date dayEndTime = DataUill.getDayEndTime(new Date());
            sysOrganization.setOffworktime(sdf.format(dayEndTime));
            sysOrganization.setContact(jsonObject.getString("contact"));
            sysOrganization.setContacttel(jsonObject.getString("contacttel"));
            sysOrganization.setManager1(jsonObject.getString("manager1"));
            sysOrganization.setManager1tel(jsonObject.getString("manager1tel"));
            sysOrganization.setManager2(jsonObject.getString("manager2"));
            sysOrganization.setManager2tel(jsonObject.getString("manager2tel"));
            sysOrganization.setInputempid(jsonObject.getLong("inputempid"));
            sysOrganization.setInputempname(jsonObject.getString("inputempname"));
            Date currentYearStartTime = DataUill.getCurrentYearStartTime();
            sysOrganization.setInputdatetime(currentYearStartTime);
            sysOrganization.setRemark(jsonObject.getString("remark"));
            sysOrganizationMapper.insert(sysOrganization);
            return true;
        }
        return false;
    }
//        JSONObject jsonObject = JSONObject.parseObject(params);
//        SysCompany sysCompany1=new SysCompany();
//        List<SysCompany> sysCompanies = sysCompanyMapper.selectSysCompanyAll();
//        for (SysCompany sysCompany : sysCompanies) {
//            System.out.println(sysCompany);
//        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SysOrganization sysOrganization=null;
//        SysOrganization sysOrganization1=null;
//        SysOrganization sysOrganization2=null;
//        for (SysCompany sysCompany : sysCompanies) {
//            if(sysCompany.getCorpId()!=null&&!"".equals(sysCompany.getCorpId())){
//                //添加工厂信息
//                sysOrganization=new SysOrganization();
//                sysOrganization.setOrgname(jsonObject.getString("orgname"));
//                sysOrganization.setCorpid(jsonObject.getLong("corpid"));
//                sysOrganization.setParentorgid(sysCompany.getCorpId());
//                sysOrganization.setTel(jsonObject.getString("tel"));
//                sysOrganization.setAddress(jsonObject.getString("address"));
//                Date dayStartTime = DataUill.getDayStartTime(new Date());
//                sysOrganization.setOnworktime(sdf.format(dayStartTime));
//                Date dayEndTime = DataUill.getDayEndTime(new Date());
//                sysOrganization.setOffworktime(sdf.format(dayEndTime));
//                sysOrganization.setContact(jsonObject.getString("contact"));
//                sysOrganization.setContacttel(jsonObject.getString("contacttel"));
//                sysOrganization.setManager1(jsonObject.getString("manager1"));
//                sysOrganization.setManager1tel(jsonObject.getString("manager1tel"));
//                sysOrganization.setManager2(jsonObject.getString("manager2"));
//                sysOrganization.setManager2tel(jsonObject.getString("manager2tel"));
//                sysOrganization.setInputempid(jsonObject.getLong("inputempid"));
//                sysOrganization.setInputempname(jsonObject.getString("inputempname"));
//                Date currentYearStartTime = DataUill.getCurrentYearStartTime();
//                sysOrganization.setInputdatetime(currentYearStartTime);
//                sysOrganization.setRemark(jsonObject.getString("remark"));
//                sysOrganizationMapper.insert(sysOrganization);
//        }
//            //添加车间信息
//            if(sysOrganization.getOrgid()!=null&&!"".equals(sysOrganization.getOrgid())){
//                sysOrganization1=new SysOrganization();
//                sysOrganization1.setOrgname(jsonObject.getString("orgname"));
//                sysOrganization1.setCorpid(jsonObject.getLong("corpid"));
//                Long orgids = sysOrganization.getOrgid();
//                sysOrganization1.setParentorgid((long) orgids);
//                sysOrganization1.setTel(jsonObject.getString("tel"));
//                sysOrganization1.setAddress(jsonObject.getString("address"));
//                Date dayStartTime1 = DataUill.getDayStartTime(new Date());
//                sysOrganization1.setOnworktime(sdf.format(dayStartTime1));
//                Date dayEndTime1 = DataUill.getDayEndTime(new Date());
//                sysOrganization1.setOffworktime(sdf.format(dayEndTime1));
//                sysOrganization1.setContact(jsonObject.getString("contact"));
//                sysOrganization1.setContacttel(jsonObject.getString("contacttel"));
//                sysOrganization1.setManager1(jsonObject.getString("manager1"));
//                sysOrganization1.setManager1tel(jsonObject.getString("manager1tel"));
//                sysOrganization1.setManager2(jsonObject.getString("manager2"));
//                sysOrganization1.setManager2tel(jsonObject.getString("manager2tel"));
//                sysOrganization1.setInputempid(jsonObject.getLong("inputempid"));
//                sysOrganization1.setInputempname(jsonObject.getString("inputempname"));
//                Date currentYearStartTime1 = DataUill.getCurrentYearStartTime();
//                sysOrganization1.setInputdatetime(currentYearStartTime1);
//                sysOrganization1.setRemark(jsonObject.getString("remark"));
//                sysOrganizationMapper.insert(sysOrganization1);
//            }
//
//            //添加班组信息
//            if(sysOrganization1.getOrgid()!=null&&!"".equals(sysOrganization1.getOrgid())){
//                sysOrganization2=new SysOrganization();
//                sysOrganization2.setOrgname(jsonObject.getString("orgname"));
//                sysOrganization2.setCorpid(jsonObject.getLong("corpid"));
//                Long orgids1 = sysOrganization1.getOrgid();
//                sysOrganization2.setParentorgid((long) orgids1);
//                sysOrganization2.setTel(jsonObject.getString("tel"));
//                sysOrganization2.setAddress(jsonObject.getString("address"));
//                Date dayStartTime2 = DataUill.getDayStartTime(new Date());
//                sysOrganization2.setOnworktime(sdf.format(dayStartTime2));
//                Date dayEndTime2 = DataUill.getDayEndTime(new Date());
//                sysOrganization2.setOffworktime(sdf.format(dayEndTime2));
//                sysOrganization2.setContact(jsonObject.getString("contact"));
//                sysOrganization2.setContacttel(jsonObject.getString("contacttel"));
//                sysOrganization2.setManager1(jsonObject.getString("manager1"));
//                sysOrganization2.setManager1tel(jsonObject.getString("manager1tel"));
//                sysOrganization2.setManager2(jsonObject.getString("manager2"));
//                sysOrganization2.setManager2tel(jsonObject.getString("manager2tel"));
//                sysOrganization2.setInputempid(jsonObject.getLong("inputempid"));
//                sysOrganization2.setInputempname(jsonObject.getString("inputempname"));
//                Date currentYearStartTime2 = DataUill.getCurrentYearStartTime();
//                sysOrganization2.setInputdatetime(currentYearStartTime2);
//                sysOrganization2.setRemark(jsonObject.getString("remark"));
//                sysOrganizationMapper.insert(sysOrganization2);
//            }
//            return true;
//        }
//        return false;

}
