package com.alm.note.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-25 19:19</p>
 * <p>desc: 笔记缩略信息</p>
 */

public class NoteSimple {

    /**
     * 笔记id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;


    /**
     * 概要
     */
    private String profile;


    /**
     * 一级标签
     */
    private String tagName1;

    /**
     * 二级标签
     */
    private String tagName2;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTagName1() {
        return tagName1;
    }

    public void setTagName1(String tagName1) {
        this.tagName1 = tagName1;
    }

    public String getTagName2() {
        return tagName2;
    }

    public void setTagName2(String tagName2) {
        this.tagName2 = tagName2;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
