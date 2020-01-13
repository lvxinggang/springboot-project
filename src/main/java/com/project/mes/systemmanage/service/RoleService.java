package com.project.mes.systemmanage.service;


import com.project.mes.systemmanage.bean.SysRole;
import com.project.mes.util.PageVo;

import java.util.Map;

/**
 * @Package: com.project.mes.systemmanage
 * @ClassName: PositionService
 * @Author: zhubingan
 * @Description: 角色管理实现层
 * @Date: 2020/1/9 11:17
 * @Version: 1.0
 */
public interface RoleService {

    PageVo<SysRole> selectRole(Map<String, Object> map);

    boolean insertRole(String params);

    boolean updateRole(String params);

    boolean deleteRole(String params);
}
