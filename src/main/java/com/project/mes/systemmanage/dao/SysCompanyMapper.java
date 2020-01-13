package com.project.mes.systemmanage.dao;

import com.project.mes.systemmanage.bean.SysCompany;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 *
 */
public interface SysCompanyMapper {
    List<SysCompany> findAll(@Param("sysCompany") SysCompany sysCompany,@Param("startIndex")  Integer startIndex,@Param("pageSize")  Integer pageSize);
    int findAllCount(@Param("sysCompany") SysCompany sysCompany);
    void addSysCompany(@Param("sysCompany") SysCompany sysCompany);
    void updateSysCompany(@Param("sysCompany") SysCompany sysCompany);
    void deleteSysCompany(@Param("corpId") Long corpId);
    List<SysCompany> selectSysCompanyAll();
}
