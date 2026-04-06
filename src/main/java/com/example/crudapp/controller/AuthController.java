package com.example.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.crudapp.dto.EmployeeDTO;
import com.example.crudapp.entity.Employee;
import com.example.crudapp.repository.EmployeeRepository;
import com.example.crudapp.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/login")
    public String login(@RequestBody EmployeeDTO request) {

        Employee emp = repository.findByUsername(request.getUsername());

        // ✅ check user exists
        if (emp == null) {
            throw new RuntimeException("User not found");
        }

        // ✅ check password
        if (!emp.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        // ✅ generate token
        return JwtUtil.generateToken(emp.getUsername());
    }
}