<%@ page import="java.util.*, com.emp.model.Employee" %>

<a href="addEmployee.jsp">Add Employee</a><br><br>

<table border="1">
<tr>
<th>ID</th><th>Name</th><th>Dept</th><th>Salary</th><th>Action</th>
</tr>

<%
List<Employee> list = (List<Employee>) request.getAttribute("empList");

for(Employee e : list){
%>

<tr>
<td><%= e.getEmpId() %></td>
<td><%= e.getEmpName() %></td>
<td><%= e.getDepartment() %></td>
<td><%= e.getSalary() %></td>
<td>
<a href="deleteEmployee?id=<%= e.getEmpId() %>">Delete</a>
<a href="editEmployee.jsp?id=<%= e.getEmpId() %>">Edit</a> |
</td>
</tr>

<% } %>
</table>