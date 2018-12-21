package com.alm.test.controller;

import com.alm.system.authority.Authority;
import com.alm.system.authority.AuthorityEnum;
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
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-20 20:11</p>
 * <p>desc: </p>
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/t1")
    @ResponseBody
    public ModelAndView test(HttpServletRequest req){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/test/t1");
        User u=new User();
        req.getSession().setAttribute("user",u);
        return modelAndView;
    }

    /**
     * 返回json
     */
    @RequestMapping("/t2")
    @ResponseBody
    public String test2(HttpServletRequest req){
        return "/test/t2";
    }

    @Authority
    @RequestMapping("/t3")
    public String test3(HttpServletRequest req){
        req.setAttribute("aa","req.setAttr的值");
        return "/test/t1";
    }

    @Authority(AuthorityEnum.FORBIDDEN)
    @RequestMapping("/t4")
    public String test4(HttpServletRequest req){
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

    @RequestMapping("/401")
    @ResponseBody
    public String Unauthorized(){
        return "{\"code\":401}";
    }
    @RequestMapping("/403")
    @ResponseBody
    public String Forbidden(){
        return "{\"code\":403}";
    }
}
