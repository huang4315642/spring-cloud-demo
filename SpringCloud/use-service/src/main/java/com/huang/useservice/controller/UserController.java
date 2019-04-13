package com.huang.useservice.controller;

import com.huang.useservice.mapper.UserMapper;
import com.huang.useservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id){
//            try {
//               Thread.sleep(2000L);
//            } catch (InterruptedException e){
//               e.printStackTrace();
//           }

        return  userMapper.selectByPrimaryKey(id);
    }
}
