package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowuthamVillage;
import com.example.springapp.repository.GowuthamVillageRepo;

@Service
public class GowuthamVillageService {
    @Autowired
    private GowuthamVillageRepo rep;

    public boolean post(GowuthamVillage person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public GowuthamVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public GowuthamVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<GowuthamVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
