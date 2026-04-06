package com.example.crudapp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.crudapp.entity.Employee;
import com.example.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class AddEmployeeController {

    private final EmployeeService service;

    public AddEmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return service.save(emp);
    }
}