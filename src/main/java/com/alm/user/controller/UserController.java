package com.alm.user.controller;

import com.alm.system.tip.GlobalTip;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
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
import javax.ws.rs.PathParam;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-17 19:26</p>
 * <p>desc: </p>
 */
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(HttpServletRequest req,@ModelAttribute User u) {
        User user = userService.selectUserPublicMessage(u.getId());
        if (user != null) {
            return RESTUtil.HTTP200(user);
        } else {
            return RESTUtil.HTTP200(0, GlobalTip.DATA_NONE);
        }
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userTag(HttpServletRequest req,@ModelAttribute User u,@RequestParam(value = "tag")String tag) {
        if ("signUp".equals(tag)) {
            return RESTUtil.Message(userService.signUp(u));
        }
        return RESTUtil.HTTP200(u);
    }

}
