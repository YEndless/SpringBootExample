package com.example.quickstart.entity;

import lombok.*;
import org.springframework.context.annotation.Configuration;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
@Configuration
public class Student {
    private String name ;
    private String pic ;
    private int age ;
    private String male ;
    private String studentNo ;
    private String school;

}
