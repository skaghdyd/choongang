<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Dept dept = new Dept(10, "test", "seoul");	
session.setAttribute("sessionTest", dept);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SESSION TEST 1</h1>
<%=dept.getDeptno() %>
<%=dept.getDname() %>
<%=dept.getLoc() %>
</body>
</html>