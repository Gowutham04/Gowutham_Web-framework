package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.GowEmployee;
import com.example.day12_01.service.GowEmployeeService;

@RestController
public class GowEmployeeController {
    @Autowired
    GowEmployeeService employeeService;

    @PostMapping("/employee")
    public GowEmployee setMethod(@RequestBody GowEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<GowEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<GowEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
