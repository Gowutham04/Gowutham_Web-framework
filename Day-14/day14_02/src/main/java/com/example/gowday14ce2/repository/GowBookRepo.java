package com.example.gowday14ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowday14ce2.model.DilipBook;

@Repository
public interface GowBookRepo extends JpaRepository<DilipBook,Integer> {
    
}
