package com.zhou.zhuguan.service;

import com.zhou.zhuguan.api.User;
import com.zhou.zhuguan.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserApi userApi;

    public String getUsreInfo () {
        User user = new User() {{
            setId(123456L);
            setName("李小龙");
        }};
        String orderInfo = userApi.getOrderInfo(user);
        return orderInfo;
    }

}
