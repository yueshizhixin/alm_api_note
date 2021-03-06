package com.alm.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-29 20:26</p>
 * <p>desc: 读取配置文件</p>
 */
public class PropQiniuUtil {
    private static Properties properties;
    private static InputStream inputStream;

    private PropQiniuUtil() {
    }

    private static void initializeCheck() {
        if (properties == null) {
            properties = new Properties();
        }
        if (inputStream == null) {
            inputStream = PropQiniuUtil.class.getResourceAsStream("/qiniu.properties");
        }
    }

    public static String getValue(String key) {
        try {
            initializeCheck();
            properties.load(inputStream);
            return properties.getProperty(key, null);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getAK() {
        try {
            initializeCheck();
            properties.load(inputStream);
            return properties.getProperty("accessKey", null);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getSK() {
        try {
            initializeCheck();
            properties.load(inputStream);
            return properties.getProperty("secretKey", null);
        } catch (Exception e) {
            return null;
        }
    }

}
