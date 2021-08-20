package com.wzp.consumer.feignclient;

import com.wzp.consumer.fallback.HelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zp.wei
 * @date 2021/8/9 10:38
 */
@FeignClient(name = "provider",fallback = HelloFallback.class)
public interface HelloFeignClient {

    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);

    @GetMapping("/hello")
    String hello();


}
