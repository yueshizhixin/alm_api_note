package com.alm.note.controller;

import com.alm.note.po.Note;
import com.alm.note.service.NoteService;
import com.alm.system.GlobalDict;
import com.alm.system.authority.Authority;
import com.alm.system.enume.SessionEnum;
import com.alm.user.po.User;
import com.alm.util.RESTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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

    /**
     * 获取标签
     *
     * @return
     */
    @RequestMapping(value = "/tag", method = {RequestMethod.GET})
    public String getTags() {
        return RESTUtil.HTTP200(GlobalDict.instance().getMap().get("tags"));
    }

    /**
     * 新增或更新筆記
     *
     * @param note
     * @param session
     * @return
     */
    @Authority
    @RequestMapping(value = "/note/{id}", method = RequestMethod.POST)
    public String mergeNote(@ModelAttribute Note note, HttpSession session) {
        User user = (User) session.getAttribute(SessionEnum.user.getValue());
        note.setUserId(user.getId());
        return RESTUtil.Message(noteService.mergeNote(note));
    }

    /**
     * 获取某個筆記
     *
     * @param note
     * @return
     */
    @RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
    public String getNote(@ModelAttribute Note note) {
        Note n = noteService.getNoteById(note.getId());
        if (n == null || n.getId() == null) {
            return RESTUtil.HTTP200(0, "不存在");
        }
        return RESTUtil.HTTP200(n);
    }

}
