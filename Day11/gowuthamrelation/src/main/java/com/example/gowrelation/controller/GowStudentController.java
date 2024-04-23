package com.example.gowrelation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gowrelation.model.GowStudent;
import com.example.gowrelation.service.GowStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GowStudentController {
    public GowStudentService studentService;
    public GowStudentController(GowStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public GowStudent postMethodName(@RequestBody GowStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<GowStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
