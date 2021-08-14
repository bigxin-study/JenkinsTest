package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzx
 * @version 1.0
 * @description: TODO
 * @date 2021/8/12 23:31
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "在天愿做比翼鸟，在地愿为连理枝";
    }
}
