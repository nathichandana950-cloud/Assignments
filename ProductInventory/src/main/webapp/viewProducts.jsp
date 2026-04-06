<%@ page import="java.util.*, com.product.servlet.Product" %>

<html>
<body>

<h2>Product List</h2>

<%
List<Product> list = (List<Product>) request.getAttribute("products");

if(list != null){
    for(Product p : list){
%>

<p>
ID: <%= p.getId() %> |
Name: <%= p.getName() %> |
Price: <%= p.getPrice() %> |
Qty: <%= p.getQuantity() %> |
Category: <%= p.getCategory() %> |

<a href="editProduct?id=<%= p.getId() %>">Edit</a> |
<a href="deleteProduct?id=<%= p.getId() %>">Delete</a>

</p>

<%
    }
}
%>

<br>
<a href="addProduct.jsp">Add New Product</a>

</body>
</html>