package com.project.mes.systemmanage.controller;

import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysEmployee;
import com.project.mes.systemmanage.service.SysEmployeeService;
import com.project.mes.util.PageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * lvxinggang
 * 人员档案管理
 */
@RestController
@Slf4j
@RequestMapping("/sysEmployee")
public class SysEmployeeController {
    @Autowired
    private SysEmployeeService sysEmployeeService;

    /**
     * 人员档案管理模块的添加模块
     * @param params
     * @return
     */
    @PostMapping("/add")
    public Result<Object> addSysEmployee(@RequestBody String params){
        boolean insert = sysEmployeeService.insert(params);
        if(insert){
            return new Result(true, 200, "添加成功", null);
        }
        return new Result(true, 201, "添加失败", null);
    }

    /**
     * 人员档案管理模块的修改模块
     * @param params
     * @return
     */
    @PutMapping("/update")
    public Result<Object> updateSysEmployee(@RequestBody String params){
        boolean updateByPrimaryKey = sysEmployeeService.updateByPrimaryKey(params);
        if (updateByPrimaryKey){
            return new Result(true, 200, "修改成功", null);
        }
        return new Result(true, 201, "修改失败", null);
    }
    /**
     * 人员档案管理模块的删除模块
     * @param params
     * @return
     */
    @PutMapping("delete")
    public Result<Object> deleteSysEmployee(@RequestBody String params){
        boolean deleteSysEmployee = sysEmployeeService.deleteSysEmployee(params);
        if (deleteSysEmployee){
            return new Result(true, 200, "删除成功", null);
        }
        return new Result(true, 201, "删除失败", null);
    }

    /**
     * 人员档案管理模块的人员档案查询以及分页、模糊查询
     * @param map
     * @return
     */
    @GetMapping("/find")
    public Result<Object> findSysEmployeeAll(@RequestParam Map<String,Object> map){
        PageVo<SysEmployee> positionPageVo =sysEmployeeService.findSysEmployeeAll(map);
        return new Result<>(true,200,"查询成功",positionPageVo);
    }

    /**
     * 人员档案管理模块的组织人员查询以及分页、模糊查询
     * @param map
     * @return
     */
    @GetMapping("/select")
    public Result<Object> selectSysEmployeeAll(@RequestParam Map<String,Object> map){
        PageVo<SysEmployee> positionPageVo =sysEmployeeService.selectBySysEmployeeAll(map);
        return new Result<>(true,200,"查询成功",positionPageVo);
    }
}
