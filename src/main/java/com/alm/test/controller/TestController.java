package com.alm.test.controller;

import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.sun.net.httpserver.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-20 20:11</p>
 * <p>DESC:        </p>
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/t1")
    @ResponseBody
    public ModelAndView test(HttpServletRequest req){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/test/t1");
        req.setAttribute("aa","req.setAttr的值");
        return modelAndView;
    }

    @RequestMapping("/t2")
    @ResponseBody
    public String test2(HttpServletRequest req){
        return "/test/t2";
    }

    @RequestMapping("/t3")
    public String test3(HttpServletRequest req){
        req.setAttribute("aa","req.setAttr的值");
        return "/test/t1";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest req) {
        User user = new User();
        user.setPhone("13155556666");
        userService.insertSelective(user);
        return "/test/t1";
    }
}
