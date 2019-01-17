package com.alm.user.controller;

import com.alm.note.service.NoteService;
import com.alm.system.service.CommService;
import com.alm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-17 19:26</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;
    private final CommService commService;
    private final NoteService noteService;

    @Autowired
    public UserController(UserService userService, CommService commService, NoteService noteService) {
        this.userService = userService;
        this.commService = commService;
        this.noteService = noteService;
    }


}
