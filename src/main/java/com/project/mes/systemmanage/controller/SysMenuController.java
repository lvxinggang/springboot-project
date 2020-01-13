package com.project.mes.systemmanage.controller;

import com.alibaba.fastjson.JSON;
import com.project.mes.result.Result;
import com.project.mes.systemmanage.bean.SysMenu;
import com.project.mes.systemmanage.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sysMenu")
@Slf4j
//树形结构菜单，菜单管理
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;
    @GetMapping("menu")
    //查询树形菜单
    public Result findAll(){
        List<SysMenu> menuList =null;
        Result result=null;
        try {
            menuList = sysMenuService.findAll();
            result=new Result(true,200,"查询成功",menuList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @GetMapping("findByPrimaryKey")
    public Object findByPrimaryKey(@RequestParam String menuid){
        String str = null;
        Result result=null;
        try {
            List<SysMenu> byParentnodeid = sysMenuService.findByParentnodeid(menuid);
            result=new Result(true,200,"查询成功",byParentnodeid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
