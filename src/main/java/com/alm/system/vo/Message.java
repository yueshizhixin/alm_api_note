package com.alm.system.vo;

import com.github.pagehelper.Page;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-28 19:52</p>
 * <p>desc: 统一信息返回</p>
 */
public class Message {

    private int code = 200;
    private int ok = 0;
    private String msg = "操作失败";
    private Object data;
    private Page page;

    public Message() {
        super();
    }

    public Message(int ok) {
        this.ok = ok;
        if (ok == 1) {
            this.msg = "操作成功";
        }
    }

    public Message(String msg) {
        this.msg = msg;
    }

    public Message(int ok, String msg) {
        this.ok = ok;
        this.msg = msg;
    }

    public Message(int code, int ok, String msg) {
        this.code = code;
        this.ok = ok;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
