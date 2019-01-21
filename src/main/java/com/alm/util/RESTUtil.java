package com.alm.util;


import com.alm.system.vo.Message;
import com.github.pagehelper.Page;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:58</p>
 * <p>desc: API统一返回</p>
 */
public class RESTUtil {

    /**
     * API统一json
     *
     * @param ok  是否操作成功
     * @param msg 信息
     * @param t   数据
     * @param <T> 数据
     * @return 成功json
     */
    private static <T> String format(int code, int ok, String msg, T t, Page page) {
        Message m = new Message();
        m.setCode(code);
        m.setOk(ok);
        m.setMsg(msg);
        m.setData(t);
        m.setPage(page);
        return JSONUtil.format(m);
    }

    public static <T> String HTTP200(T t) {
        return format(200, 1, "", t, null);
    }

    public static <T> String HTTP200(T t, Page page) {
        return format(200, 1, "", t, page);
    }

    public static <T> String HTTP200(int ok, String msg) {
        return format(200, ok, msg, null, null);
    }


    private static String TIP500 = Exception.class.getName();

    public static <T> String HTTP401() {
        return format(401, 0, "请登录", null, null);
    }

    public static <T> String HTTP403() {
        return format(403, 0, "请登录", null, null);
    }

    public static <T> String HTTP500() {
        return format(500, 0, TIP500, null, null);
    }

    public static String Message(Message msg) {
        return JSONUtil.format(msg);
    }

}
