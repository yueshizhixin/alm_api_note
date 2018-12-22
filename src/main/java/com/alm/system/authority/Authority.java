package com.alm.system.authority;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-21 21:17</p>
 * <p>desc: API权限检查</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
public @interface Authority {
    AuthorityEnum value() default AuthorityEnum.UNAUTHORIZED;
}
