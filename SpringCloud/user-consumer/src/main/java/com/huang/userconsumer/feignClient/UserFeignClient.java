package com.huang.userconsumer.feignClient;

import com.huang.userconsumer.feignClient.feignClientFallback.UserFeignClientFallback;
import com.huang.userconsumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="user-service",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Integer id);
}
