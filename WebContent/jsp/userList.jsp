<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: center;
}
.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>User
			List  </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">User Name</td>
				<td class="heading">Email</td>
				<td class="heading">Team</td>
				<td class="heading">Admin</td>
				
			</tr>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.userName}</td> 
					<td>${user.email}</td>
					<td>${user.team}</td>
					<td>${user.admin}</td>
				
					<td><a href="edit?id=${user.userId}">Edit</a></td>
					<td><a href="delete?id=${user.userId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="register">Add New User</a></td></tr>
		</table>

	</center>
</body>
</html>