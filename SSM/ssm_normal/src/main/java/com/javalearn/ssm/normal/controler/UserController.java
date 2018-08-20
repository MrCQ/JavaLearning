package com.javalearn.ssm.normal.controler;

import com.javalearn.ssm.normal.base.BaseController;
import com.javalearn.ssm.normal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController{
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "hello world";
    }
}
