package com.chuwei.controller;

import com.chuwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/11/29 21:50
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


}