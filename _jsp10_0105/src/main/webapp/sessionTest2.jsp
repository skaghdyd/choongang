<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
Dept dept = (Dept) session.getAttribute("sessionTest");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SESSION TEST 2</h1>
<%=dept.getDeptno() %>
<%=dept.getDname() %>
<%=dept.getLoc() %>
</body>
</html>