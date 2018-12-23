package com.alm.demo.service;

import com.alm.note.po.Note;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:13</p>
 * <p>desc: </p>
 */
public interface DemoService {
    List<Note> selectAll();
}
