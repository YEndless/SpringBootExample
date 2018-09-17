package com.example.quickstart.entity;

import lombok.extern.java.Log;

@Log
public class LombokTest {
    public static void main(String[] args) {
//创建第一个学生对象
        Student student = new Student();
        Teacher teacher = new Teacher() ;
        teacher.setName("xu");
        teacher.setTeacherNo("10");

        student.setAge(19);
        student.setMale("male");
        student.setName("Spring Boot");
        student.setStudentNo("2017");
        System.out.println(student.toString());
//创建第二个学生对象
        Student student2 = new Student();
        student2.setAge(19);
        student2.setMale("male");
        student2.setName("Spring Boot");
        student2.setStudentNo("2017");
//判断两个对象的引用是否相等
        System.out.println(student.equals(student2));
        student2.setStudentNo("2018");
        System.out.println(student.equals(student2));
        log.info("lombok test");
    }
}
