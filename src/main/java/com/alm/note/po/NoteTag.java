package com.alm.note.po;

/**
 <p>table  笔记标签表</p>
 <p>author lishuai</p>
 <p>time   2019-01-14</p>
*/
public class NoteTag {
    /**
     * 
     */
    private Integer id;

    /**
     * 标签
     */
    private Integer tagId;

    /**
     * 用户
     */
    private Long userId;

    /**
     * 
     */
    private Long noteId;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 标签
     * @return tagId 标签
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 标签
     * @param tagId 标签
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 用户
     * @return userId 用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户
     * @param userId 用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return noteId 
     */
    public Long getNoteId() {
        return noteId;
    }

    /**
     * 
     * @param noteId 
     */
    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }
}