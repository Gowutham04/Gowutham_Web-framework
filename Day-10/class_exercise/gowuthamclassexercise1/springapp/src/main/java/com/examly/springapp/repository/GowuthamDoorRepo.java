package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.GowuthamDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface GowuthamDoorRepo extends JpaRepository<GowuthamDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<GowuthamDoor> findByColor(String color);

    public List<GowuthamDoor> findByDoorType(String doortype);
}
