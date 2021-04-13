package com.shiguangping.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// 启动定时任务
@EnableScheduling
@SpringBootApplication
public class SpringbootScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootScheduleApplication.class, args);
    }

}
