package com.project.mes.systemmanage.dao;

import com.project.mes.systemmanage.bean.SysMenu;

import java.util.List;

public interface SysMenuMapper{
    int deleteByPrimaryKey(String menuid);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String menuid);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    List<SysMenu> findAll();
    List<SysMenu> findByParentnodeid(String menuid);
}
