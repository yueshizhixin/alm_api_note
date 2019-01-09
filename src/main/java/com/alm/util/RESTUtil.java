package com.alm.util;


import com.alm.system.tip.GlobalTip;
import com.alm.system.vo.Message;
import com.sun.deploy.util.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:58</p>
 * <p>desc: API统一返回</p>
 */
public class RESTUtil {

    /**
     * API统一json
     * @param ok 是否操作成功
     * @param msg 信息
     * @param t 数据
     * @param <T> 数据
     * @return 成功json
     */
    private static<T> String format(int code,int ok,String msg,T t,int length){
        StringBuilder sb=new StringBuilder("{");
        sb.append("\"code\":").append(code).append(",");
        sb.append("\"ok\":").append(ok).append(",");
        sb.append("\"msg\":\"").append(msg).append("\",");
        sb.append("\"data\":").append(JSONUtil.format(t)).append(",");
        sb.append("\"length\":").append(length);
        sb.append("}");
        String json=sb.toString();
        sb=null;
        return json;
    }

    public static<T> String HTTP200(T t){
        return format(200,1,"",t,1);
    }

    public static<T> String HTTP200(T t,int length){
        return format(200,1,"",t,length);
    }

    public static<T> String HTTP200(int ok,String msg){
        return format(200,ok,msg,null,1);
    }

    public static String Message(Message msg){
        return JSONUtil.format(msg);
    }

    private static String TIP500=Exception.class.getName();

    public static<T> String HTTP500(){
        return format(500,0, TIP500,null,1);
    }
}
