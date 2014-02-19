<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
	$(document).ready(function() {

		$("#moderationPage").click(function() {
			var url = "${pageContext.request.contextPath}/sec/moderation.html";
			$(location).attr('href', url);
		});

		$("#firstAdminPage").click(function() {
			var url = "${pageContext.request.contextPath}/admin/first.html";
			$(location).attr('href', url);
		});

		$("#secondAdminPage").click(function() {
			var url = "${pageContext.request.contextPath}/admin/second.html";
			$(location).attr('href', url);
		});

	});
</script>
<style type="text/css">
.linkstyle a {
	font-family: Georgia, serif;
	font-size: large
}

.linkstyle a:link {
	color: forestgreen;
}

.linkstyle a:visited {
	color: seagreen;
}

.linkstyle a:hover {
	text-decoration: none;
	color: yellowgreen;
	font-weight: bold;
}

.linkstyle a:active {
	color: red;
	text-decoration: none
}
</style>

</head>
<body>
	<h1>Home page</h1>

	<p>
		This is Home page. It's available for all users.<br />
	</p>
	<%-- <p><a
			href="${pageContext.request.contextPath}/sec/moderation.html">Moderation
			page</a><br /> <a
			href="${pageContext.request.contextPath}/admin/first.html">First
			Admin page</a><br /> <a
			href="${pageContext.request.contextPath}/admin/second.html">Second
			Admin page</a><br />
	</p> --%>
	<a id="moderationPage" style='cursor: pointer; cursor: hand;'>Moderation
		page</a>
	<br />
	<a id="firstAdminPage" style='cursor: pointer; cursor: hand;'>First
		Admin page</a>
	<br />
	<a id="secondAdminPage" style='cursor: pointer; cursor: hand;'>Second
		Admin page</a>
	<br />

</body>
</html>
