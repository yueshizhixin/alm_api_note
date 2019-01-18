package com.alm.user.service;

import com.alm.system.vo.Message;
import com.alm.user.po.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:45</p>
 * <p>desc: </p>
 */
public interface UserService {

    /**
     * 登录
     *
     * @param user
     * @return
     */
    public Message signIn(User user);

    /**
     * 根据账号获取会员
     *
     * @param acc
     * @return
     */
    public List<User> selectUserByAcc(String acc);

}
