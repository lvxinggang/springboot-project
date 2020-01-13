package com.project.mes.systemmanage.service;

import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysCompany;
import com.project.mes.util.PageVo;

import java.util.List;
import java.util.Map;

public interface SysCompanyService {
    PageVo<SysCompany> findAll(Map<String,Object> map);
    boolean addSysCompany(String params);
    boolean updateSysCompany(String params);
    boolean deleteSysCompany(Long corpId);
    //PageVo<SysCompany> selectAll(Map<String,Object> map);
}
