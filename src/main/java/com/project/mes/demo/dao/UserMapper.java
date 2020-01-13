package com.project.mes.demo.dao;

import com.project.mes.demo.bean.User;

/**
 * @Package: com.project.mes.dao
 * @ClassName: UserMapper
 * @Author: hantongyang
 * @Description:
 * @Date: 2020/1/6 11:30
 * @Version: 1.0
 */
public interface UserMapper {

    User findUserById(String id);
}
