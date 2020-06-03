package com.minwujun.springbootsingle.common;

import com.minwujun.springbootsingle.exception.BizException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new Result<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(BizException.class)
    public Result<String> BizExceptionHandler(BizException e) {
        return new Result<>(e.getResultCode(), e.getMsg());
    }

    //建议开发中注释掉这个，以便于发现问题
    @ExceptionHandler(Exception.class)
    public Result<String> ExceptionHandler(Exception e) {
        System.out.println(e.getMessage());
        return new Result<>(ResultCode.ERROR, e.getMessage());
    }
}
