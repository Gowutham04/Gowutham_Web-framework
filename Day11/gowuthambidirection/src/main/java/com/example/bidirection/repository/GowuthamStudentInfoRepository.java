package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.StudentInfo;

@Repository
public interface GowuthamStudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}