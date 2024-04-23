package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.GowuthamPerson;
import com.example.springapp.repository.GowuthamPersonRepo;

@Service
public class GowuthamPersonService {
    public GowuthamPersonRepo personRepo;

    public GowuthamPersonService(GowuthamPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(GowuthamPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<GowuthamPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
