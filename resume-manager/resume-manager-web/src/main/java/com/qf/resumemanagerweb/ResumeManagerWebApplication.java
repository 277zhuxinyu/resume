package com.qf.resumemanagerweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.qf.resumemanagerdao.dao")
public class ResumeManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeManagerWebApplication.class, args);
    }

}
