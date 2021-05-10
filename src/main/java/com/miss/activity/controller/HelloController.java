package com.miss.activity.controller;

import com.miss.activity.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Result hello() {
        return Result.success("hello dingzi");
    }

}
