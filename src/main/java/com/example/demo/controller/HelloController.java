package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.*;

/**
 * @date: 2021/9/18 17:00
 * @author: Hello
 */
@Api(value = "desc of class")
@RestController
public class HelloController {

    @ApiOperation(value = "desc of method", notes = "")
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
