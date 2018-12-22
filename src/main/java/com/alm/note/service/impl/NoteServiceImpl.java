package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;
import com.alm.note.service.NoteService;
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

    private final NoteMapper noteMapper;

    private NoteExample example;
    private NoteExample.Criteria criteria;

    @Autowired
    public NoteServiceImpl(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    @Override
    public List<Note> selectAll() {
        example=new NoteExample();
        criteria=example.createCriteria();
        criteria.andIdGreaterThan(3);
        List<Note> list= noteMapper.selectByExample(example);
        return list;
    }

}
