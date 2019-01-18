package com.alm.user.service.impl;

import com.alm.system.vo.Message;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:46</p>
 * <p>desc: </p>
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public Message signIn(User user) {
        Message msg = new Message();
        if (user.getAcc() == null || user.getPwd() == null) {
            msg.setMsg("信息不完成");
            return msg;
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccEqualTo(user.getAcc());
        criteria.andPwdEqualTo(user.getPwd());
        List<User> list = userMapper.selectByExample(example);
        if (list == null || list.size() == 0) {
            msg.setMsg("账号或密码错误");
            return msg;
        }
        msg.setOk(1);
        msg.setMsg("操作成功");
        return msg;
    }

    /**
     * 根据账号获取会员
     *
     * @param acc
     * @return
     */
    @Override
    public List<User> selectUserByAcc(String acc) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccEqualTo(acc);
        return userMapper.selectByExample(example);
    }
}
