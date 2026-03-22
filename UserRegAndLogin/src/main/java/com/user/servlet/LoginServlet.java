package com.user.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE email=? AND password=?"
            );

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                // 🔥 Session creation
                HttpSession session = req.getSession();
                session.setAttribute("user", email);

                res.sendRedirect("home.jsp");
            } else {
                res.getWriter().println("Invalid Login");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}