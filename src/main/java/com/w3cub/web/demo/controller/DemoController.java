package com.w3cub.web.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/demo")
    public String demo() {
        return "This Demo!";
    }

}
