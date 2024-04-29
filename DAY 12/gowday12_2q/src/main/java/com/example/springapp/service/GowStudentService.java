package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GowStudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudents(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<Student>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<Student>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
