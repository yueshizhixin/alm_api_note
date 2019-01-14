package com.alm.note.po;

import com.alm.user.po.UserTag;

import java.util.Date;
import java.util.List;

/**
 <p>table  笔记表</p>
 <p>author lishuai</p>
 <p>time   2019-01-14</p>
*/
public class Note {
    private List<UserTag> tagList;

    public List<UserTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<UserTag> tagList) {
        this.tagList = tagList;
    }

    /**
     * 笔记id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 是否私有
     */
    private Integer isPrivate;

    /**
     * 概要
     */
    private String profile;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 阅读数
     */
    private Integer readCount;

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
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
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
     * 是否私有
     * @return isPrivate 是否私有
     */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    /**
     * 是否私有
     * @param isPrivate 是否私有
     */
    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
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
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return updateTime 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 阅读数
     * @return readCount 阅读数
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * 阅读数
     * @param readCount 阅读数
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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