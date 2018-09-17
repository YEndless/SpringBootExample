package com.example.quickstart.controller;

import com.example.quickstart.entity.Course;
import com.example.quickstart.entity.Student;
import com.example.quickstart.entity.Teacher;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CourseController {
    private Student student ;
    private Teacher teacher ;
    @Resource(name = "course")
    private Course course ;

    @GetMapping("/course")
    public String getCourse(){
        return course.toString() ;
    }
    public String course(ModelMap map){
        student.setName("ye");
        student.setAge(20);
        student.setMale("男");
        teacher.setName("xu");
        teacher.setTeacherNo("10");
        //将模型加入视图
        map.addAttribute("student",student);
        return "course" ;
    }

}
