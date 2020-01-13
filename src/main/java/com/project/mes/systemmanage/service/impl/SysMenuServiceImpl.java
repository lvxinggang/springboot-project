package com.project.mes.systemmanage.service.impl;

import com.project.mes.systemmanage.dao.SysMenuMapper;
import com.project.mes.systemmanage.bean.SysMenu;
import com.project.mes.systemmanage.service.SysMenuService;
import com.project.mes.util.ResourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public int deleteByPrimaryKey(String menuid) {
        return sysMenuMapper.deleteByPrimaryKey(menuid);
    }

    @Override
    public int insert(SysMenu record) {
        return sysMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(SysMenu record) {
        return sysMenuMapper.insertSelective(record);
    }

    @Override
    public SysMenu selectByPrimaryKey(String menuid) {
        return sysMenuMapper.selectByPrimaryKey(menuid);
    }

    @Override
    public int updateByPrimaryKeySelective(SysMenu record) {
        return sysMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysMenu record) {
        return sysMenuMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysMenu> findAll() {
        return sysMenuMapper.findAll();
    }

    @Override
    public List<SysMenu> findByParentnodeid(String menuid) {
        System.out.println("**********************");
        List<SysMenu> sysMenus = sysMenuMapper.findByParentnodeid(menuid);
        ResourceUtil.getParentResource(sysMenus,sysMenuMapper);
        System.out.println("&&&&&&&&&&&&&&&&&");
        return sysMenus;
  }
}
