package com.huang.userconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@SpringCloudApplication
@EnableFeignClients
public class UserConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }


}
