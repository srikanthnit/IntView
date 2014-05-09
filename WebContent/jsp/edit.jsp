<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
		<br /> <br /> <br /> <b>Edit User Details </b><br /> <br />
		<div>
			<form:form method="post" action="/update" modelAttribute="user">
				<table>
					<tr>
						<td>First Name :</td>
						<td><form:input path="userName"
								value="${map.user.userName}" />
						</td>
						<td>Team :</td>
						<td><form:select path="team" items="${map.teams}" /></td>
						<td>Email :</td>
						<td><form:input path="email" value="${map.user.email}" /></td>
					
						
						<td>Admin :</td>
						<td><select  name="admin">
						   <option value="no">No</option>
						   <option value="yes">Yes</option>
						</select>
						</td>
					
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="userId" value="${map.user.userId}" />

			</form:form>
		</div>
	</center>
</body>
</html>