package com.zhou.zhuguan.controller;

import com.zhou.zhuguan.api.UserApi;
import com.zhou.zhuguan.api.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements UserApi {

    @Override
    public String getOrderInfo(@RequestBody User user) {
        System.out.println("name：" + user.getName());
        return "OK2";
    }
}
