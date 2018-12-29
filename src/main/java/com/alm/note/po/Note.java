package com.alm.note.po;

/**
 <p>table  笔记表</p>
 <p>author lishuai</p>
 <p>time   2018-12-29</p>
*/
public class Note {
    /**
     * 笔记id
     */
    private Long id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 概要
     */
    private String profile;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论数
     */
    private Integer commenCount;

    /**
     * 分享数
     */
    private Integer shareCount;

    /**
     * 笔记id
     * @return id 笔记id
     */
    public Long getId() {
        return id;
    }

    /**
     * 笔记id
     * @param id 笔记id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return userId 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 概要
     * @return profile 概要
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 概要
     * @param profile 概要
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 评论数
     * @return commenCount 评论数
     */
    public Integer getCommenCount() {
        return commenCount;
    }

    /**
     * 评论数
     * @param commenCount 评论数
     */
    public void setCommenCount(Integer commenCount) {
        this.commenCount = commenCount;
    }

    /**
     * 分享数
     * @return shareCount 分享数
     */
    public Integer getShareCount() {
        return shareCount;
    }

    /**
     * 分享数
     * @param shareCount 分享数
     */
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }
}