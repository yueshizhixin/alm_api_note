package com.alm.user.service;

import com.alm.user.po.User;

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
    User selectUserPublicMessage(int id);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean signUp(User user);
}
