package com.project.mes.systemmanage.service;


import com.project.mes.systemmanage.bean.SysEmployee;
import com.project.mes.util.PageVo;

import java.util.Map;

public interface SysEmployeeService {


    int deleteByPrimaryKey(Long empid);

    boolean insert(String params);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Long empid);

    int updateByPrimaryKeySelective(SysEmployee record);

    boolean updateByPrimaryKey(String params);
    boolean deleteSysEmployee(String params);
    PageVo<SysEmployee> findSysEmployeeAll(Map<String,Object> map);
    PageVo<SysEmployee> selectBySysEmployeeAll(Map<String,Object> map);

}
