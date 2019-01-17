package com.alm.note.service;

import com.alm.note.po.NoteTag;

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
}
