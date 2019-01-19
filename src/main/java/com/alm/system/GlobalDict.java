package com.alm.system;

import com.alm.note.po.Note;
import com.alm.note.service.NoteService;
import com.alm.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-19 20:36</p>
 * <p>desc: 全局字典</p>
 * Vector和CopyOnWriteArrayList是两个线程安全的List
 * Vector读写操作都用了同步，相对来说更适用于写多读少的场合
 * CopyOnWriteArrayList在写的时候会复制一个副本，对副本写，写完用副本替换原值，
 * 读的时候不需要同步，适用于写少读多的场合。
 */
public class GlobalDict {

    /**
     * 系统自带标签
     */
    private CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    /**
     * 所有用户自定义标签
     */
    private ConcurrentMap<String, Object> map = new ConcurrentHashMap<>();

    private GlobalDict() {
    }

    private static GlobalDict globalDict = new GlobalDict();

    public static GlobalDict instance() {
        return globalDict;
    }

    public void init(ServletContext sc) {
        NoteService noteService = (NoteService) WebApplicationContextUtils.getWebApplicationContext(sc).getBean("noteService");
        map.put("tags", noteService.getTags());
    }

    public CopyOnWriteArrayList<String> getList() {
        return list;
    }

    public ConcurrentMap<String, Object> getMap() {
        return map;
    }
}
