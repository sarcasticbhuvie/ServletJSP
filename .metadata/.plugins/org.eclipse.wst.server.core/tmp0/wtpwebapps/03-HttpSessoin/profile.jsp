<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String) session.getAttribute("name");
%>
	<h1>Welcome : <%= name %></h1>
	<h2><a href="index.jsp">HOME</a>/<a href="profile.jsp">PROFILE</a></h2>
	<span><a href="index.jsp">HOME</a></span>
	<span><a href="about.jsp">ABOUT</a></span>
	<span><a href="profile.jsp">PROFILE</a></span></br>
	<a href="logout">LOGOUT</a>
</body>
</html>