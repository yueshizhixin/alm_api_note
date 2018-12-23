package com.alm.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:27</p>
 * <p>desc: </p>
 */
@Controller
public class HttpController {

    @RequestMapping("/401")
    public String HTTP401() {
        return "{\"code\":401}";
    }

    @RequestMapping("/403")
    public String HTTP403() {
        return "{\"code\":403}";
    }

    @RequestMapping("/500")
    public String HTTP500() {
        return "{\"code\":500}";
    }
}
