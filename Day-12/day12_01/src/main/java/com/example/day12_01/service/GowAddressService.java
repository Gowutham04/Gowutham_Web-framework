package com.example.day12_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.GowAddress;
import com.example.day12_01.repository.GowAddressRepo;
import com.example.day12_01.repository.GowEmployeeRepo;

@Service
public class GowAddressService {
    @Autowired
    GowAddressRepo addressRepo;
    @Autowired
    GowEmployeeRepo employeeRepo;
    public GowAddress setAddressById(int id,GowAddress address)
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
