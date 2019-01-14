package com.alm.note.controller;

import com.alm.note.service.NoteService;
import com.alm.system.authority.Authority;
import com.alm.system.enume.SessionEnum;
import com.alm.user.po.User;
import com.alm.util.RESTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:12</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1/note")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }



}
