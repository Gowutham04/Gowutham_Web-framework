package com.example.day12_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.GowuthamAddress;
import com.example.day12_01.repository.GowuthamAddressRepo;
import com.example.day12_01.repository.GowuthamEmployeeRepo;

@Service
public class GowuthamAddressService {
    @Autowired
    GowuthamAddressRepo addressRepo;
    @Autowired
    GowuthamEmployeeRepo employeeRepo;
    public GowuthamAddress setAddressById(int id,GowuthamAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
