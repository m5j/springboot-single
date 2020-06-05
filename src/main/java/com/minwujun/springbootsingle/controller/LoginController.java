package com.minwujun.springbootsingle.controller;

import com.minwujun.springbootsingle.common.Result;
import com.minwujun.springbootsingle.model.form.LoginForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minwujun on 2020/6/4
 */
@RestController
@RequestMapping("/web/login")
public class LoginController {

    @PostMapping("login")
    public Result login(LoginForm loginForm) {

        return null;
    }
}
