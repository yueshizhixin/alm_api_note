package com.alm.system.service.impl;

import com.alm.system.enume.SessionEnum;
import com.alm.system.enume.UserEnum;
import com.alm.system.service.CommService;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.po.UserExample;
import com.alm.user.vo.UserPublicMessage;
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
        //用户信息
        User u = userMapper.selectByPrimaryKey(id);
        session.setAttribute(SessionEnum.user.getValue(), u);

        //用户公共信息
        UserPublicMessage userMsg = userMapper.selectPublicMsgByPrimaryKey(id);
        session.setAttribute(SessionEnum.userPublicMsg.getValue(), userMsg);
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

        //用户全部信息
        List<User> list = userMapper.selectByExample(example);
        User user = null;
        if (list != null && list.size() > 0) {
            user = list.get(0);
            session.setAttribute(SessionEnum.user.getValue(), user);
        }

        //用户公共信息
        if (user != null && user.getId() != null) {
            UserPublicMessage userMsg = userMapper.selectPublicMsgByPrimaryKey(user.getId());
            session.setAttribute(SessionEnum.userPublicMsg.getValue(), userMsg);
        } else {
            session.setAttribute(SessionEnum.userPublicMsg.getValue(), null);
        }
    }
}
