package com.emp.servlet;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String dept = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee emp = new Employee();
        emp.setEmpId(id);
        emp.setEmpName(name);
        emp.setDepartment(dept);
        emp.setSalary(salary);

        new EmployeeDAO().updateEmployee(emp);

        res.sendRedirect("listEmployee");
    }
}