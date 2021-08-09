package com.wzp.consumer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zp.wei
 * @date 2021/8/9 10:38
 */
@FeignClient(value = "provider" )
public interface HelloFeignClient {

    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);


}
