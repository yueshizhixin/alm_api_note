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

import javax.servlet.http.HttpServletRequest;
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
     */
    @RequestMapping(value = "/tag", method = {RequestMethod.GET})
    public String getTags() {
        return RESTUtil.HTTP200(GlobalDict.instance().getMap().get("tags"));
    }

    /**
     * 保存标签
     */
    @Authority
    @RequestMapping(value = "/tag", method = RequestMethod.POST)
    public String addTag(@RequestParam int layer, @RequestParam int tagId1, @RequestParam String tagName, HttpServletRequest req) {
        noteService.insertTag(layer, tagId1, tagName);
        GlobalDict.instance().updateTag(req.getServletContext());
        return RESTUtil.HTTP200(1, "操作成功");
    }

    /**
     * 新增或更新筆記
     */
    @Authority
    @RequestMapping(value = "/note/{id}", method = RequestMethod.POST)
    public String mergeNote(@ModelAttribute Note note, HttpSession session) {
        User user = (User) session.getAttribute(SessionEnum.user.getValue());
        note.setUserId(user.getId());
        note.setCreateTime(null);
        note.setUpdateTime(null);
        return RESTUtil.Message(noteService.mergeNote(note));
    }

    /**
     * 获取某個筆記
     */
    @RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
    public String getNoteById(@ModelAttribute Note note) {
        Note n = noteService.getNoteById(note.getId());

        if (n == null || n.getId() == null) {
            return RESTUtil.HTTP200(0, "不存在");
        }
        return RESTUtil.HTTP200(n);
    }

    /**
     * 笔记列表
     */
    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public String getNoteSimpleList(@RequestParam int offset, @RequestParam int limit, @RequestParam int tagId1, @RequestParam int tagId2) {
        return RESTUtil.HTTP200(noteService.getNoteSimples(offset, limit, tagId1, tagId2));
    }


}
