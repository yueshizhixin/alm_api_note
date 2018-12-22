package com.alm.note.service;

import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-22 21:00</p>
 * <p>desc: </p>
 */
public interface NoteService {
    List<Note> selectAll();
}
