package com.project.mes.systemmanage.controller;

import com.project.mes.result.Result;
import com.project.mes.systemmanage.service.SysOrganizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("sysOrganization")
public class SysOrganizationController {
    @Autowired
    private SysOrganizationService sysOrganizationService;
    @PostMapping("add")
    public Result<Object> addSysOrganization(@RequestBody String params){
        boolean addSysOrganization = sysOrganizationService.addSysOrganization(params);
        if(addSysOrganization){
            return new Result(true, 200, "添加成功", null);
        }
            return new Result(true, 201, "添加失败", null);
    }
}
