package com.alm.user.service;

import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.po.UserTag;
import com.alm.user.vo.UserPublicMessage;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:45</p>
 * <p>desc: </p>
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    Message insertSignUp(User user);

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    Message updateSignIn(User user);

    /**
     * 检测用户唯一性
     *
     * @param user
     * @return
     */
    Message checkUnique(User user);

    /**
     * 检测验证码
     *
     * @return
     */
    Message checkCaptcha(Object captcha, Object input);

    /**
     * 查询用户公开信息
     *
     * @param id 主键
     * @return 待补充
     */
    UserPublicMessage selectPublicMessage(Long id);

    /**
     * 获取某用户标签
     *
     * @param id
     * @return
     */
    List<UserTag> selectUserTag(Long id);

}
