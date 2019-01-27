package com.alm.note.service.impl;

import com.alm.note.po.Note;
import com.alm.note.service.NoteService;
import com.alm.util.JSONUtil;
import com.alm.util.RESTUtil;
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
    }

    @Test
    public void getNoteById() {
        System.out.println(JSONUtil.format(noteService.getNoteById(7892536832032768L)));
    }

    @Test
    public void getNoteSimples() {
//        System.out.println(RESTUtil.HTTP200(noteService.getNotes(1, 10, 0, 0)));
        System.out.println(RESTUtil.HTTP200(noteService.getNoteSimples(1, 1, 0, 0)));
    }
}