package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.GowuthamStudent;
import com.examly.springapp.repository.GowuthamStudentRepo;

@Service
public class GowuthamStudentService {
    @Autowired
    private GowuthamStudentRepo studentRepo;

    public boolean post(GowuthamStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<GowuthamStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<GowuthamStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
