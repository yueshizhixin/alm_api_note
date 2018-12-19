package com.alm.user.service.impl;

import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-19 19:46</p>
 * <p>DESC:        </p>
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        return userMapper.insert(user)==1;
    }
}
