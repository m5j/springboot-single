package com.minwujun.springbootsingle.exception;

import com.minwujun.springbootsingle.common.ResultCode;
import lombok.Getter;

@Getter
public class BizException extends RuntimeException {
    private ResultCode resultCode;
    private String msg;

    public BizException() {
        this(ResultCode.FAILED, ResultCode.FAILED.getMsg());
    }

    public BizException(String msg) {
        this(ResultCode.FAILED, msg);
    }

    public BizException(ResultCode resultCode) {
        this(resultCode, resultCode.getMsg());
    }

    public BizException(ResultCode resultCode, String msg) {
        super(msg);
        this.resultCode = resultCode;
        this.msg = msg;
    }
}
