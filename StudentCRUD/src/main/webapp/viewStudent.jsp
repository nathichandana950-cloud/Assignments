<%@ page import="java.sql.*" %>
<%@ page import="com.student.DBConnection" %>

<html>
<head>
<title>View Students</title>
</head>

<body>

<h2>Student List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Course</th>
</tr>

<%

Connection conn = DBConnection.getConnection();

Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery("SELECT * FROM students");

while(rs.next()) {

%>

<tr>

<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("name") %></td>
<td><%= rs.getString("email") %></td>
<td><%= rs.getString("course") %></td>

<td>
<a href="editStudent.jsp?id=<%=rs.getInt("id")%>">Edit</a>
</td>

<td>
<a href="deleteStudent?id=<%=rs.getInt("id")%>">Delete</a>
</td>

</tr>

<%
}
%>

</table>

<br>

<a href="addStudent.jsp">Add New Student</a>

</body>
</html>