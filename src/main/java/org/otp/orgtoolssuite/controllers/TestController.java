package org.otp.orgtoolssuite.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test v1";
    }
}