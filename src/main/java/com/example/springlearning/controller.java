package com.example.springlearning;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
    @GetMapping("/hello")
        public String sayHello() {
            return "<h1>Hello ra choosh... server running</h1>";
        }
    }
