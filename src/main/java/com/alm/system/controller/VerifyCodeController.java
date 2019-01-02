package com.alm.system.controller;

import com.alm.system.snowFlake.SnowFlake;
import com.alm.util.VerifyCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-02 20:28</p>
 * <p>desc: 验证码</p>
 */
@RestController
public class VerifyCodeController {

    /**
     * 图片验证码
     * @param req
     * @param res
     */
    @RequestMapping("/imgVerify")
    public void geneCode(HttpServletRequest req, HttpServletResponse res) {
        res.setHeader("Pragma", "No-cache");
        res.setHeader("Cache-Control", "no-cache");
        res.setDateHeader("Expires", 0);
        res.setContentType("image/jpeg");
        String code = VerifyCodeUtil.generateVerifyCode(5);
        req.getSession().setAttribute("imgVerify", code);
        try {
            VerifyCodeUtil.outputImage(res.getOutputStream(), code);
        } catch (IOException e) {
            req.getSession().setAttribute("imgVerify", SnowFlake.instance().newId().toString());
        }
    }
}
