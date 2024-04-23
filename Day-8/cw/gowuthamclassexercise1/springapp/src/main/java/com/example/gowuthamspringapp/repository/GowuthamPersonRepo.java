package com.example.gowuthamspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamspringapp.model.GowuthamPerson;

import java.util.List;


@Repository
public interface GowuthamPersonRepo extends JpaRepository<GowuthamPerson,Integer>{

    List<GowuthamPerson> findByNameStartingWith(String name);
    List<GowuthamPerson> findByNameEndingWith(String name);
    
}
