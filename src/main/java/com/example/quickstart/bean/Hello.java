package com.example.quickstart.bean;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public String getHello() {
        return "Hello Spring Boot!";
    }

}
