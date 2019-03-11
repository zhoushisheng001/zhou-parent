package com.zhou.zhuguan.api;

import com.zhou.zhuguan.common.Constant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = Constant.ORDER_NAME)
public interface UserApi {

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo (@RequestBody User user);
}
