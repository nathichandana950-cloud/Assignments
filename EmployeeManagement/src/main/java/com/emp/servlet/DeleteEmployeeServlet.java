package com.emp.servlet;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.emp.dao.EmployeeDAO;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        EmployeeDAO dao = new EmployeeDAO();
        dao.deleteEmployee(id);

        res.sendRedirect("listEmployee");
    }
}