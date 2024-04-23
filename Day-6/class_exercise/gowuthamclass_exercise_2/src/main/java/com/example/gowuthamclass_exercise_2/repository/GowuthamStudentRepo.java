package com.example.gowuthamclass_exercise_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowuthamclass_exercise_2.model.GowuthamStudent;

@Repository
public interface GowuthamStudentRepo extends JpaRepository<GowuthamStudent, Integer> {

}