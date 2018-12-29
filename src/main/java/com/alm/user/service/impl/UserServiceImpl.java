package com.alm.user.service.impl;

import com.alm.system.snowFlake.SnowFlake;
import com.alm.system.tip.GlobalTip;
import com.alm.system.vo.Message;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.service.UserService;
import com.alm.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:46</p>
 * <p>desc: </p>
 */
@Service
public class UserServiceImpl implements UserService {

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
    public User selectUserPublicMessage(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public Message signUp(User user) {
        Message msg;
        user.setCreateTime(DateUtil.now());
        user.setLatestTime(DateUtil.now());

        msg = new Message(1);
        msg.setMsg(GlobalTip.COMM_SUCCESS);
        return msg;
    }

    /**
     * 检测用户唯一性
     *
     * @param user
     * @return
     */
    @Override
    public Message checkUserUnique(User user) {
        Message msg = new Message();
        if (user == null) {
            msg.setMsg(GlobalTip.ERROR_NONE_POINTER);
            return msg;
        }
        if ((user.getPhone() == null || user.getPhone().trim().isEmpty())
                && (user.getAcc() == null || user.getAcc().trim().isEmpty())
                && (user.getEmail() == null || user.getEmail().trim().isEmpty())
        ) {
            msg.setMsg(GlobalTip.USER_NONE_SIGNNAME);
            return msg;
        }

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (user.getAcc() != null && !user.getAcc().trim().isEmpty()) {
            criteria.andAccEqualTo(user.getAcc());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_ACC);
                return msg;
            }
        }
        if (user.getPhone() != null && !user.getPhone().trim().isEmpty()) {
            criteria.andPhoneEqualTo(user.getPhone());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_PHONE);
                return msg;
            }
        }
        if (user.getEmail() != null && !user.getEmail().trim().isEmpty()) {
            criteria.andEmailEqualTo(user.getEmail());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_EMAIL);
                return msg;
            }
        }
        msg.setOk(1);
        return msg;
    }
}
