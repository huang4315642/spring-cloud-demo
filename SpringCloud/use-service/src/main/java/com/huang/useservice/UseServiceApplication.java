package com.huang.useservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.huang.useservice.mapper")
@EnableDiscoveryClient
public class UseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseServiceApplication.class, args);
    }

}
