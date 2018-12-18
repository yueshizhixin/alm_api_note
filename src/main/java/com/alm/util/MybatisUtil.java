package com.alm.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;


/**
 * Created by IntelliJ IDEA.
 * <p>USER: LISHUAI</p>
 * <p>DATE: 2018-12-18 19:57</p>
 * <p>DESC:
 */
public class MybatisUtil {
    /**
     * mybatis 自动生成方法
     *
     * @throws Exception 抛出异常
     */
    private void generator() throws Exception {
        List<String> warnings = new ArrayList<>();
        File configFile = ResourceUtils.getFile("classpath:mybatis/generator-config.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    /**
     * main 启动方法
     *
     * @param args main args
     */
    public static void main(String[] args) {
        try {
            MybatisUtil geneUtil = new MybatisUtil();
            geneUtil.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
