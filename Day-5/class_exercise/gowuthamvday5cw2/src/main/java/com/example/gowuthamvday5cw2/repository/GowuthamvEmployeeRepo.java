package com.example.gowuthamvday5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamvday5cw2.model.GowuthamvEmployee;


@Repository
public interface GowuthamvEmployeeRepo extends JpaRepository<GowuthamvEmployee,Integer>{
    
}
