package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.GowuthamDoor;
import com.examly.springapp.repository.GowuthamDoorRepo;

@Service
public class GowuthamDoorService {
    @Autowired
    private GowuthamDoorRepo doorRepo;

    public GowuthamDoor postData(GowuthamDoor door) {
        return doorRepo.save(door);
    }

    public List<GowuthamDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public GowuthamDoor updateDetail(int doorid, GowuthamDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<GowuthamDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<GowuthamDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public GowuthamDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}