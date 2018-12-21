package com.alm.user.service;

import com.alm.user.po.User;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-19 19:45</p>
 * <p>desc: </p>
 */
public interface UserService {
    boolean insertSelective(User user);
    boolean insert(User user);
}
