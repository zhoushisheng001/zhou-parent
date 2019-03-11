package com.zhou.zhuguan.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


public interface UserApi {

    @RequestMapping("/getOrderInfo")
    String getOrderInfo(@RequestBody User user);
}
