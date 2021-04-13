package com.shiguangping.schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {

    private int count = 0;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // 定时执行的方法上添加注解
    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        System.out.println("定时任务正在运行：" + (count++));
    }

    @Scheduled(fixedRate = 6000L)
    private void printCurrentTime(){
        System.out.println("当前时间："+dateFormat.format(new Date()));
    }
}
