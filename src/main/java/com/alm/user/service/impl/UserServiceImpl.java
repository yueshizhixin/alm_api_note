package com.alm.user.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.user.mapper.UserMapper;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import javafx.util.converter.DateStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-19 19:46</p>
 * <p>DESC:        </p>
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    private final NoteMapper noteMapper;

    DateStringConverter dateStringConverter = new DateStringConverter();

    @Autowired
    public UserServiceImpl(UserMapper userMapper, NoteMapper noteMapper) {
        this.userMapper = userMapper;
        this.noteMapper = noteMapper;
    }

    @Override
    public boolean insertSelective(User user) {
        if (user.getPwd() == null || user.getPwd().isEmpty()) {
            user.setPwd("123456");
        }
        user.setCreateTime(dateStringConverter.fromString("2018-05-14 02:14"));
        user.setLatestTime(dateStringConverter.fromString("2018-05-14 02:14"));
        return userMapper.insertSelective(user) == 1;
    }
}
