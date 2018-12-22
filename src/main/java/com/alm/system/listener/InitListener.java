package com.alm.system.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-20 20:35</p>
 * <p>desc: 服务启动监听器 </p>
 */
public class InitListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("====启动成功");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}