<%@page import="test.Member"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<Member> mlst = Arrays.asList(
		new Member("1번",20),
		new Member("2번",21),
		new Member("3번",22),
		new Member("4번",23),
		new Member("5번",24)
		);
request.setAttribute("mlst", mlst);
%>
1 ${mlst.stream()
.max((m1,m2)->m1.age.compareTo(m2.age))
.get() }<hr>

2 ${mlst.stream()
.max((m1,m2)->m1.age.compareTo(m2.age))
.get().name }<hr>

3 ${mlst.stream()
.max((m1,m2)->m1.age.compareTo(m2.age))
.get().age }<hr>
</body>
</html>