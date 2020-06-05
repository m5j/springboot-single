package com.minwujun.springbootsingle.model.form;

import lombok.Data;
import lombok.ToString;

/**
 * Created by minwujun on 2020/6/4
 */
@Data
@ToString
public class LoginForm {

    private String phone;
    private String password;
}
