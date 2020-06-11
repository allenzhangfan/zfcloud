package com.zf.userserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "hello接口")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    String port;

    @ApiOperation(value = "hello方法")
    @ApiImplicitParam(name = "name", value = "名字", required = true)
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {

        return "hi " + name + ", i am from port: " + port;
    }

}
