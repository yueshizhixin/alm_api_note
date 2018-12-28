package com.alm.system.tip;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-28 20:39</p>
 * <p>desc: 用户模块提示</p>
 */
interface UserTip {
    String USER_NONE_SIGNNAME = "手机号、账号、邮箱皆为空";

    String USER_EXIST_ACC="账号已存在";
    String USER_EXIST_PHONE="手机号已存在";
    String USER_EXIST_EMAIL="邮箱已存在";
}
