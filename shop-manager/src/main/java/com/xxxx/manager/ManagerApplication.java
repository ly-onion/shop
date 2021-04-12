package com.xxxx.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PROJECT_NAME: shop
 * @DESCRIPTION: 后台启动类
 * @USER: 洋葱
 * @DATE: 2021/4/7 18:00
 */
@SpringBootApplication
@MapperScan("com.xxxx.manager.mapper")
public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class,args);
    }
}
