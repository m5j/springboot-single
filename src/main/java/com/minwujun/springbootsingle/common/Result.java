package com.minwujun.springbootsingle.common;

import lombok.Getter;

@Getter
public class Result<T> {

    private String code;

    private String msg;

    private T data;

    public Result(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
