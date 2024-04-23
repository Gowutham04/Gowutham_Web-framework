package com.example.gowuthamspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamspringapp.model.GowuthamDoor;

import java.util.List;

@Repository
public interface GowuthamDoorRepo extends JpaRepository<GowuthamDoor,Integer>{

    List<GowuthamDoor> findByDoorId(int doorId);
    List<GowuthamDoor> findByAccessType(String accessType);
    
}
