package com.project.mes.demo.service.impl;

import com.project.mes.demo.bean.User;
import com.project.mes.demo.dao.UserMapper;
import com.project.mes.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Package: com.project.mes.service.impl
 * @ClassName: UserServiceImpl
 * @Author: hantongyang
 * @Description:
 * @Date: 2020/1/6 11:18
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object findUser(String id) {
            User userById = userMapper.findUserById(id);
            return userById;
        }
}
