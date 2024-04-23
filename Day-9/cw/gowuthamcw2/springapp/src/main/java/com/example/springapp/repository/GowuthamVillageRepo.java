package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.GowuthamVillage;
import java.util.List;

@Repository
public interface GowuthamVillageRepo extends JpaRepository<GowuthamVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    GowuthamVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    GowuthamVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<GowuthamVillage> findByPopulation(int population);

}
