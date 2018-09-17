package com.example.quickstart.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Course {
    @Resource
    private Student student ;
    @Resource
    private Teacher teacher ;
}
