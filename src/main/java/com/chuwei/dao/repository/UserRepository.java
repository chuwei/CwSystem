package com.chuwei.dao.repository;

import com.chuwei.entity.BaseUser;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/11/29 23:07
 * @author chuwei
 */
public interface UserRepository extends JpaRepository<BaseUser,String> {

    BaseUser findById(int id);
    List<BaseUser> findByUsernameContainingAllIgnoringCase(String userName, Pageable pageable);
    BaseUser findByMobileAllIgnoringCase(String mobile);

}
