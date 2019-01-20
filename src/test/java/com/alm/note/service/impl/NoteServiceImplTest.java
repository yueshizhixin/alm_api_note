package com.alm.note.service.impl;

import com.alm.note.po.Note;
import com.alm.note.service.NoteService;
import com.alm.util.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class NoteServiceImplTest {

    @Resource
    private NoteService noteService;

    @Test
    public void getTags() {
        System.out.println(JSONUtil.format(noteService.getTags()));
    }

    @Test
    public void mergeNote() {
        Note note = new Note();
        note.setId(0L);
        note.setUserId(3L);
        System.out.println(noteService.mergeNote(note));
    }

    @Test
    public void getNoteById() {
        System.out.println(JSONUtil.format(noteService.getNoteById(7892536832032768L)));
    }
}