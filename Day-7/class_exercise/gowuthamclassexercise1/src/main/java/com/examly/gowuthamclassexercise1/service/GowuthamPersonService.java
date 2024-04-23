package com.examly.gowuthamclassexercise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.gowuthamclassexercise1.model.GowuthamPerson;
import com.examly.gowuthamclassexercise1.repository.GowuthamPersonRepo;

@Service
public class GowuthamPersonService {

     @Autowired
     public GowuthamPersonRepo personRepo;

     public GowuthamPerson SaveEntity(GowuthamPerson entity) {
          return personRepo.save(entity);

     }

     public List<GowuthamPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<GowuthamPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
