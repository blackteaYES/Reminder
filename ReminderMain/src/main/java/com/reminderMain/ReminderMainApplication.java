package com.reminderMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/6 11:29 下午
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.common", "com.reminderMain"})
public class ReminderMainApplication {
    public static void main(String[] args) {
        new SpringApplication(ReminderMainApplication.class).run();
    }
}
