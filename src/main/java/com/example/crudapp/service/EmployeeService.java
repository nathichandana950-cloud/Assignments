package com.example.crudapp.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.crudapp.entity.Employee;
import com.example.crudapp.repository.EmployeeRepository;
import com.example.crudapp.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public Employee findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}