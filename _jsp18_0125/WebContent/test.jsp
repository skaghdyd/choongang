<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="test1" value="test인데~~~" scope="request"></c:set>
<%
	String ss = "자바 String 변수  ss다!!!";

	request.setAttribute("ss", "request.setAttribute를 사용한 ss다!!!");
	
	String test1 = (String)request.getAttribute("test1");//test인데~~~
	
	String test2 = (String)request.getAttribute("test2");//null
%>
<c:set var="test2" value="<%=test1 %>" ></c:set> <!--test인데~~~ -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JAVA ss ==><%=ss %><br>
EL ss ==>${ss }<hr>
JAVA test1 ==><%=test1 %><br>
JAVA test2 ==><%=test2 %><br>
EL test1 ==>${test1 }<br>
EL test2 ==>${test2 }<br>
</body>
</html>