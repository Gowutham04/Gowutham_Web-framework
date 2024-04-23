package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.GowuthamProduct;
import java.util.List;


@Repository
public interface GowuthamProductRepo extends JpaRepository<GowuthamProduct,Integer>{

    List<GowuthamProduct> findByProductNameStartingWith(String name);
    List<GowuthamProduct> findByProductNameEndingWith(String name);
    
}
