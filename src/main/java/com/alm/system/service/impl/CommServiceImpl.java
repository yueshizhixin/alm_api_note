package com.alm.system.service.impl;

import com.alm.system.service.CommService;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-10 19:33</p>
 * <p>desc: </p>
 */
@Service
public class CommServiceImpl implements CommService {

    private final UserMapper userMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public CommServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * session更新user
     *
     * @param id
     */
    @Override
    public void sessionUpdateUser(HttpSession session, Long id) {
        if (id == null) {
            return;
        }
        User u = userMapper.selectByPrimaryKey(id);
        if (u != null && u.getId() != null) {
            session.setAttribute("user", u);
        }
    }

    /**
     * session更新user
     *
     * @param acc
     */
    @Override
    public void sessionUpdateUser(HttpSession session, String acc) {
        if (acc == null || acc.isEmpty()) {
            return;
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccEqualTo(acc);
        List<User> list = userMapper.selectByExample(example);
        if (list != null && list.size() > 0 && list.get(0).getId() != null) {
            session.setAttribute("user", list.get(0));
        }
    }
}
