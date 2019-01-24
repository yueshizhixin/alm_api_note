package com.alm.system.controller;

import com.alm.util.PropQiniuUtil;
import com.alm.util.RESTUtil;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.qiniu.util.Base64;
import com.qiniu.util.StringMap;
import com.qiniu.util.UrlSafeBase64;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-23 20:54</p>
 * <p>desc: </p>
 */
@RestController
@RequestMapping("/api/v1")
public class FileController {

    private static String ak = PropQiniuUtil.getAK();
    private static String sk = PropQiniuUtil.getSK();
    private static Auth auth = Auth.create(ak, sk);
    private static String bucketname = "alm-yszx";    //空间名

    /**
     * 获取token
     * 优化 时间计时器自动获取
     */
    @RequestMapping(value = "/cdn/token", method = RequestMethod.GET)
    public String getUpToken() {
        return RESTUtil.HTTP200(auth.uploadToken(bucketname, null, 30, new StringMap().put("insertOnly", 1)));
    }

}
