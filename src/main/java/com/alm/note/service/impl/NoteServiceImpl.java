package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.mapper.NoteTagMapper;
import com.alm.note.po.NoteTag;
import com.alm.note.po.NoteTagExample;
import com.alm.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:02</p>
 * <p>desc: </p>
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteTagMapper noteTagMapper;

    @Autowired
    public NoteServiceImpl(NoteTagMapper noteTagMapper) {
        this.noteTagMapper = noteTagMapper;
    }

    /**
     * 获取所有标签
     *
     * @return
     */
    @Override
    public List<NoteTag> getTags() {
        NoteTagExample example = new NoteTagExample();
        example.setOrderByClause("sequence asc");
        return noteTagMapper.selectByExample(example);
    }
}
