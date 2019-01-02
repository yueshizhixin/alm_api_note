package com.alm.user.service;

import com.alm.system.vo.Message;
import com.alm.user.po.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:45</p>
 * <p>desc: </p>
 */
public interface UserService {

    /**
     * 查询用户公开信息
     * @param id 主键
     * @return 待补充
     */
    User selectUserPublicMessage(long id);

    /**
     * 用户注册
     * @param user
     * @return
     */
    Message insertUserSignUp(User user);

    /**
     * 检测用户唯一性
     * @param user
     * @return
     */
    Message checkUserUnique(User user);
}
