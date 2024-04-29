package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Gowuthamce;
import com.example.springapp.service.Gow_ser;

@RestController
public class gow_v {
    @Autowired
    Gow_ser studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<Gowuthamcontroller> addStudentDetails(@PathVariable int id,@RequestBody Gowuthamcontroller studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
