package com.example.gowuthamday6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamday6cw3.model.GowuthamProduct;

@Repository
public interface GowuthamProductRepo extends JpaRepository<GowuthamProduct,Integer>{
    
}
