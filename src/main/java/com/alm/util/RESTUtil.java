package com.alm.util;


import com.sun.deploy.util.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:58</p>
 * <p>desc: API统一返回</p>
 */
public class RESTUtil {

    /**
     *
     * @param ok
     * @param msg
     * @param data
     * @return
     */
    public static<T> String HTTP200(int ok,String msg,T t){
        StringBuilder sb=new StringBuilder("{");
        sb.append("\"code\":200").append(",");
        sb.append("\"ok\":").append(ok).append(",");
        sb.append("\"msg\":\"").append(msg).append("\",");
        sb.append("\"data\":\"").append(JSONUtil.format(t)).append("\",");
        sb.append("}");
        String json=sb.toString();
        sb=null;
        return json;
    }

    public static String HTTP500(){
        return null;
    }
}
