package com.alm.user.service.impl;

import com.alm.system.snowFlake.SnowFlake;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/springMVC.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void selectPublicMessage() {
//        assertEquals(Optional.ofNullable(6291465487100411904L), java.util.Optional.ofNullable(userService.selectPublicMessage(6291465487100411904L).getId()));
    }

    @Test
    public void checkUserUnique() {
        User user = new User();
        user.setSignType(2);
        user.setAcc("333");
        user.setPhone("affa");
        Message msg=userService.checkUnique(user);
        System.out.println(msg.getOk());
        System.out.println(msg.getMsg());
    }


    @Test
    public void insertUserSignUp() {
        User user = new User();
        user.setSignType(1);
        user.setUserName("test12");
        user.setAcc("33ss3");
        user.setPhone("13155556666");
        user.setPwd("asdf");
        user.setId(SnowFlake.instance().newId());
        Message msg=userService.insertSignUp(user);
        System.out.println(msg.getOk());
        System.out.println(msg.getMsg());
    }
}