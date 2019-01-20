package com.alm.util;

import com.alm.system.exception.GlobalExceptionHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.json.Json;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:52</p>
 * <p>desc: json工具类</p>
 */
public class JSONUtil {

    private static final Logger LOGGER = LogManager.getLogger(JSONUtil.class);
    private static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * json序列化
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> String format(T t) {
        try {
            if (t == null) {
                return null;
            }
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            LOGGER.error("\n===异常开始\tjson转化错误");
            LOGGER.error(e);
            Arrays.stream(e.getStackTrace()).forEach(LOGGER::error);
            LOGGER.error("\n===异常结束");
            return null;
        }
    }

}
