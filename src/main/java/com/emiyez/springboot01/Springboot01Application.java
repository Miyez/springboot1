package com.emiyez.springboot01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.emiyez")
@MapperScan("com.emiyez.springboot01.mapper")//开启扫包
public class Springboot01Application {

    public static void main(String[] args) {
        

        SpringApplication.run(Springboot01Application.class, args);
    }
}
