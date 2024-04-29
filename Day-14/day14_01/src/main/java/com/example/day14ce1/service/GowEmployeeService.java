package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GowEmployee;
import com.example.day14ce1.repository.GowEmployeeRepo;

@Service

public class GowEmployeeService {
    @Autowired
    GowEmployeeRepo employeeRepo;

    public GowEmployee addEmployee(GowEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GowEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<GowEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
