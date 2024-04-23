package com.example.gowuthamclass_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowuthamclass_exercise_2.model.GowuthamStudent;
import com.example.gowuthamclass_exercise_2.service.GowuthamStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class GowuthamStudentController {

     @Autowired
     public GowuthamStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<GowuthamStudent>> getDetails() {
          List<GowuthamStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<GowuthamStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<GowuthamStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<GowuthamStudent> postMethodName(@RequestBody GowuthamStudent student) {

          GowuthamStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<GowuthamStudent>> sortedDetails(@PathVariable String field) {
          List<GowuthamStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<GowuthamStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<GowuthamStudent>>(list, HttpStatus.OK);

     }
}
