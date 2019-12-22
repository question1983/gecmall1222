package com.gec.gecmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.gec.gecmall.user.mapper")
public class GecmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GecmallUserApplication.class, args);
    }

}