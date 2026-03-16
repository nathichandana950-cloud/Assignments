package com.demo;

import java.io.*;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String name = request.getParameter("name");
String email = request.getParameter("email");

PrintWriter out = response.getWriter();

try {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentdb",
"root",
"1234");

PreparedStatement ps = con.prepareStatement(
"insert into student(name,email) values(?,?)");

ps.setString(1,name);
ps.setString(2,email);

ps.executeUpdate();

out.println("<h2>Data Inserted Successfully</h2>");

con.close();

}
catch(Exception e){
out.println(e);
}

}
}