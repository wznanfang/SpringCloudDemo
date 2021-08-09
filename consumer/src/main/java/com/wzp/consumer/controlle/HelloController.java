package com.wzp.consumer.controlle;

import com.wzp.consumer.feignclient.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp.wei
 * @date 2021/8/9 10:40
 */
@RestController
public class HelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping("/hi")
    public String hiFeign(){
        return helloFeignClient.hi("feign");
    }

}
