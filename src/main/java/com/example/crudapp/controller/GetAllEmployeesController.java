package com.example.crudapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.crudapp.entity.Employee;
import com.example.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class GetAllEmployeesController {

    private final EmployeeService service;

    public GetAllEmployeesController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {  // .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        return service.getAll();
    }
}
