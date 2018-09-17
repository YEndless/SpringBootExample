package com.example.quickstart.controller;

import com.example.quickstart.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    //注入一个student类的对象，被spring容器托管 --bean
    @Resource
    private Student student ;
    @Resource
    private Student student2 ;
    @Resource
    private Student student3 ;
    @Resource
    private List<Student> studentList ;

    //get请求映射
    @GetMapping("/index")
    public String index(ModelMap map){
        student = new Student() ;
        student2 = new Student();
        student3 = new Student() ;
        studentList = new ArrayList<>( ) ;
        student.setName("林动");
        student.setPic("1.png");
        student.setAge(20);
        student.setMale("男");
        student.setStudentNo("160275311");
        student.setSchool("南京工业职业技术学院");

        student2.setName("方继畔");
        student2.setPic("1.png");
        student2.setAge(21);
        student2.setMale("男");
        student2.setStudentNo("160275312");
        student2.setSchool("南京工业职业技术学院");

        student3.setName("叶倾城");
        student3.setPic("1.png");
        student3.setAge(21);
        student3.setMale("女");
        student3.setStudentNo("1601275313");
        student3.setSchool("南京工业职业技术学院");
        //将模型加入视图
        studentList.add(student) ;
        studentList.add(student2) ;
        studentList.add(student3) ;
        map.addAttribute("studentList",studentList);

        return "index" ;
    }
}
