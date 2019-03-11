package com.zhou.zhuguan.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @author zhoushisheng
 */
@Component
public class ZhouRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("token","江西");
    }
}
