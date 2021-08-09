package com.wzp.provider1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp.wei
 * @date 2021/8/9 10:35
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return "hello " + name + ", i'm provider ,my port:" + port;

    }

}
