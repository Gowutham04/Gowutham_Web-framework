package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.GowuthamEmployee;
import com.example.day12_01.service.GowuthamEmployeeService;

@RestController
public class GowuthamEmployeeController {
    @Autowired
    GowuthamEmployeeService employeeService;

    @PostMapping("/employee")
    public GowuthamEmployee setMethod(@RequestBody GowuthamEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<GowuthamEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<GowuthamEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
