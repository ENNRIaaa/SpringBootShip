package com.shiguangping.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author liyan
 * @since 2021.1.14
 */
public class MyJob {

    private Logger logger = LoggerFactory.getLogger(MyJob.class);
    public final static long ONE_MINUTE =  10 * 1000;

    public void fixedDelayJob(){
        logger.info(DateTimeKit.formatDateTime(new Date())+" >>fixedDelay执行.... start");
        Thread.sleep(5000L);
    }
}
