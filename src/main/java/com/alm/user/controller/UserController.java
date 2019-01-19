package com.alm.user.controller;

import com.alm.note.service.NoteService;
import com.alm.system.enume.CaptchaEnum;
import com.alm.system.enume.SessionEnum;
import com.alm.system.service.CommService;
import com.alm.system.vo.Message;
import com.alm.user.po.User;
import com.alm.user.service.UserService;
import com.alm.util.RESTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    private final NoteService noteService;

    @Autowired
    public UserController(UserService userService, CommService commService, NoteService noteService) {
        this.userService = userService;
        this.commService = commService;
        this.noteService = noteService;
    }

    @RequestMapping(value = "/user/tag=signIn", method = {RequestMethod.POST})
    public String userTag(@ModelAttribute User u, HttpSession session, @RequestParam String captcha) {
        Object c = session.getAttribute(CaptchaEnum.type.IMG.getValue());
        if (c == null || c.toString().trim().equals("")) {
            return RESTUtil.HTTP200(0, "验证码异常");
        }
        if (captcha == null || captcha.equals("")) {
            return RESTUtil.HTTP200(0, "验证码未填写");
        }
        if (!c.toString().toUpperCase().equals(captcha.toUpperCase())) {
            return RESTUtil.HTTP200(0, "验证码错误");
        }
        Message msg = userService.signIn(u);
        System.out.println(4);
        if (msg.getOk() == 1) {
            User user = userService.selectUserByAcc(u.getAcc()).get(0);
            session.setAttribute(SessionEnum.user.getValue(), user);
            return RESTUtil.HTTP200(1, "登录成功");
        }
        return RESTUtil.Message(msg);
    }

    @RequestMapping(value = "/user/tag=signFresh", method = {RequestMethod.POST})
    public String userFresh(HttpSession session) {
        Message msg = new Message();
        User user = (User) session.getAttribute(SessionEnum.user.getValue());
        if (user != null && user.getId() != null) {
            msg.setOk(1);
        }
        return RESTUtil.Message(msg);
    }

}
