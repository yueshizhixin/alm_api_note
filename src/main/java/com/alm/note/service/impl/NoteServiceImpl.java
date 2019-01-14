package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.po.*;
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
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteMapper noteMapper;

    @Autowired
    public NoteServiceImpl(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    @Override
    public List<Note> getNote() {
        NoteExample example = new NoteExample();
        NoteExample.Criteria criteria = example.createCriteria();
        criteria.andIdBetween(2L, 3L);
        return noteMapper.selectByExample(example);
    }
}
