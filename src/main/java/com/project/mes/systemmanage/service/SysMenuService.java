package com.project.mes.systemmanage.service;

import com.project.mes.systemmanage.bean.SysMenu;

import java.util.List;

public interface SysMenuService {
    int deleteByPrimaryKey(String menuid);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String menuid);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    List<SysMenu> findAll();
    List<SysMenu> findByParentnodeid(String menuid);
}
