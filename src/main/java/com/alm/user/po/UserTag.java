package com.alm.user.po;

/**
 <p>table  标签表</p>
 <p>author lishuai</p>
 <p>time   2019-01-14</p>
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
     * 所属用户
     */
    private Long userId;

    /**
     * 是否私有
     */
    private Integer isPrivate;

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
     * 所属用户
     * @return userId 所属用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 所属用户
     * @param userId 所属用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}