package com.dk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Deacription TODO
 * @Author Lenovo
 * @Date 2020/12/4 10:31
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.dk.mapper")
public class SpringbootApplicationLog {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplicationLog.class,args);
    }
}

