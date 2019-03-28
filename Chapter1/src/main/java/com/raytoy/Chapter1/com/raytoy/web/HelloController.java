package com.raytoy.Chapter1.com.raytoy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 修饰class，用来创建http请求的对象
public class HelloController {
    @RequestMapping("/hello") // 配置url映射
    public String index() {
        return "Hello World";
    }
}
