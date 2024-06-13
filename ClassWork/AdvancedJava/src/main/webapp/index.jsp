<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<style type="text/css">
	tr,td{
		padding: 10px;
	}
</style>
</head>
<body>

	<%
		if(request.getAttribute("msg") != null)
		{
	%>
	<h2><%=request.getAttribute("msg") %></h2>
	<%
		}
	%>

	<form name="frm" method="post" action="UserController">
		<table>
			<tr>
				<td>Enter First name :-</td>
				<td><input type="text" name="fname"> </td>
			</tr>
			
			<tr>
				<td>Enter Last name :-</td>
				<td><input type="text" name="lname"> </td>
			</tr>
			
			<tr>
				<td>Enter Email :-</td>
				<td><input type="email" name="email"> </td>
			</tr>
			
			<tr>
				<td>Enter Mobile Number :-</td>
				<td><input type="number" name="mobile"> </td>
			</tr>
						
			<tr>
				<td>Enter Password :-</td>
				<td><input type="password" name="password"> </td>
			</tr>
			
			<tr>
				<td>Enter Confirm Password :-</td>
				<td><input type="password" name="cpassword"> </td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="action" value="Insert" class="btn btn-primary">
				</td>
			</tr>
			
		</table>
	</form>
	
	<a href="Show.jsp">Show All User</a>
	
</body>
</html>