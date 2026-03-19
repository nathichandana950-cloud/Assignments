package com.emp.dao;

import java.sql.*;
import java.util.*;
import com.emp.model.Employee;
import com.emp.util.DBConnection;

public class EmployeeDAO {

    // ADD
    public void addEmployee(Employee emp) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employees(emp_name, department, salary) VALUES (?, ?, ?)"
            );

            ps.setString(1, emp.getEmpName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM employees");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();

                emp.setEmpId(rs.getInt("emp_id"));
                emp.setEmpName(rs.getString("emp_name"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));

                list.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // DELETE
    public void deleteEmployee(int id) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employees WHERE emp_id=?"
            );

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateEmployee(Employee emp) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE employees SET emp_name=?, department=?, salary=? WHERE emp_id=?"
            );

            ps.setString(1, emp.getEmpName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getEmpId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}