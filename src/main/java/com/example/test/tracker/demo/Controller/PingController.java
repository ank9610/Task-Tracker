package com.example.test.tracker.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test-tracker")
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
