package com.project.mes.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.project.mes.entity
 * @ClassName: User
 * @Author: hantongyang
 * @Description:
 * @Date: 2020/1/6 11:31
 * @Version: 1.0
 */
@Data
public class User implements Serializable {

    private Long id;
    private String userName;
    private String phone;
}
