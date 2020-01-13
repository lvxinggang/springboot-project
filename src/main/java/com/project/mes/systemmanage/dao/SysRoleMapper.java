package com.project.mes.systemmanage.dao;


import com.project.mes.systemmanage.bean.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    int countRole(@Param("sysRole") SysRole sysRole);

    List<SysRole> selectRole(@Param("sysRole") SysRole sysRole, @Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize);
}