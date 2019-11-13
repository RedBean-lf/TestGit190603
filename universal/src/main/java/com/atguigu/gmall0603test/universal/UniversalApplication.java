package com.atguigu.gmall0603test.universal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0603test.universal.mapper")
public class UniversalApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversalApplication.class, args);
    }

}
