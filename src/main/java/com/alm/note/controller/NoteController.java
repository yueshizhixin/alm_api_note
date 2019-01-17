package com.alm.note.controller;

import com.alm.note.service.NoteService;
import com.alm.util.RESTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:12</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "/tag", method = {RequestMethod.GET})
    public String getTags() {
        return RESTUtil.HTTP200(noteService.getTags());
    }


}
