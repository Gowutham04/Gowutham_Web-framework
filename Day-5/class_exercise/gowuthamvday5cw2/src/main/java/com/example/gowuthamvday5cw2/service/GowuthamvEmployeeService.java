package com.example.gowuthamvday5cw2.service;

import org.springframework.stereotype.Service;

import com.example.gowuthamvday5cw2.model.GowuthamvEmployee;
import com.example.gowuthamvday5cw2.repository.GowuthamvEmployeeRepo;

@Service
public class GowuthamvEmployeeService {
    public GowuthamvEmployeeRepo employeeRepo;
    public GowuthamvEmployeeService(GowuthamvEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(GowuthamvEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GowuthamvEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public GowuthamvEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
