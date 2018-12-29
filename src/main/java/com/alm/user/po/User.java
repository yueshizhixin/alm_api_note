package com.alm.user.po;

import com.alm.util.DateUtil;

import java.util.Date;

/**
 * <p>table  用户表</p>
 * <p>author lishuai</p>
 * <p>time   2018-12-29</p>
 */
public class User {
    /**
     * 用户标识
     */
    private Long id;

    /**
     * 注册账号
     */
    private String acc;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 注册方式
     */
    private Integer signType;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date brithday = DateUtil.defaultTime();

    /**
     * 会员级别
     */
    private Integer vipLv;

    /**
     * 创建时间
     */
    private Date createTime = DateUtil.now();

    /**
     * 最后登录时间
     */
    private Date latestTime = DateUtil.now();

    /**
     * 是否允许登录
     */
    private Integer isSign;

    /**
     * 用户标识
     *
     * @return id 用户标识
     */
    public Long getId() {
        return id;
    }

    /**
     * 用户标识
     *
     * @param id 用户标识
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 注册账号
     *
     * @return acc 注册账号
     */
    public String getAcc() {
        return acc;
    }

    /**
     * 注册账号
     *
     * @param acc 注册账号
     */
    public void setAcc(String acc) {
        this.acc = acc == null ? null : acc.trim();
    }

    /**
     * 手机号
     *
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 电子邮箱
     *
     * @return email 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 注册方式
     *
     * @return signType 注册方式
     */
    public Integer getSignType() {
        return signType;
    }

    /**
     * 注册方式
     *
     * @param signType 注册方式
     */
    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    /**
     * 密码
     *
     * @return pwd 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 用户姓名
     *
     * @return userName 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 性别
     *
     * @return sex 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 出生日期
     *
     * @return brithday 出生日期
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * 出生日期
     *
     * @param brithday 出生日期
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * 会员级别
     *
     * @return vipLv 会员级别
     */
    public Integer getVipLv() {
        return vipLv;
    }

    /**
     * 会员级别
     *
     * @param vipLv 会员级别
     */
    public void setVipLv(Integer vipLv) {
        this.vipLv = vipLv;
    }

    /**
     * 创建时间
     *
     * @return createTime 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后登录时间
     *
     * @return latestTime 最后登录时间
     */
    public Date getLatestTime() {
        return latestTime;
    }

    /**
     * 最后登录时间
     *
     * @param latestTime 最后登录时间
     */
    public void setLatestTime(Date latestTime) {
        this.latestTime = latestTime;
    }

    /**
     * 是否允许登录
     *
     * @return isSign 是否允许登录
     */
    public Integer getIsSign() {
        return isSign;
    }

    /**
     * 是否允许登录
     *
     * @param isSign 是否允许登录
     */
    public void setIsSign(Integer isSign) {
        this.isSign = isSign;
    }
}