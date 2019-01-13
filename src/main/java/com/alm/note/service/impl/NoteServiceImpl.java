package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.mapper.UserTagMapper;
import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;
import com.alm.note.po.UserTag;
import com.alm.note.po.UserTagExample;
import com.alm.note.service.NoteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:02</p>
 * <p>desc: </p>
 */
@Service
public class NoteServiceImpl implements NoteService {

    private final UserTagMapper userTagMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public NoteServiceImpl(UserTagMapper userTagMapper) {
        this.userTagMapper = userTagMapper;
    }


    /**
     * 获取用户标签
     *
     * @param id
     * @return
     */
    @Override
    public List<UserTag> getUserTag(Long id) {
        if (id == null) {
            return null;
        }
        UserTagExample example = new UserTagExample();
        UserTagExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        example.setOrderByClause("sequence desc");
        return userTagMapper.selectByExample(example);
    }
}
