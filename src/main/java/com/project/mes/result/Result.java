package com.project.mes.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应结果包装类
 *
 * @param <T> 结果类型
 */
@Data
public class Result<T> implements Serializable {
    public Result() {
    }

    public Result(T result) {
        this(true, 20000, null, result);
    }

    public Result(ResultCode code) {
        this(false, code.getCode(), code.getMessage(), null);
    }

    public Result(ResultCode code, String message) {
        this(false, code.getCode(), message, null);
    }

    public Result(int code, String message) {
        this(false, code, message, null);
    }

    public Result(boolean success, int code, String message, T result) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 编码
     */
    private int code;

    /**
     * 信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T result;
}
