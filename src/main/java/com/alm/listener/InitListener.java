package com.alm.listener;

import org.apache.logging.slf4j.Log4jLogger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-20 20:35</p>
 * <p>DESC:        </p>
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
