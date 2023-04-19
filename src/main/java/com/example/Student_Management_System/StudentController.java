package com.example.Student_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> map = new HashMap<>();
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student) {
        int key = student.getRollNo();
        map.put(key, student);
    }
    @GetMapping("/getStudentInfo")
    public Student getStudentInfo(@RequestParam("rollNo") Integer rollNo) {
        Student student = map.get(rollNo);
        return student;
    }
}
