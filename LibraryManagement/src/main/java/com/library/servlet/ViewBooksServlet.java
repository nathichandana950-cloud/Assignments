package com.library.servlet;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import com.library.model.Book;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/viewBooks")
public class ViewBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Book> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/librarydb?useSSL=false&serverTimezone=UTC",
                "root",
                "1234"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("book_id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setCategory(rs.getString("category"));
                b.setQuantity(rs.getInt("quantity"));

                list.add(b);
            }

            // 🔥 DEBUG
            System.out.println("Books fetched: " + list.size());

            request.setAttribute("books", list);
            request.getRequestDispatcher("viewBooks.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}