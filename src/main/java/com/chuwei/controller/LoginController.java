package com.chuwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/12 10:52
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String index() {
        return "Greetings from Visit CwSystem!";
    }

}
