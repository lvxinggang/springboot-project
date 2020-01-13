package com.project.mes.systemmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.project.mes.result.Result;
import com.project.mes.systemmanage.dao.SysCompanyMapper;
import com.project.mes.systemmanage.bean.SysCompany;
import com.project.mes.systemmanage.service.SysCompanyService;
import com.project.mes.util.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SysCompanyServiceImpl implements SysCompanyService {
    @Autowired
    private SysCompanyMapper sysCompanyMapper;

    @Override
    public PageVo<SysCompany> findAll(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject(map);
        Integer currentPage = jsonObject.getInteger("currentPag");
        Integer pageSize = jsonObject.getInteger("pageSize");
        String name = jsonObject.getString("name");
        String org = jsonObject.getString("org");
        SysCompany sysCompany=new SysCompany();
        sysCompany.setCorpName(name);
        sysCompany.setOrgCode(org);
        int cameraeNum;
        if (pageSize <= 0) {
            cameraeNum = pageSize;
        } else {
            cameraeNum = sysCompanyMapper.findAllCount(sysCompany);
        }
        PageVo<SysCompany> pageVo = new PageVo<>(currentPage, pageSize, cameraeNum);
        pageVo.setTotalNum(cameraeNum);
        pageVo.setItems(sysCompanyMapper.findAll(sysCompany, pageVo.getStartIndex(), pageSize));
        return pageVo;
    }

    @Override
    public boolean addSysCompany(String params) {
                JSONObject jsonObject = JSONObject.parseObject(params);
                SysCompany sysCompany=new SysCompany();
                sysCompany.setCorpName(jsonObject.getString("corpName"));
                sysCompany.setLegalPerson(jsonObject.getString("legalPerson"));
                Date date = new Date(System.currentTimeMillis());
                sysCompany.setInputDateTime(jsonObject.getDate("date"));
                Date date1 = new Date(System.currentTimeMillis());
                sysCompany.setStopDateTime(jsonObject.getDate("date1"));
                Date date2 = new Date(System.currentTimeMillis());
                sysCompany.setServiceUseDateTime(jsonObject.getDate("date2"));
                Date date3 = new Date(System.currentTimeMillis());
                sysCompany.setServiceStopDateTime(jsonObject.getDate("date3"));
                sysCompanyMapper.addSysCompany(sysCompany);
                 return true;
    }

    @Override
    public boolean updateSysCompany(String params) {
                if(params!=null){
                    JSONObject jsonObject = JSONObject.parseObject(params);
                    SysCompany sysCompany=new SysCompany();
                    sysCompany.setCorpId(jsonObject.getLong("corpId"));
                    sysCompany.setCorpName(jsonObject.getString("corpName"));
                    sysCompany.setLegalPerson(jsonObject.getString("legalPerson"));
                    Date date = new Date(System.currentTimeMillis());
                    sysCompany.setInputDateTime(date);
                    Date date1 = new Date(System.currentTimeMillis());
                    sysCompany.setStopDateTime(date1);
                    Date date2 = new Date(System.currentTimeMillis());
                    sysCompany.setServiceUseDateTime(date2);
                    Date date3 = new Date(System.currentTimeMillis());
                    sysCompany.setServiceStopDateTime(date3);
                    sysCompanyMapper.updateSysCompany(sysCompany);
                    return true;
                }
                return  false;
    }

    @Override
    public boolean deleteSysCompany(Long corpId) {
        if(corpId!=null&&!"".equals(corpId)){
            sysCompanyMapper.deleteSysCompany(corpId);
            return true;
        }
        return false;
    }

//    @Override
//    public PageVo<SysCompany> selectAll(Map<String, Object> map) {
//        JSONObject jsonObject = new JSONObject(map);
//        PageVo<SysCompany> pageVo = new PageVo<>();
//        pageVo.setItems(sysCompanyMapper.selectSysCompanyAll());
//        return pageVo;
//    }
}
