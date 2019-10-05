package com.alm.system.listener;

import com.alm.system.GlobalDict;

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
        try {
            System.out.println("====初始化...");
            GlobalDict.instance().init(sce.getServletContext());

            System.out.println("====初始化完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
