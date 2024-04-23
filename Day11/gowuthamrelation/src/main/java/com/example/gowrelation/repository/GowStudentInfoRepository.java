package com.example.gowrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowrelation.model.GowStudentInfo;

@Repository
public interface GowStudentInfoRepository extends JpaRepository<GowStudentInfo,Integer>{
    
}