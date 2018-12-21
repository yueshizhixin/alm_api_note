package com.alm.system.authority;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-21 21:01</p>
 * <p>desc: 权限检测类型</p>
 */
public enum AuthorityEnum {
    /**
     * HTTP-401
     */
    UNAUTHORIZED(401, "Unauthorized"),

    /**
     * HTTP-403
     */
    FORBIDDEN(403, "Forbidden");

    private int id;
    private String name;

    AuthorityEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
