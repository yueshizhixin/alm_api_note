package com.alm.user.service.impl;

import com.alm.system.enume.CaptchaEnum;
import com.alm.system.enume.UserEnum;
import com.alm.system.snowFlake.SnowFlake;
import com.alm.system.tip.GlobalTip;
import com.alm.system.vo.Message;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.service.UserService;
import com.alm.user.vo.UserPublicMessage;
import com.alm.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:46</p>
 * <p>desc: </p>
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public Message insertSignUp(User user) {
        Message msg = checkUnique(user);

        //未通过校验
        if (msg.getOk() == 0) {
            return msg;
        }

        msg.setOk(0);
        if (user.getPwd() == null || user.getPwd().trim().isEmpty()) {
            msg.setMsg(GlobalTip.USER_NONE_PWD);
            return msg;
        }

        user.setId(SnowFlake.instance().newId());
        userMapper.insertSelective(user);
        msg = new Message(1);
        msg.setMsg(GlobalTip.COMM_SUCCESS);

        return msg;
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @Override
    public Message updateSignIn(User user) {
        Message msg = new Message();
        UserExample example = null;
        UserExample.Criteria criteria = null;
        List<User> list = null;
        if (user.getPwd() == null || user.getPwd().trim().equals("")) {
            msg.setMsg("密码为空");
            return msg;
        }
        if (user.getSignType() == null) {
            msg.setMsg("注册类型未选择");
            return msg;
        }
        if (user.getSignType() == UserEnum.signUp.account.getId()) {
            if (user.getAcc() == null || user.getAcc().trim().equals("")) {
                msg.setMsg("账号为空");
                return msg;
            }
            example = new UserExample();
            criteria = example.createCriteria();
            criteria.andIsSignEqualTo(1);
            criteria.andAccEqualTo(user.getAcc());
            list = userMapper.selectByExample(example);
            if (list == null || list.size() == 0) {
                msg.setMsg("无该用户");
                return msg;
            }
            if (!list.get(0).getPwd().equals(user.getPwd())) {
                msg.setMsg("密码错误");
                return msg;
            }
        } else if (user.getSignType() == UserEnum.signUp.phone.getId()) {
            msg.setMsg("error");
            return msg;
        } else if (user.getSignType() == UserEnum.signUp.email.getId()) {
            msg.setMsg("error");
            return msg;
        } else {
            msg.setMsg("error");
            return msg;
        }
        example = new UserExample();
        criteria = example.createCriteria();
        criteria.andIdEqualTo(list.get(0).getId());
        User u = new User();
        u.setLatestTime(DateUtil.now());
        userMapper.updateByExampleSelective(u, example);

        msg.setOk(1);
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
    public Message checkUnique(User user) {
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

        //注册方式及对应账号检测
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (UserEnum.signUp.account.getId() == user.getSignType() && user.getAcc() != null && !user.getAcc().trim().isEmpty()) {
            criteria.andAccEqualTo(user.getAcc());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_ACC);
                return msg;
            }
        } else if (UserEnum.signUp.phone.getId() == user.getSignType() && user.getPhone() != null && !user.getPhone().trim().isEmpty()) {
            criteria.andPhoneEqualTo(user.getPhone());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_PHONE);
                return msg;
            }
        } else if (UserEnum.signUp.email.getId() == user.getSignType() && user.getEmail() != null && !user.getEmail().trim().isEmpty()) {
            criteria.andEmailEqualTo(user.getEmail());
            if (userMapper.countByExample(example) > 0) {
                msg.setMsg(GlobalTip.USER_EXIST_EMAIL);
                return msg;
            }
        } else {
            msg.setMsg(GlobalTip.USER_NONE_SIGNTYPE);
            return msg;
        }

        msg.setOk(1);
        msg.setMsg(GlobalTip.COMM_SUCCESS);
        return msg;
    }

    /**
     * 检测验证码
     *
     * @return
     */
    @Override
    public Message checkCaptcha(Object captcha, Object input) {
        Message msg = new Message(GlobalTip.CAPTCHAT_ERROR);
        if (input != null && input.toString().toUpperCase().equals(captcha)) {
            msg.setOk(1);
            msg.setMsg(GlobalTip.COMM_SUCCESS);
        }
        return msg;
    }

    /**
     * 查询用户公开信息
     *
     * @param id 主键
     * @return 待补充
     */
    @Override
    public UserPublicMessage selectPublicMessage(Long id) {
        if (id == null) {
            return null;
        }
        return userMapper.selectPublicMsgByPrimaryKey(id);
    }

}
