package com.examly.gowuthamclassexercise2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.gowuthamclassexercise2.model.GowuthamCourse;
import com.examly.gowuthamclassexercise2.repository.GowuthamCourseRepo;

@Service
public class GowuthamCourseService {

     @Autowired
     public GowuthamCourseRepo courseRepo;

     public GowuthamCourse SaveEntity(GowuthamCourse entity) {
          return courseRepo.save(entity);

     }

     public List<GowuthamCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<GowuthamCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
