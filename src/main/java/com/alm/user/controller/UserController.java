package com.alm.user.controller;

import com.alm.system.enume.CaptchaEnum;
import com.alm.system.tip.GlobalTip;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.JSONUtil;
import com.alm.util.RESTUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-17 19:26</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@ModelAttribute User u) {
        User user = userService.selectPublicMessage(u.getId());
        if (user != null) {
            return RESTUtil.HTTP200(user);
        } else {
            return RESTUtil.HTTP200(0, GlobalTip.COMM_NONE);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = {RequestMethod.POST})
    public String userTag(HttpServletRequest req, HttpSession session, @ModelAttribute User u, @RequestParam(value = "tag") String tag, @RequestParam(value = "captcha") String captcha) {
        Message msg;
        //用户注册或登录
        if ("signUp".equals(tag) || "signIn".equals(tag)) {
            //检测验证码
            msg = userService.checkCaptcha(session.getAttribute(CaptchaEnum.type.IMG.getValue()), captcha);
            if (msg == null || msg.getOk() == 0) {
                return RESTUtil.Message(msg);
            }
            //用户注册
            if ("signUp".equals(tag)) {
                msg = userService.insertSignUp(u);
                if (msg == null || msg.getOk() == 0) {
                    return RESTUtil.Message(msg);
                }
            }
            //用户登录
            msg = userService.signIn(u);
            return RESTUtil.Message(msg);
        } else {
            return RESTUtil.HTTP200(0, GlobalTip.COMM_PARAM_FAIL);
        }
    }

}
