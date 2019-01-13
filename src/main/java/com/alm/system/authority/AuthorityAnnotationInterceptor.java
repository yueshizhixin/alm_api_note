package com.alm.system.authority;

import com.alm.system.enume.SessionEnum;
import com.alm.user.po.User;
import com.alm.util.RESTUtil;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-21 21:20</p>
 * <p>desc: 权限拦截器</p>
 */
public class AuthorityAnnotationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            Class<?> clazz = hm.getBeanType();
            Method m = hm.getMethod();
            try {
                if (clazz != null && m != null) {
                    boolean isClzAnnotation = clazz.isAnnotationPresent(Authority.class);
                    boolean isMethondAnnotation = m.isAnnotationPresent(Authority.class);
                    Authority authority = null;
                    // 如果方法和类声明中同时存在这个注解，那么方法中的会覆盖类中的设定。
                    if (isMethondAnnotation) {
                        authority = m.getAnnotation(Authority.class);
                    } else if (isClzAnnotation) {
                        authority = clazz.getAnnotation(Authority.class);
                    }
                    if (authority != null) {
                        if (AuthorityEnum.UNAUTHORIZED == authority.value()) {
                            User user = (User) req.getSession().getAttribute(SessionEnum.user.getValue());
                            if (user == null || user.getId() == null) {
                                req.getRequestDispatcher("/api/401").forward(req, res);
                                return false;
                            }
                        } else if (AuthorityEnum.FORBIDDEN == authority.value()) {
                            req.getRequestDispatcher("/api/403").forward(req, res);
                            return false;
                        }
                    }
                }
            } catch (Exception e) {
                req.getRequestDispatcher("/api/500").forward(req, res);
                return false;
            }
        }
        return true;
    }
}
