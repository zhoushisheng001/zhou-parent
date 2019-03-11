package com.zhou.zhuguan.controller;

import com.zhou.zhuguan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   final Logger logger = LoggerFactory.getLogger(getClass());

   @Autowired
   private UserService userService;

    @RequestMapping("/getUserInfo")
    public String getUserInfo (){
        logger.info("查询用户信息开始...");
        String usreInfo = userService.getUsreInfo();
        return usreInfo;
    }
}
