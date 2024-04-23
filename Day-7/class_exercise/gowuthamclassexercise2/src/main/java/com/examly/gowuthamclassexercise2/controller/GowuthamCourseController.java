package com.examly.gowuthamclassexercise2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.gowuthamclassexercise2.model.GowuthamCourse;
import com.examly.gowuthamclassexercise2.service.GowuthamCourseService;

@RestController
public class GowuthamCourseController {

     @Autowired
     public GowuthamCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<GowuthamCourse> postMethodName(@RequestBody GowuthamCourse entity) {

          GowuthamCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<GowuthamCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<GowuthamCourse>> getMethodName() {

          List<GowuthamCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GowuthamCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GowuthamCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<GowuthamCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}