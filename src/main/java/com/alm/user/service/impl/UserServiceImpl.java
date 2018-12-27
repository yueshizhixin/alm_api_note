package com.alm.user.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.service.UserService;
import com.alm.util.DateUtil;
import javafx.util.converter.DateStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:46</p>
 * <p>desc: </p>
 */
@Service
public class UserServiceImpl implements UserService {

    private UserExample example;
    private UserExample.Criteria criteria;

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 查询用户公开信息
     *
     * @param id 主键
     * @return 待补充
     */
    @Override
    public User selectUserPublicMessage(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public boolean signUp(User user) {
        example=new UserExample();
        String msg;
        if(user.getPhone()!=null && !user.getPhone().trim().isEmpty()){
            criteria=example.createCriteria();
            criteria.andPhoneEqualTo(user.getPhone());
            //手机号已注册
            if(userMapper.countByExample(example)>0){
                msg = "一个手机号只允许绑定一个账号";
                System.out.println("msg = " + msg);
                return false;
            }
        }
        user.setCreateTime(DateUtil.now());
        user.setLatestTime(DateUtil.now());
        msg="ddd";
        return true;
    }
}
