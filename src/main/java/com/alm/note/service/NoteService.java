package com.alm.note.service;

import com.alm.note.po.Note;
import com.alm.note.po.NoteTag;
import com.alm.system.vo.Message;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:00</p>
 * <p>desc: </p>
 */
public interface NoteService {

    /**
     * 获取所有标签
     *
     * @return
     */
    public List<NoteTag> getTags();

    /**
     * 新增或保存笔记
     *
     * @param note
     * @return
     */
    public Message mergeNote(Note note);

    /**
     * 获取笔记
     *
     * @param id
     * @return
     */
    public Note getNoteById(Long id);

    /**
     * 获取所有笔记
     *
     * @param offset
     * @param limit
     * @return
     */
    public List<Note> getNotes(int offset, int limit);
}
