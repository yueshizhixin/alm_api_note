package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.mapper.NoteTagMapper;
import com.alm.note.po.*;
import com.alm.note.service.NoteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    private final NoteMapper noteMapper;
    private final NoteTagMapper noteTagMapper;

    @Autowired
    public NoteServiceImpl(NoteMapper noteMapper, NoteTagMapper noteTagMapper) {
        this.noteMapper = noteMapper;
        this.noteTagMapper = noteTagMapper;
    }

    /**
     * 根据tag获取note
     *
     * @return
     */
    @Override
    public List<Note> getPulicNoteByTagId(int id) {
        List<Long> list = new ArrayList<Long>();
        NoteTagExample noteTagExample = new NoteTagExample();
        NoteTagExample.Criteria noteTagCriteria = noteTagExample.createCriteria();
        noteTagCriteria.andTagIdEqualTo(id);
        noteTagMapper.selectByExample(noteTagExample).forEach(item -> list.add(item.getNoteId()));

        NoteExample example = new NoteExample();
        NoteExample.Criteria criteria = example.createCriteria();
        criteria.andIsPrivateEqualTo(0);
        criteria.andIdIn(list);
        return noteMapper.selectByExample(example);
    }
}
