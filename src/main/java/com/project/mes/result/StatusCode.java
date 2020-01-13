package com.project.mes.result;

/**
 * @ClassName StatusCode
 * @Description TODO
 * @Author zhubingan
 * @Date 2019/3/25 14:00
 * @Version 1.0
 **/
public enum  StatusCode implements ResultCode{


    请求成功(0, "请求成功"),
    系统繁忙(500001, "系统繁忙,请稍后再试"),
    系统错误(500002, "系统错误"),
    服务提供方不存在(500003, "服务提供方不存在");

    int code;
    String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
