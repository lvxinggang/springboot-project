package com.project.mes.demo.controller;

import com.project.mes.demo.service.UserService;
import com.project.mes.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.project.mes.web
 * @ClassName: DemoController
 * @Author: hantongyang
 * @Description:
 * @Date: 2020/1/6 10:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private UserService userService;

    @GetMapping("/find")
    public Result findById(String id
    ){
        Object object = userService.findUser(id);
        return new Result(true, 200, "查询成功", object);
    }
}
