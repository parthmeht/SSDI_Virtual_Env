<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.parth.demo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSDI Virtual Env Assignment</title>
</head>
<body>
	<h1>Hello Welcome to Student Database</h1>
	<%
		ArrayList<Student> al = MySQLCon.getStudentsData();
	%>
	<table cellpadding="5" cellspacing="5" border="1">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
		</tr>
		<% for(Student student: al){ %>
		<tr>
			<td><%=student.getId() %></td>
			<td><%=student.getName() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>