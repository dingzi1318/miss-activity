package com.miss.activity.handler;

import com.alibaba.fastjson.JSON;
import com.miss.activity.enums.ResultCode;
import com.miss.activity.exception.BusinessException;
import com.miss.activity.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常统一处理器
 *
 * @author dingzi
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 自定义业务异常处理
     */
    @ExceptionHandler(value = BusinessException.class)
    public Result bizExceptionHandler(HttpServletRequest request, BusinessException e) {
        log.error("发生业务异常，request url:{}, param:{}, cause:{}",
                request.getRequestURL(), JSON.toJSON(request.getParameterMap()), e.getMessage());
        return Result.fail(e.getCode(), e.getMessage());
    }

    /**
     * 处理空指针异常
     */
    @ExceptionHandler(value = NullPointerException.class)
    public Result nullPointExceptionHandler(HttpServletRequest request, Exception e) {
        log.error("发生未知的异常了，request url:{}, param:{}",
                request.getRequestURL(), JSON.toJSON(request.getParameterMap()), e);
        return Result.fail(ResultCode.SYSTEM_EXCEPTION);
    }

}
