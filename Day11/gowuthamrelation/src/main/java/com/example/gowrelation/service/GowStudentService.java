package com.example.gowrelation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gowrelation.model.GowStudent;
import com.example.gowrelation.repository.GowStudentRepository;

@Service
public class GowStudentService {
    public GowStudentRepository studentRepository;
    public GowStudentService(GowStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public GowStudent saveStudent(GowStudent student)
    {
        return studentRepository.save(student);
    }
    public List<GowStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
