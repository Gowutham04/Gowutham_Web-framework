package com.example.gowuthamvday5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamvday5cw1.model.GowuthamvProduct;

@Repository
public interface GowuthamvProductRepo extends JpaRepository<GowuthamvProduct,Integer>{
    
}
