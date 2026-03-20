package com.product.servlet;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/editProduct")
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    // 1️⃣ FETCH DATA
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM products WHERE product_id=?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("product_id"));
                p.setName(rs.getString("product_name"));
                p.setPrice(rs.getDouble("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCategory(rs.getString("category"));

                request.setAttribute("product", p);
                RequestDispatcher rd = request.getRequestDispatcher("editProduct.jsp");
                rd.forward(request, response);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // 2️⃣ UPDATE DATA
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String category = request.getParameter("category");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE products SET product_name=?, price=?, quantity=?, category=? WHERE product_id=?"
            );

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, quantity);
            ps.setString(4, category);
            ps.setInt(5, id);

            ps.executeUpdate();

            response.sendRedirect("viewProducts");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}