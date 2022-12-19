<%@page import="testWeb.Student"%>
<%@page import="testWeb.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
연습입니다.
<%
	out.println("<h1>--------------</h1>");
	for(int i=0; i<10; i++){
		out.println("<h1>JSP 연습"+ i +"</h1>");
		out.println(java.time.LocalTime.now());
		out.println("<h1>--------------</h1>");
	}
	StudentDao dao = new StudentDao();
	dao.connect();
	List<Student> result = dao.select();
	for(int i=0; i<result.size(); i++) {
		out.println("<p>"+result.get(i)+"</p>");
	}
	out.println("</body>");
	out.println("</html>");
%>
</body>
</html>