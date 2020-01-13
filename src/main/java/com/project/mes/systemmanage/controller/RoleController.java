package com.project.mes.systemmanage.controller;

import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysRole;
import com.project.mes.systemmanage.service.PositionService;
import com.project.mes.systemmanage.service.RoleService;
import com.project.mes.util.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @Package: com.project.mes.systemmanage
 * @ClassName: RoleController
 * @Author: zhubingan
 * @Description: 角色管理控制层
 * @Date: 2020/1/9 10:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    /**
     * 查询全部角色信息
     * @param map
     * @return
     */
    @GetMapping("/selectrole")
    public Result<Object> selectRole(@RequestParam Map<String, Object> map
    ) {
        PageVo<SysRole> positionPageVo = roleService.selectRole(map);
        return new Result<>(true, 200, "查询成功", positionPageVo);
    }

    /**
     * 新增角色
     * @param params
     * @return
     */
    @PostMapping("/insertrole")
    public Result insertRole(@RequestBody String params) {
        boolean flag = this.roleService.insertRole(params);
        if (flag) {
            return new Result(true, 200, "添加成功", null);
        }
        return new Result(true, 201, "添加失败", null);
    }

    /**
     * 修改角色
     * @param params
     * @return
     */
    @PostMapping("/updaterole")
    public Result updateRole(@RequestBody String params) {
        boolean flag = this.roleService.updateRole(params);
        if (flag) {
            return new Result(true, 200, "编辑成功", null);
        }
        return new Result(false,201,"编辑失败",null);
    }
    /**
     * 删除角色信息
     * @param params
     * @return
     */
    @PostMapping("/deleterole")
    public Result deleteRole(@RequestBody String params) {
        boolean flag = this.roleService.deleteRole(params);
        if (flag) {
            return new Result(true, 200, "删除成功", null);
        }
        return new Result(false,201,"删除失败",null);
    }
}
