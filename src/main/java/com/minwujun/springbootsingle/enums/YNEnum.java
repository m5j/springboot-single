package com.minwujun.springbootsingle.enums;

import lombok.Getter;

@Getter
public enum YNEnum {
    Y("Y"),
    N("N");

    private String code;

    YNEnum(String code) {
        this.code = code;
    }
}
