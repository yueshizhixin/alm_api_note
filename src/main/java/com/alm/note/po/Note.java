package com.alm.note.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 <p>table  笔记</p>
 <p>author lishuai</p>
 <p>time   2019-07-24</p>
*/
@ApiModel("笔记")
public class Note {
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

    @ApiModelProperty("概要")
    private String profile;

    /**
     * 内容
     */
    private String content;

    /**
     * 一级标签
     */
    private Integer tagId1;

    /**
     * 
     */
    private String tagName1;

    /**
     * 二级标签
     */
    private Integer tagId2;

    /**
     * 
     */
    private String tagName2;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
     * 是否置顶
     */
    private Integer isTop;

    /**
     * 显示索引
     */
    private Integer showIndex;

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
     * 一级标签
     * @return tagId1 一级标签
     */
    public Integer getTagId1() {
        return tagId1;
    }

    /**
     * 一级标签
     * @param tagId1 一级标签
     */
    public void setTagId1(Integer tagId1) {
        this.tagId1 = tagId1;
    }

    /**
     * 
     * @return tagName1 
     */
    public String getTagName1() {
        return tagName1;
    }

    /**
     * 
     * @param tagName1 
     */
    public void setTagName1(String tagName1) {
        this.tagName1 = tagName1 == null ? null : tagName1.trim();
    }

    /**
     * 二级标签
     * @return tagId2 二级标签
     */
    public Integer getTagId2() {
        return tagId2;
    }

    /**
     * 二级标签
     * @param tagId2 二级标签
     */
    public void setTagId2(Integer tagId2) {
        this.tagId2 = tagId2;
    }

    /**
     * 
     * @return tagName2 
     */
    public String getTagName2() {
        return tagName2;
    }

    /**
     * 
     * @param tagName2 
     */
    public void setTagName2(String tagName2) {
        this.tagName2 = tagName2 == null ? null : tagName2.trim();
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

    /**
     * 是否置顶
     * @return isTop 是否置顶
     */
    public Integer getIsTop() {
        return isTop;
    }

    /**
     * 是否置顶
     * @param isTop 是否置顶
     */
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    /**
     * 显示索引
     * @return showIndex 显示索引
     */
    public Integer getShowIndex() {
        return showIndex;
    }

    /**
     * 显示索引
     * @param showIndex 显示索引
     */
    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }
}