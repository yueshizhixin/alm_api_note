package com.alm.asset.controller;

import com.alm.system.authority.Authority;
import com.alm.util.JSONUtil;
import com.alm.util.PropQiniuUtil;
import com.alm.util.RESTUtil;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-27 20:09</p>
 * <p>desc: 资源</p>
 */
@RestController
@RequestMapping("/api/v1")
public class AssetController {

    private static String ak = PropQiniuUtil.getAK();
    private static String sk = PropQiniuUtil.getSK();
    private static Auth auth = Auth.create(ak, sk);
    private static String bucket = "alm-yszx";    //空间名
    private static Configuration configuration = new Configuration(Zone.zone1());

    /**
     * 获取背景
     */
    @RequestMapping(value = "/asset/bg", method = RequestMethod.GET)
    public String getBGList() {
        return getList("asset/bg/");
    }

    /**
     * 获取头像
     */
    @RequestMapping(value = "/asset/head", method = RequestMethod.GET)
    public String getHEADList() {
        return getList("asset/head/");
    }

    /**
     * 获取私密
     */
    @Authority
    @RequestMapping(value = "/asset/private", method = RequestMethod.GET)
    public String getPRIVATEList() {
        return getList("asset/private/");
    }

    private String getList(String prefix) {
        BucketManager bucketManager = new BucketManager(auth, configuration);
        int limit = 1000;
        String delimiter = "";
        BucketManager.FileListIterator fileListIterator =
                bucketManager.createFileListIterator(
                        bucket, prefix, limit, delimiter);
        StringBuilder sb = new StringBuilder();
        fileListIterator.forEachRemaining(x -> sb.append(JSONUtil.format(x)));
        return RESTUtil.HTTP200(sb.toString());
    }
}
