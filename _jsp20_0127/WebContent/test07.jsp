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
${alst = mlst.stream().map(m->m.age).toList() }<hr>

${mlst.stream().map(m->m.age).toList() }<hr>

${mlst.stream()
.filter(m->m.age>=23)
.map(m->m.age)
.toList() }<hr>

${mlst.stream()
.filter(m->m.age>=23)
.map(m->m.name)
.toList() }<hr>

${mlst.stream()
.map(m->m.age)
.average()
.get() }<hr>
</body>
</html>