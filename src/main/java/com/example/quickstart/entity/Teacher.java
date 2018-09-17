package com.example.quickstart.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Configuration
public class Teacher {
    private String name ;
    private String TeacherNo ;
    private String pic ;
}
