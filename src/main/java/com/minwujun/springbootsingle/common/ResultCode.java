package com.minwujun.springbootsingle.common;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS("1000", "操作成功"),
    FAILED("2000", "响应失败"),
    VALIDATE_FAILED("2001", "参数校验失败"),
    ERROR("2002", "服务器异常"),
    USER_NOT_FOUND("3001", "用户不存在"),
    ;

    private String code;
    private String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
