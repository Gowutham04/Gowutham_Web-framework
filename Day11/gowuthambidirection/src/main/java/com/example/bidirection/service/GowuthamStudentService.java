package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.Student;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.repository.GowuthamStudentInfoRepository;
import com.example.bidirection.repository.GowuthamStudentRepository;

@Service
public class GowuthamStudentService {
    public GowuthamStudentRepository studentRepository;
    public GowuthamStudentInfoRepository studentInfoRepository;
    public GowuthamStudentService(GowuthamStudentRepository studentRepository,GowuthamStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public StudentInfo saveStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
