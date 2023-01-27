<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Long> vals = Arrays.asList(1L, 2L, 5L, 10L);
	%>
	<c:set var="vals" value="<%=vals %>"></c:set>
	${vals }<br>
	<hr>
	<c:set var="vals2" value="[1,2,5,10]"></c:set>
	${vals2 }<br>
	<hr>
	<%-- <c:set var="vals3" value="${[1,2,5,10]}"></c:set> --%>
	${vals3[2] }<br>
	<hr>
	<c:set var="vals4" value="${{'name':'홍','age':20}}"></c:set>
	${vals4 }<br>
	${vals4.name }<br>
	${vals4.age }<br>
	<hr>
	<c:set var="vals5" value="${{'가','가','나','나','다','다','다'}}"></c:set>
	${vals5 }
</body>
</html>