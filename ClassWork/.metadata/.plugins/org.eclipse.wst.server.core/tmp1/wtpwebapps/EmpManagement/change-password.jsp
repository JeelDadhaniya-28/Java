<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
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

	<form name="frm" method="post" action="EmpController">
		<table>
			
			<tr>
				<td>Enter old Password :-</td>
				<td><input type="password" name="old_password"> </td>
			</tr>
			
			<tr>
				<td>Enter New Password :-</td>
				<td><input type="password" name="new_password"> </td>
			</tr>
			
			<tr>
				<td>Confirm New Password :-</td>
				<td><input type="password" name="cnew_password"> </td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="action" value="Change-Password" class="btn btn-primary">
				</td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>