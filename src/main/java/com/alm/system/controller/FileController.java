package com.alm.system.controller;

import com.alm.system.authority.Authority;
import com.alm.util.JSONUtil;
import com.alm.util.PropQiniuUtil;
import com.alm.util.RESTUtil;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-23 20:54</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1")
public class FileController {

//    private static String ak = PropQiniuUtil.getAK();
//    private static String sk = PropQiniuUtil.getSK();
//    private static Auth auth = Auth.create(ak, sk);
//    private static String bucket = "alm-yszx";    //空间名
//    private static Configuration configuration = new Configuration(Zone.zone1());
//
//    /**
//     * 获取token
//     * 优化 计时器自动获取
//     */
//    @Authority
//    @RequestMapping(value = "/cdn/token", method = RequestMethod.GET)
//    public String getUpToken() {
//        return RESTUtil.HTTP200(auth.uploadToken(bucket, null, 30, new StringMap().put("insertOnly", 1)));
//    }

}
