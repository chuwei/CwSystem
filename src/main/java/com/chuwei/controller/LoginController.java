package com.chuwei.controller;

import com.chuwei.dao.BaseUser;
import com.chuwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/12 10:52
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/getUser")
    public BaseUser getUser(String mobile) {
        BaseUser user=new BaseUser();
        userService.findUserByMobile(mobile);
        return user;
    }
}
