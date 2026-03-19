package com.emp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String dept = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee emp = new Employee();
        emp.setEmpName(name);
        emp.setDepartment(dept);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();
        dao.addEmployee(emp);

        res.sendRedirect("listEmployee");
    }
}