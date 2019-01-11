package com.alm.demo.controller;

import com.alm.demo.service.DemoService;
import com.alm.system.authority.Authority;
import com.alm.system.authority.AuthorityEnum;
import com.alm.system.enume.SessionEnum;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.RESTUtil;
import com.sun.net.httpserver.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-20 20:11</p>
 * <p>desc: </p>
 */
@Controller
@RequestMapping("/api/v1/demo")
public class DemoController {

    private final DemoService demoser;
    private final UserService userService;

    @Autowired
    public DemoController(UserService userService, DemoService demoser) {
        this.userService = userService;
        this.demoser = demoser;
    }

    @RequestMapping("/d1")
    @ResponseBody
    public ModelAndView test(HttpServletRequest req) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/test/t1");
        User u = new User();
        req.getSession().setAttribute(SessionEnum.user.getValue(), u);
        return modelAndView;
    }

    /**
     * 返回json
     */
    @RequestMapping("/d2")
    @ResponseBody
    public String test2(HttpServletRequest req) {
        return "/test/t2";
    }

    @RequestMapping(value = "/d22", method = {RequestMethod.POST})
    @ResponseBody
    public String test22(HttpServletRequest req) {
        return "/test/t2";
    }

    @Authority
    @RequestMapping("/d3")
    public String test3(HttpServletRequest req) {
        req.setAttribute("aa", "req.setAttr的值");
        return "/test/t1";
    }

    @Authority(AuthorityEnum.FORBIDDEN)
    @RequestMapping("/d4")
    public String test4(HttpServletRequest req) {
        req.setAttribute("aa", "req.setAttr的值");
        return "/test/t1";
    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String add(HttpServletRequest req, HttpSession session) {
        req.getSession().setAttribute("aa", "sdfsd");

        return "/test/t1";
    }

    @RequestMapping("/page")
    public void page() {
        demoser.selectAll();
    }

    @RequestMapping("/try")
    @ResponseBody
    public String trycatch() {
        User user = new User();
        demoser.insertUser(user);
        return RESTUtil.HTTP200(1, "success");
    }

    @RequestMapping("/example")
    @ResponseBody
    public String example() {
        return RESTUtil.HTTP200(demoser.example());
    }

}
