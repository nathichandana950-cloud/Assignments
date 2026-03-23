package com.library.servlet;

import java.io.IOException;
import java.sql.*;

import com.library.model.Book;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/getBook")
public class GetBookByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Book b = new Book();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/librarydb", "root", "1234");

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM books WHERE book_id=?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                b.setId(rs.getInt("book_id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setCategory(rs.getString("category"));
                b.setQuantity(rs.getInt("quantity"));
            }

            request.setAttribute("book", b);
            request.getRequestDispatcher("editBook.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
