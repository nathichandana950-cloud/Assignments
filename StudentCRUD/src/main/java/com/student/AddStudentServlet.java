package com.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        try {

            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO students(name,email,course) VALUES(?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);

            ps.executeUpdate();

            response.sendRedirect("viewStudent.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}