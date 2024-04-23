package com.example.gowuthamspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowuthamspringapp.model.GowuthamPerson;
import com.example.gowuthamspringapp.service.GowuthamPersonService;

import java.util.*;

@RestController
public class GowuthamPersonController {
    @Autowired
    private GowuthamPersonService ser;

    @PostMapping("/person")
    public ResponseEntity<GowuthamPerson> post(@RequestBody GowuthamPerson person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<GowuthamPerson>> getAll(@PathVariable String value) {
        List<GowuthamPerson> li = ser.start(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<GowuthamPerson>> getbyAge(@PathVariable String value) {
        List<GowuthamPerson> li = ser.end(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
