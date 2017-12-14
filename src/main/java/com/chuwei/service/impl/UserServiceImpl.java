package com.chuwei.service.impl;

import com.chuwei.entity.BaseUser;
import com.chuwei.dao.repository.UserRepository;
import com.chuwei.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public BaseUser addUser(BaseUser user){
        if(!StringUtils.hasLength(user.getUsername())){

        }
        return userRepository.save(user);
    }

    @Override
    public BaseUser edit(BaseUser user) {
        if(!StringUtils.hasLength(user.getUsername())){

        }
        return userRepository.save(user);
    }

    @Override
    public List<BaseUser> findUsers(String userName, Pageable pageable){

        Assert.notNull(userName, "UserName must not be null");

        if (!StringUtils.hasLength(userName)) {
            return userRepository.findAll();
        }

        return userRepository.findByUsernameContainingAllIgnoringCase(userName,pageable);
    }

    @Override
    public BaseUser findUserByMobile(String mobile){
        Assert.notNull(mobile, "mobile must not be null");
        return userRepository.findByMobileAllIgnoringCase(mobile);
    }

    @Override
    public void deleteUserById(int id){
        BaseUser user = userRepository.findById(id);
        user.setStatus(-1);
        userRepository.save(user);
    }
}