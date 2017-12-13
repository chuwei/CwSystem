package com.chuwei.entity;

import com.chuwei.dao.BaseUser;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/11/29 23:07
 * @author chuwei
 */
public interface UserRepository extends JpaRepository<BaseUser,String> {

    BaseUser findById(long id);
    int deleteById(int id);
    List<BaseUser> findByUsernameContainingAllIgnoringCase(String userName, Pageable pageable);

    BaseUser findByMobileAllIgnoringCase(String mobile);
}
