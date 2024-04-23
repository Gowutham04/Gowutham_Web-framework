package com.example.gowuthamspringapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowuthamspringapp.model.GowuthamDoor;
import com.example.gowuthamspringapp.repository.GowuthamDoorRepo;

@Service
public class GowuthamDoorService {
    @Autowired
    private GowuthamDoorRepo rep;

    public boolean post(GowuthamDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GowuthamDoor> getAll()
    {
        return rep.findAll();
    }

    public List<GowuthamDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<GowuthamDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
