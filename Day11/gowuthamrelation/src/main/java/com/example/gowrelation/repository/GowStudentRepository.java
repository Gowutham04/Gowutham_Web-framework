package com.example.gowrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowrelation.model.GowStudent;

@Repository
public interface GowStudentRepository extends JpaRepository<GowStudent,Integer>{
    
}
