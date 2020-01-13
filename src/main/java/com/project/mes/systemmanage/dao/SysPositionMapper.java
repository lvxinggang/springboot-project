package com.project.mes.systemmanage.dao;

import org.apache.ibatis.annotations.Param;

import com.project.mes.systemmanage.bean.SysPosition;

import java.util.List;

public interface SysPositionMapper {
    int deleteByPrimaryKey(Long postid);

    int insert(SysPosition record);

    int insertSelective(SysPosition record);

    SysPosition selectByPrimaryKey(Long postid);

    int updateByPrimaryKeySelective(SysPosition record);

    int updateByPrimaryKey(SysPosition record);

    int countPosition(@Param("sysPosition") SysPosition sysPosition);

    List<SysPosition> selectPosition(@Param("sysPosition") SysPosition sysPosition, @Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize);
}