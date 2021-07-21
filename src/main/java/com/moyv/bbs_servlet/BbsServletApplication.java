package com.moyv.bbs_servlet;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 0
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.moyv.bbs_servlet.dao")
public class BbsServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbsServletApplication.class, args);
    }

}
