<%@ page import="java.util.*, com.library.model.Book" %>

<html>
<head>
    <title>View Books</title>

    <style>
        table {
            border-collapse: collapse;
            width: 80%;
        }
        th, td {
            padding: 10px;
            border: 1px solid black;
            text-align: center;
        }
        a {
            margin: 5px;
            text-decoration: none;
        }
    </style>
</head>

<body>

<h2>All Books</h2>

<a href="index.jsp">Home</a>
<br><br>

<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Category</th>
        <th>Quantity</th>
        <th>Actions</th>
    </tr>

<%
    List<Book> list = (List<Book>) request.getAttribute("books");

    if(list != null && !list.isEmpty()){
        for(Book b : list){
%>
    <tr>
        <td><%= b.getId() %></td>
        <td><%= b.getTitle() %></td>
        <td><%= b.getAuthor() %></td>
        <td><%= b.getCategory() %></td>
        <td><%= b.getQuantity() %></td>
        <td>
            <!-- EDIT -->
            <a href="getBook?id=<%= b.getId() %>">Edit</a>

            <!-- DELETE -->
            <a href="deleteBook?id=<%= b.getId() %>"
               onclick="return confirm('Are you sure you want to delete?');">
               Delete
            </a>
        </td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="6">No Books Found</td>
    </tr>
<%
    }
%>

</table>

</body>
</html>