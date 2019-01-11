package com.alm.system.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-11 20:15</p>
 * <p>desc: </p>
 */
public enum SessionEnum {
    user(1, "user"),
    userPublicMsg(2, "userPublicMsg");
    private int id;
    private String value;

    public String getValue() {
        return value;
    }

    SessionEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }}
