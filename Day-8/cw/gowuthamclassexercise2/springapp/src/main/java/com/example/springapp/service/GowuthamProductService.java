package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GowuthamProduct;
import com.example.springapp.repository.GowuthamProductRepo;

@Service
public class GowuthamProductService {
    @Autowired
    private GowuthamProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(GowuthamProduct person)
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

    public List<GowuthamProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<GowuthamProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<GowuthamProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
