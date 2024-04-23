package com.examly.gowuthamclassexercise1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.gowuthamclassexercise1.model.GowuthamPerson;

/**
 * PersonRepo
 */
@Repository
public interface GowuthamPersonRepo extends JpaRepository<GowuthamPerson, Integer> {

     List<GowuthamPerson> findByAge(int byAge);
}