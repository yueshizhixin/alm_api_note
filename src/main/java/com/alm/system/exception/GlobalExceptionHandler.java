package com.alm.system.exception;

import com.alm.util.RESTUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-24 21:13</p>
 * <p>desc: 全局统一异常处理</p>
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public String handlerBindException(BindException e) {
        System.out.println("e.getMessage() = " + e.getMessage());
        e.printStackTrace();
        return RESTUtil.HTTP200(0,"参数绑定错误");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handlerException(Exception e) {
        e.printStackTrace();
        return RESTUtil.HTTP500();
    }


}
