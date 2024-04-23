package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowuthamRecipe;
import com.example.springapp.repository.GowuthamRecipeRepo;

@Service
public class GowuthamRecipeService {
    @Autowired
    private GowuthamRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(GowuthamRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public GowuthamRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<GowuthamRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
