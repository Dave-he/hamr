package com.heyx.hamr.business;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BusinessApp extends SpringApplication {

    /**
     * 启动类
     * @param args 参数
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(BusinessApp.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run();
    }
}
