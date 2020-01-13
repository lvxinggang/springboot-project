package com.project.mes.systemmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.project.mes.systemmanage.bean.SysEmployee;
import com.project.mes.systemmanage.dao.SysEmployeeMapper;
import com.project.mes.systemmanage.service.SysEmployeeService;
import com.project.mes.util.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SysEmployeeServiceImpl implements SysEmployeeService {

    @Autowired
    private SysEmployeeMapper sysEmployeeMapper;

    @Override
    public int deleteByPrimaryKey(Long empid) {
        return sysEmployeeMapper.deleteByPrimaryKey(empid);
    }

    @Override
    public boolean insert(String params) {
        JSONObject jsonObject = JSONObject.parseObject(params);
        SysEmployee sysEmployee=new SysEmployee();
        sysEmployee.setEmpname(jsonObject.getString("empname"));
        sysEmployee.setEmpno(jsonObject.getString("empno"));
        sysEmployeeMapper.insert(sysEmployee);
        return true;
    }

    @Override
    public int insertSelective(SysEmployee record) {
        return sysEmployeeMapper.insertSelective(record);
    }

    @Override
    public SysEmployee selectByPrimaryKey(Long empid) {
        return sysEmployeeMapper.selectByPrimaryKey(empid);
    }

    @Override
    public int updateByPrimaryKeySelective(SysEmployee record) {
        return sysEmployeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(String params) {
        if (params!=null){
            JSONObject jsonObject = JSONObject.parseObject(params);
            SysEmployee sysEmployee=new SysEmployee();
            sysEmployee.setEmpid(jsonObject.getLong("empid"));
            sysEmployee.setEmpname(jsonObject.getString("empname"));
            sysEmployee.setEmpno(jsonObject.getString("empno"));
            sysEmployeeMapper.updateByPrimaryKey(sysEmployee);
            return true;
        }
        return false;
    }
    @Override
    public boolean deleteSysEmployee(String params) {
        if (params!=null&&!"".equals(params)){
            JSONObject jsonObject = JSONObject.parseObject(params);
            SysEmployee sysEmployee=new SysEmployee();
            sysEmployee.setEmpid(jsonObject.getLong("empid"));
            sysEmployee.setStatus(jsonObject.getString("status"));
            sysEmployeeMapper.deleteSysEmployee(sysEmployee);
            return true;
        }
        return false;
    }

    @Override
    public PageVo<SysEmployee> findSysEmployeeAll(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject(map);
        Integer currentPage = jsonObject.getInteger("currentPag");
        Integer pageSize = jsonObject.getInteger("pageSize");
        String name = jsonObject.getString("name");
        String type = jsonObject.getString("type");
        SysEmployee sysEmployee=new SysEmployee();
        sysEmployee.setEmpname(name);
        sysEmployee.setWorktype(type);
        int cameraeNum;
        if (pageSize <= 0) {
            cameraeNum = pageSize;
        } else {
            cameraeNum = sysEmployeeMapper.selectCount(sysEmployee);
        }
        PageVo<SysEmployee> pageVo = new PageVo<>(currentPage, pageSize, cameraeNum);
        pageVo.setTotalNum(cameraeNum);
        pageVo.setItems(sysEmployeeMapper.selectSysEmployeeAll(sysEmployee, pageVo.getStartIndex(), pageSize));
        return pageVo;
    }

    @Override
    public PageVo<SysEmployee> selectBySysEmployeeAll(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject(map);
        Integer currentPage = jsonObject.getInteger("currentPag");
        Integer pageSize = jsonObject.getInteger("pageSize");
        String name = jsonObject.getString("name");
        String type = jsonObject.getString("type");
        SysEmployee sysEmployee=new SysEmployee();
        sysEmployee.setEmpname(name);
        sysEmployee.setWorktype(type);
        int cameraeNum;
        if (pageSize <= 0) {
            cameraeNum = pageSize;
        } else {
            cameraeNum = sysEmployeeMapper.selectCount(sysEmployee);
        }
        PageVo<SysEmployee> pageVo = new PageVo<>(currentPage, pageSize, cameraeNum);
        pageVo.setTotalNum(cameraeNum);
        pageVo.setItems(sysEmployeeMapper.findAllBy(sysEmployee, pageVo.getStartIndex(), pageSize));
        return pageVo;
    }
}
