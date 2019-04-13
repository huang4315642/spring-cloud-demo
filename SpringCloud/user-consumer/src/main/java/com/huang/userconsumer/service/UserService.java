package com.huang.userconsumer.service;

import com.huang.userconsumer.feignClient.UserFeignClient;
import com.huang.userconsumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserFeignClient userFeignClient;

//    @HystrixCommand(fallbackMethod = "queryByIdFallback" )
    public User queryById(Integer id){
        User user = userFeignClient.queryById(id);
        return user;
    }

//    public User queryByIdFallback(Integer id){
//        User user = new User();
//        user.setId(id);
//        user.setName("用户信息查询出现异常");
//        return user;
//    }

}
