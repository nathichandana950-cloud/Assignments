package com.example.crudapp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.crudapp.entity.Employee;
import com.example.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class GetEmployeeByIdController {

    private final EmployeeService service;

    public GetEmployeeByIdController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") Long id) {
        return service.findById(id);
        		
    }
}