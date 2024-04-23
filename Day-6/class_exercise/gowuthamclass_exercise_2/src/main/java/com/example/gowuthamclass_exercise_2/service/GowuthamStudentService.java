package com.example.gowuthamclass_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.gowuthamclass_exercise_2.model.GowuthamStudent;
import com.example.gowuthamclass_exercise_2.repository.GowuthamStudentRepo;

@Service
public class GowuthamStudentService {

     @Autowired
     public GowuthamStudentRepo studentRepo;

     public List<GowuthamStudent> getAll() {
          return studentRepo.findAll();
     }

     public GowuthamStudent post(GowuthamStudent student) {
          return studentRepo.save(student);
     }

     public List<GowuthamStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
