<%@ page import="java.sql.*, com.emp.util.DBConnection" %>

<%
int id = Integer.parseInt(request.getParameter("id"));

Connection con = DBConnection.getConnection();
PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE emp_id=?");
ps.setInt(1, id);

ResultSet rs = ps.executeQuery();
rs.next();
%>

<html>
<head>
<title>Edit Employee</title>
</head>

<body>

<h2>Edit Employee</h2>

<form action="updateEmployee" method="post">

<input type="hidden" name="id" value="<%= rs.getInt("emp_id") %>">

Name:
<input type="text" name="name" value="<%= rs.getString("emp_name") %>"><br><br>

Department:
<input type="text" name="department" value="<%= rs.getString("department") %>"><br><br>

Salary:
<input type="text" name="salary" value="<%= rs.getDouble("salary") %>"><br><br>

<input type="submit" value="Update Employee">

</form>

</body>
</html>