package com.alm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-27 20:32</p>
 * <p>desc: 日期</p>
 */
public class DateUtil {
    private static String defaultTime = "1900-01-01 00:00:00";
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String nowString() {
        return sdf.format(new Date());
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    public static String defaultTimeString() {
        return defaultTime;
    }

    public static Date defaultTime() {
        try {
            return sdf.parse(defaultTime);
        } catch (Exception e) {
            return null;
        }
    }
}
