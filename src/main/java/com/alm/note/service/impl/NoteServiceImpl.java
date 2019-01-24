package com.alm.note.service.impl;

import com.alm.note.mapper.NoteMapper;
import com.alm.note.mapper.NoteTagMapper;
import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;
import com.alm.note.po.NoteTag;
import com.alm.note.po.NoteTagExample;
import com.alm.note.service.NoteService;
import com.alm.system.snowFlake.SnowFlake;
import com.alm.system.vo.Message;
import com.alm.util.DateUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
    public NoteServiceImpl(NoteTagMapper noteTagMapper, NoteMapper noteMapper) {
        this.noteTagMapper = noteTagMapper;
        this.noteMapper = noteMapper;
    }

    /**
     * 获取所有标签
     *
     * @return
     */
    @Override
    public List<NoteTag> getTags() {
        NoteTagExample example = new NoteTagExample();
        example.setOrderByClause("layer asc,sequence desc");
        return noteTagMapper.selectByExample(example);
    }

    @Override
    public Message mergeNote(Note note) {
        Message msg = new Message();
        if (note == null || note.getId() == null || note.getId() < 0) {
            return msg;
        }
        note.setUpdateTime(DateUtil.now());
        if (note.getId() == 0) {
            note.setId(SnowFlake.instance().newId());
            note.setCreateTime(DateUtil.now());
            noteMapper.insertSelective(note);

        } else {
            noteMapper.updateByPrimaryKeySelective(note);
        }
        msg.setOk(1);
        msg.setMsg("保存成功");
        msg.setData(note);
        return msg;
    }

    /**
     * 获取笔记
     *
     * @param id
     * @return
     */
    @Override
    public Note getNoteById(Long id) {
        if (id == null || id <= 0) {
            return null;
        }
        return noteMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取所有笔记
     *
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public List<Note> getNotes(int offset, int limit, int tagId1, int tagId2) {
        NoteExample example = new NoteExample();
        NoteExample.Criteria criteria = example.createCriteria();
        if (tagId1 > 0 || tagId2 > 0) {
            criteria.andTagId1EqualTo(tagId1).andTagId2EqualTo(tagId2);
        }
        example.setOrderByClause("updateTime desc");
        PageHelper.startPage(offset, limit);
        return noteMapper.selectByExample(example);
    }

    /**
     * 添加标签
     *
     * @param layer
     * @param tagId1
     * @param tagName
     */
    @Override
    public void insertTag(int layer, int tagId1, String tagName) {
        NoteTag tag = new NoteTag();
        tag.setLayer(layer);
        tag.setName(tagName);
        tag.setSequence(0);
        if (layer == 2) {
            tag.setParentId(tagId1);
        }
        noteTagMapper.insertSelective(tag);
    }
}
