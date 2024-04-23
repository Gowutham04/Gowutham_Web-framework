package com.examly.gowuthamclassexercise1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.gowuthamclassexercise1.model.GowuthamPerson;
import com.examly.gowuthamclassexercise1.service.GowuthamPersonService;

@RestController
public class GowuthamPersonController {

     @Autowired
     public GowuthamPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<GowuthamPerson> postMethodName(@RequestBody GowuthamPerson entity) {

          GowuthamPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<GowuthamPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<GowuthamPerson>> getMethodName() {

          List<GowuthamPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GowuthamPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GowuthamPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<GowuthamPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}