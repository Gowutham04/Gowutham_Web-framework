package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.GowuthamEmployee;
import com.example.day12_01.repository.GowuthamEmployeeRepo;

@Service
public class GowuthamEmployeeService {
    @Autowired
    GowuthamEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public GowuthamEmployee setEmployee(GowuthamEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GowuthamEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GowuthamEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
