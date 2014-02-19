<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login page</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
	position: relative;
	width: 600px;
	left: 100px;
	top: 100px;
}

.loginform {
	color: #00756F;
	background-color: #DBFFFD;
	border: 3px solid #00756F;
	padding: 8px;
	margin: 16px;
	position: relative;
	width: 370px;
	height: 220px;
	left: 200px;
	top: 100px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'
	style="background-color: #D3E0E0">
	<p>
		<c:if test="${error == true}">
			<div class="errorblock">
				<center>
					Your login attempt was not successful, Try Again.<br />
				</center>
			</div>
		</c:if>
	</p>
	<div class="loginform">
		<center>
			<h1>Log-In Form</h1>
		</center>

		<form method="post" action="<c:url value='j_spring_security_check'/>">
			<table>
				<tbody>
					<tr>
						<td>UserName:</td>
						<td><center><input type="text" name="j_username" id="j_username"
							size="30" maxlength="40" style="width: 200px" /></center></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><center><input type="password" name="j_password" id="j_password"
							size="30" maxlength="32" style="width: 200px" /></center></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Login" /></td>
					</tr>
				</tbody>
			</table>
		</form>
		<p>
			<a href="${pageContext.request.contextPath}/index.html">Home page</a><br />
		</p>
	</div>



</body>
</html>