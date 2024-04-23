package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.GowuthamStudent;
import java.util.List;

@Repository
public interface GowuthamStudentRepo extends JpaRepository<GowuthamStudent, Long> {

    List<GowuthamStudent> findByMarksGreaterThan(int mark);

    List<GowuthamStudent> findByMarksLessThan(int mark);

}
