
	package com.library.servlet;

	import java.io.IOException;
	import java.sql.*;

	import com.library.util.DBConnection;

	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.*;

	@WebServlet("/addBook")
	public class AddBookServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        String category = request.getParameter("category");
	        int quantity = Integer.parseInt(request.getParameter("quantity"));

	        try {
	            Connection con = DBConnection.getConnection();

	            PreparedStatement ps = con.prepareStatement(
	                    "INSERT INTO books(title, author, category, quantity) VALUES(?,?,?,?)");

	            ps.setString(1, title);
	            ps.setString(2, author);
	            ps.setString(3, category);
	            ps.setInt(4, quantity);

	            int rows = ps.executeUpdate();
	            System.out.println("Inserted rows: " + rows);

	            response.sendRedirect("viewBooks");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}