package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GowPayroll;
import com.example.day14ce1.repository.GowPayrollRepo;

@Service
public class GowPayrollService {
    @Autowired
    GowPayrollRepo payrollRepo;

    public GowPayroll addPayroll(Long id,GowPayroll payroll)
    {
        GowPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<GowPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
