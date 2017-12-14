package com.chuwei.service.impl; 

import com.chuwei.entity.BaseUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 11, 2017</pre> 
* @version 1.0 
*/ 

  
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findUsers(String name, Pageable pageable) 
* 
*/
@Autowired
private UserServiceImpl userService;

@Test
public void testFindUsers() throws Exception {

} 

/** 
* 
* Method: findUserByEmail(String email) 
* 
*/ 
@Test
public void testFindUserByEmail() throws Exception {
    BaseUser user = userService.findUserByMobile("18605818616");
    System.out.print(user);
    Assert.assertEquals("admin",user.getUsername());
} 


} 
