package com.project.mes.systemmanage.controller;

import com.alibaba.fastjson.JSON;
import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysCompany;
import com.project.mes.systemmanage.service.SysCompanyService;
import com.project.mes.util.PageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/sysCompany")
/**
 * 吕兴刚
 * 企业信息的增删改查功能
 */
public class SysCompanyController {
    @Autowired
    private SysCompanyService sysCompanyService;
    @GetMapping("/findAll")
    /**
     * 企业信息的查询功能
     */
    public Result<Object> findAll(@RequestParam Map<String,Object> map){
        PageVo<SysCompany> positionPageVo = sysCompanyService.findAll(map);
        return new Result<>(true,200,"查询成功",positionPageVo);
    }
    @PostMapping("/addSysCompany")
    public Result  addSysCompany(@RequestBody String params){
        boolean flag = this.sysCompanyService.addSysCompany(params);
        if(flag){
            return new Result(true, 200, "添加成功", null);
        }
        return new Result(true, 201, "添加失败", null);
    }
    @PutMapping("update")
    public Result<Object> updateSysCompany(@RequestBody String params){

        boolean updateSysCompany = sysCompanyService.updateSysCompany(params);
        if(updateSysCompany){
            return new Result(true, 200, "修改成功", null);
        }
        return new Result(true, 201, "修改失败", null);
    }
    @PutMapping("delete")
    public Result<Object> deleteSysCompany(Long corpId){
        boolean deleteSysCompany = sysCompanyService.deleteSysCompany(corpId);
        if(deleteSysCompany){
            return new Result(true, 200, "删除成功", null);
        }
        return new Result(true, 201, "删除失败", null);
    }
//    @GetMapping("selectAll")
//    public Result<Object> selectAll(Map<String,Object> map){
//        PageVo<SysCompany> sysCompanyPageVo = sysCompanyService.selectAll(map);
//        return new Result<>(true,200,"查询成功",sysCompanyPageVo);
//    }
}
