package com.alm.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:52</p>
 * <p>desc: json工具类</p>
 */
public class JSONUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String format(T t) {
        try {
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

}
