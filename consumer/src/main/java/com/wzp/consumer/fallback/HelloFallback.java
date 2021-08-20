package com.wzp.consumer.fallback;

import com.wzp.consumer.feignclient.HelloFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author zp.wei
 * @date 2021/8/20 10:38
 */
@Component
public class HelloFallback implements HelloFeignClient {

    @Override
    public String hi(String name) {
        return "系统繁忙，请稍后再试！";
    }

    @Override
    public String hello() {
        return "系统繁忙，请稍后再试！";
    }
}
