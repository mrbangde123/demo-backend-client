package com.hehui.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/client")   // ⭐ 新东西：类级别的路径前缀
public class ClientController {

    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> result = new HashMap<>();
        result.put("service", "demo-backend-client");
        result.put("message", "Hello from client service!");
        result.put("timestamp", LocalDateTime.now().toString());
        return result;
    }

    @GetMapping("/greet/{name}")
    public Map<String, Object> greet(@PathVariable String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("from", "demo-backend-client");
        result.put("greeting", "Hi, " + name + "! Nice to meet you.");
        return result;
    }
}
