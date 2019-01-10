package com.alm.user.controller;

import com.alm.system.enume.CaptchaEnum;
import com.alm.system.service.CommService;
import com.alm.system.tip.GlobalTip;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.JSONUtil;
import com.alm.util.RESTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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
    private final CommService commService;


    @Autowired
    public UserController(UserService userService, CommService commService) {
        this.userService = userService;
        this.commService = commService;
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

    /**
     * 注册与登录
     *
     * @param session
     * @param user
     * @param tag
     * @param captcha
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user/act=sign", method = {RequestMethod.POST})
    public String userSign(HttpSession session, @ModelAttribute User user, @RequestParam(value = "tag") String tag, @RequestParam(value = "captcha") String captcha) {
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
                msg = userService.insertSignUp(user);
                if (msg == null || msg.getOk() == 0) {
                    return RESTUtil.Message(msg);
                }
            }
            //用户登录
            msg = userService.signIn(user);
            //放入session
            if (msg.getOk() == 1) {
                commService.sessionUpdateUser(session, user.getAcc());
            }
            return RESTUtil.Message(msg);
        } else {
            return RESTUtil.HTTP200(0, GlobalTip.COMM_PARAM_FAIL);
        }
    }

    /**
     * 用户动作
     * 登录刷新
     * 用户退出
     *
     * @param session
     * @param tag
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user", method = {RequestMethod.POST})
    public String userTag(HttpSession session, @RequestParam(value = "tag") String tag) {
        Message msg;
        //登录刷新
        if ("signFresh".equals(tag)) {
            msg = new Message();
            User u = (User) session.getAttribute("user");
            if (u != null && u.getId() != null && u.getId() > 0) {
                msg.setOk(1);
//                commService.sessionUpdateUser(session, u.getId());
                return RESTUtil.Message(msg);
            }
            return RESTUtil.Message(msg);
        } else if ("signOut".equals(tag)) {
            msg = new Message(1);
            session.setAttribute("user", null);
            return RESTUtil.Message(msg);
        } else {
            return RESTUtil.HTTP200(0, GlobalTip.COMM_PARAM_FAIL);
        }
    }

}
