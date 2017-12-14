package com.chuwei.service;

import com.chuwei.dao.repository.UserRepository;
import com.chuwei.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/11 11:39
 */
public interface UserService {

    BaseUser addUser(BaseUser user);

    BaseUser edit(BaseUser user);

    List<BaseUser> findUsers(String userName, Pageable pageable);

    BaseUser findUserByMobile(String mobile);

    void deleteUserById(int id);
}
