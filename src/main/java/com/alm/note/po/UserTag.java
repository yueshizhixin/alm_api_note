package com.alm.note.po;

/**
 <p>table  笔记标签表</p>
 <p>author lishuai</p>
 <p>time   2019-01-13</p>
*/
public class UserTag {
    /**
     * 
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 用户
     */
    private Long userId;

    /**
     * 
     */
    private Integer sequence;

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
     * 标签名称
     * @return name 标签名称
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名称
     * @param name 标签名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @return sequence 
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence 
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}