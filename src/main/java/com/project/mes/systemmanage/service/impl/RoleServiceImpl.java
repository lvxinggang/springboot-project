package com.project.mes.systemmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.project.mes.systemmanage.bean.SysRole;
import com.project.mes.systemmanage.dao.SysRoleMapper;
import com.project.mes.systemmanage.service.RoleService;
import com.project.mes.util.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Package: com.project.mes.systemmanage.service.impl
 * @ClassName: RoleServiceImpl
 * @Author: zhubingan
 * @Description:
 * @Date: 2020/1/9 11:18
 * @Version: 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    /**
     * 查询全部角色信息
     *
     * @param map
     * @return
     */
    @Override
    public PageVo<SysRole> selectRole(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject(map);
        Integer currentPage = jsonObject.getInteger("currentPag");
        Integer pageSize = jsonObject.getInteger("pageSize");
        String name = jsonObject.getString("name");
        SysRole sysRole = new SysRole();
        sysRole.setRolename(name);
        int cameraeNum;
        if (pageSize <= 0) {
            cameraeNum = pageSize;
        } else {
            cameraeNum = sysRoleMapper.countRole(sysRole);
        }
        PageVo<SysRole> pageVo = new PageVo<>(currentPage, pageSize, cameraeNum);
        pageVo.setTotalNum(cameraeNum);
        pageVo.setItems(sysRoleMapper.selectRole(sysRole, pageVo.getStartIndex(), pageSize));
        return pageVo;
    }

    /**
     * 新增角色
     * @param params
     * @return
     */
    @Override
    public boolean insertRole(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        SysRole sysRole = new SysRole();
        sysRole.setRolename(jsonObject.getString("rolename"));
        //这里从session里面调取当前人信息
        int insert = sysRoleMapper.insert(sysRole);
        if (insert != 0) {
            //这里添加中间表
            return true;
        }
        return false;
    }

    /**
     * 修改角色
     * @param params
     * @return
     */
    @Override
    public boolean updateRole(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        SysRole sysRole = new SysRole();
        sysRole.setRolename(jsonObject.getString("rolename"));
        sysRole.setRoleid(jsonObject.getLong("roleid"));
        int i = sysRoleMapper.updateByPrimaryKey(sysRole);
        if (i != 0) {
            //这里进行删除中间表，重新建立关联关系。
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRole(String params) {
        if (params == null)
            return false;
        JSONObject jsonObject = JSONObject.parseObject(params);
        //这里判断是否关联了角色
        int i = sysRoleMapper.deleteByPrimaryKey(jsonObject.getLong("roleid"));
        if (i < 0)
            return true;
        return false;
    }
}
