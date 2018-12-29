package com.alm.util;

import javax.validation.constraints.NotNull;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-29 20:26</p>
 * <p>desc: 读取配置文件</p>
 */
public class PropSnowFlakeUtil {
    private static Properties properties;
    private static InputStream inputStream;

    private PropSnowFlakeUtil() {
    }

    private static void initializeCheck() {
        if (properties == null) {
            properties = new Properties();
        }
        if (inputStream == null) {
            inputStream = PropSnowFlakeUtil.class.getResourceAsStream("/snowFlake.properties");
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

    /**
     * 获取数据中心id
     * @return
     */
    public static Integer getCenterId() {
        try {
            initializeCheck();
            properties.load(inputStream);
            return Integer.parseInt(properties.getProperty("centerId", null));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取工作机器id
     * @return
     */
    public static Integer getWorkerId() {
        try {
            initializeCheck();
            properties.load(inputStream);
            return Integer.parseInt(properties.getProperty("worderId", null));
        } catch (Exception e) {
            return null;
        }
    }
}
