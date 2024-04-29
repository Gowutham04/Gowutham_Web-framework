package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.GowEmployee;
import com.example.day12_01.repository.GowEmployeeRepo;

@Service
public class GowEmployeeService {
    @Autowired
    GowEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public GowEmployee setEmployee(GowEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GowEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GowEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
