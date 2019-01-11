package com.alm.user.vo;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-11 19:46</p>
 * <p>desc: 用户公共信息</p>
 */
public class UserPublicMessage {
    /**
     * 用户标识
     */
    private Long id;

    /**
     * 注册账号
     */
    private String acc;

    /**
     * 头像图片
     */
    private String headImg;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 性别
     */
    private Integer sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
