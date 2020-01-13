package com.project.mes.systemmanage.dao;


import com.project.mes.systemmanage.bean.SysOrganization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysOrganizationMapper {
    int deleteByPrimaryKey(Long orgid);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    SysOrganization selectByPrimaryKey(Long orgid);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
    List<SysOrganization> selectSysOrganizationAll();
    int insertBySysOrganization(@Param("sysOrganization") SysOrganization sysOrganization);
}