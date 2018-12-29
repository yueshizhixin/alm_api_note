package com.alm.system.snowFlake;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnowFlakeTest {

    @Test
    public void instance() {
    }

    @Test
    public void newId() {
        System.out.println(System.currentTimeMillis());
        System.out.println(SnowFlake.instance().newId());
    }
}