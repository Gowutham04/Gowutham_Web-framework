package com.examly.gowuthamclassexercise2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.gowuthamclassexercise2.model.GowuthamCourse;

@Repository
public interface GowuthamCourseRepo extends JpaRepository<GowuthamCourse, Integer> {

     List<GowuthamCourse> findByCourseName(String courseName);

}