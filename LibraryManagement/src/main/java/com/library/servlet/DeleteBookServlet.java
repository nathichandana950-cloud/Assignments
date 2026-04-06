package com.library.servlet;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/deleteBook")
public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/librarydb", "root", "1234");

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM books WHERE book_id=?");

            ps.setInt(1, id);
            ps.executeUpdate();

            response.sendRedirect("viewBooks");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}