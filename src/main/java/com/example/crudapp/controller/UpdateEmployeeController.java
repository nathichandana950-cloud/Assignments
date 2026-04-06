package com.example.crudapp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.crudapp.entity.Employee;
import com.example.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class UpdateEmployeeController {

    private final EmployeeService service;

    public UpdateEmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PutMapping
    public Employee update(@RequestBody Employee emp) {
        return service.save(emp);
    }
}