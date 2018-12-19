package com.alm.user.controller;

import com.alm.user.po.User;
import com.alm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-17 19:26</p>
 * <p>DESC: </p>
 */
@Controller
@RequestMapping("/test")
public class UserController {

//    @Autowired
//    UserService userService;


//    @RequestMapping("/index")
//    @ResponseBody
//    public ModelAndView test(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("");
//        return modelAndView;
//    }
//
//    public void add() {
//        User user = new User();
//        user.setPhone("13155556666");
//
//    }
}
