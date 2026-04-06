package com.example.crudapp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class DeleteEmployeeController {

    private final EmployeeService service;

    public DeleteEmployeeController(EmployeeService service) {
        this.service = service;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}
