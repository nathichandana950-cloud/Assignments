package com.library.servlet;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import com.library.model.Book;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/searchBook")
public class SearchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        List<Book> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/librarydb", "root", "1234");

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM books WHERE title LIKE ?");

            ps.setString(1, "%" + title + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("book_id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setCategory(rs.getString("category"));
                b.setQuantity(rs.getInt("quantity"));
                list.add(b);
            }

            request.setAttribute("books", list);
            request.getRequestDispatcher("viewBooks.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}