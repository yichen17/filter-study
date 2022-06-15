package com.yichen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qiuxinchao
 * @version 1.0
 * @date 2022/6/15 17:25
 * @describe
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
