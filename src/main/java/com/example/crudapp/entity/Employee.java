package com.example.crudapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}
