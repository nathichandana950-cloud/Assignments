package com.emp.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

@WebServlet("/listEmployee")
public class ListEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getAllEmployees();

        req.setAttribute("empList", list);
        req.getRequestDispatcher("listEmployee.jsp").forward(req, res);
    }
}