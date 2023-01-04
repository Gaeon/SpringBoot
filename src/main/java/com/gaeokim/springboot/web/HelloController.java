package com.gaeokim.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON 으로 반환
@RestController
public class HelloController {
    // HTTP 메소드인 Get 의 요청을 받을 수 있는 API 만들어줌
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
