package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.GowPayroll;
import com.example.day14ce1.service.GowPayrollService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class GowPayrollController {
    @Autowired
    GowPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public GowPayroll addPayroll(@PathVariable Long employeeId,@RequestBody GowPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<GowPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
