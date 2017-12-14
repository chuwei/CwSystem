package com.chuwei.controller;

import com.chuwei.entity.BaseUser;
import com.chuwei.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/11/29 21:50
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public BaseUser getUser(@RequestParam("mobile") String mobile) {
        BaseUser user=new BaseUser();
        user = userService.findUserByMobile(mobile);
        return user;
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public void deleteUser(@RequestParam("id") int id){
        userService.deleteUserById(id);
    }
}