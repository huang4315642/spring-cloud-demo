package com.huang.userconsumer.feignClient.feignClientFallback;

import com.huang.userconsumer.feignClient.UserFeignClient;
import com.huang.userconsumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setId(id);
         user.setName("用户信息查询出现异常");
        return user;
    }
}
