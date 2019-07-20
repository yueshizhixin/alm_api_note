package com.alm.note.service;

import com.alm.note.po.Note;
import com.alm.note.po.NoteTag;
import com.alm.note.vo.NoteSimple;
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
    List<NoteTag> getTags();

    /**
     * 新增或保存笔记
     *
     * @param note
     * @return
     */
    Message mergeNote(Note note);

    /**
     * 获取笔记
     *
     * @param id
     * @return
     */
    Note getNoteById(Long id);
    /**
     * 获取笔记回调
     *
     * @return
     */
    void updateGetNoteByIdCallback(Note note);
    /**
     * 获取所有笔记
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Note> getNotes(int offset, int limit, int tagId1, int tagId2);

    /**
     * 获取所有笔记
     *
     * @param offset
     * @param limit
     * @return
     */
    List<NoteSimple> getNoteSimples(int offset, int limit, int tagId1, int tagId2);

    /**
     * 添加标签
     */
    void insertTag(int layer, int tagId1, String tagName);
}
