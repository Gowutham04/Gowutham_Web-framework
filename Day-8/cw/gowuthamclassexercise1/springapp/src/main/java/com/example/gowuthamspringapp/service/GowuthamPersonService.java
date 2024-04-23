package com.example.gowuthamspringapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowuthamspringapp.model.GowuthamPerson;
import com.example.gowuthamspringapp.repository.GowuthamPersonRepo;

@Service
public class GowuthamPersonService {
    @Autowired
    private GowuthamPersonRepo rep;

    public boolean post(GowuthamPerson person)
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

    public List<GowuthamPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<GowuthamPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
