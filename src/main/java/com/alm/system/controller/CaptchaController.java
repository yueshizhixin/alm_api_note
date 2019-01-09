package com.alm.system.controller;

import com.alm.system.enume.CaptchaEnum;
import com.alm.system.snowFlake.SnowFlake;
import com.alm.util.VerifyCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-02 20:28</p>
 * <p>desc: 验证码</p>
 */
@RestController
@RequestMapping("/api/v1/captcha")
public class CaptchaController {

    /**
     * 图片验证码
     */
    @RequestMapping(value = "/img", method = {RequestMethod.GET})
    public void geneCode(HttpSession session, HttpServletResponse res) {
        String key = CaptchaEnum.type.IMG.getValue();
        res.setHeader("Pragma", "No-cache");
        res.setHeader("Cache-Control", "no-cache");
        res.setDateHeader("Expires", 0);
        res.setContentType("image/jpeg");
        String code = VerifyCodeUtil.generateVerifyCode(4);
        session.setAttribute(key, code);
        try {
            VerifyCodeUtil.outputImage(res.getOutputStream(), code);
        } catch (IOException e) {
            session.setAttribute(key, SnowFlake.instance().newId().toString());
        }
    }
}
