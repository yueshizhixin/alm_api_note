package com.alm.note.po;

/**
 <p>table  笔记表</p>
 <p>author lishuai</p>
 <p>time   2018-12-19</p>
*/
public class Note {
    /**
     * 笔记id
     */
    private Integer id;

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
    private String hotContent;

    /**
     * 
     */
    private String content;

    /**
     * 评论数
     */
    private Integer commenCount;

    /**
     * 笔记id
     * @return id 笔记id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 笔记id
     * @param id 笔记id
     */
    public void setId(Integer id) {
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
     * @return hotContent 概要
     */
    public String getHotContent() {
        return hotContent;
    }

    /**
     * 概要
     * @param hotContent 概要
     */
    public void setHotContent(String hotContent) {
        this.hotContent = hotContent == null ? null : hotContent.trim();
    }

    /**
     * 
     * @return content 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content 
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
}