package com.chuwei.service.impl;

import com.chuwei.dao.BaseUser;
import com.chuwei.entity.UserRepository;
import com.chuwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/11 11:51
 */

@Service
public class BaseUserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public BaseUser addUser(BaseUser user){
        if(!StringUtils.hasLength(user.getUsername())){

        }
        return userRepository.save(user);
    }
    @Override
    public void edit(BaseUser user) {
        userRepository.save(user);
    }
    @Override
    public List<BaseUser> findUsers(String userName, Pageable pageable){

        Assert.notNull(userName, "UserName must not be null");

        if (!StringUtils.hasLength(userName)) {
            return this.userRepository.findAll();
        }

        return this.userRepository.findByUsernameContainingAllIgnoringCase(userName,pageable);
    }

    @Override
    public BaseUser findUserByMobile(String mobile){
        Assert.notNull(mobile, "mobile must not be null");
        return this.userRepository.findByMobileAllIgnoringCase(mobile);
    }

}