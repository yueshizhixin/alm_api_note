package com.alm.system.exception;

import com.alm.util.RESTUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-24 21:13</p>
 * <p>desc: 全局统一异常处理</p>
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER= LogManager.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public String handlerBindException(BindException e) {
        LOGGER.error("\n===异常开始");
        LOGGER.error(e);
        Arrays.stream(e.getStackTrace()).forEach(LOGGER::error);
        LOGGER.error("\n===异常结束");
        return RESTUtil.HTTP200(0,"参数绑定错误");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handlerException(Exception e) {
        LOGGER.error("\n===异常开始");
        LOGGER.error(e);
        Arrays.stream(e.getStackTrace()).forEach(LOGGER::error);
        LOGGER.error("\n===异常结束");
        return RESTUtil.HTTP500();
    }


}
