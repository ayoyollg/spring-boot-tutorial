package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

//    @GetMapping("/incremental")
//    public String incremental() {
//                Long counter = redisTemplate.opsForValue().increment("counter", 1);
//        return "增加後的值:" + counter;
//    }
}