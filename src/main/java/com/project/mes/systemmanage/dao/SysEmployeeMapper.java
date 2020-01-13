package com.project.mes.systemmanage.dao;

import com.project.mes.systemmanage.bean.SysEmployee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysEmployeeMapper {
    /**
     * @param empid
     * @return
     */
    int deleteByPrimaryKey(Long empid);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Long empid);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
    List<SysEmployee> selectSysEmployeeAll(@Param("sysEmployee") SysEmployee sysEmployee, @Param("startIndex")  Integer startIndex, @Param("pageSize")  Integer pageSize);
    int selectCount(@Param("sysEmployee") SysEmployee sysEmployee);
    void deleteSysEmployee(@Param("sysEmployee") SysEmployee sysEmployee);
    List<SysEmployee> findAllBy(@Param("sysEmployee") SysEmployee sysEmployee, @Param("startIndex")  Integer startIndex, @Param("pageSize")  Integer pageSize);
    int selectByCount(@Param("sysEmployee") SysEmployee sysEmployee);
}