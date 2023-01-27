<%@page import="java.util.Arrays"%>
<%@page import="test.Member"%>
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
		new Member("갑",20),
		new Member("을",21),
		new Member("병",22),
		new Member("정",23),
		new Member("무",24)
		);
request.setAttribute("mlst", mlst);
%>
1
${mlst.stream()
.map(x->x.name+=" : "+=x.age)
.sorted().toList() }<hr>

2
${mlst.stream()
.sorted((x1, x2) -> x1.name.compareTo(x2.name))
.map(x->x.name+=" : "+=x.age)
.toList() }<hr>

22
${mlst.stream()
.sorted((x1, x2) -> x2.name.compareTo(x1.name))
.map(x->x.name+=" : "+=x.age)
.toList() }<hr>

222
${mlst.stream()
.sorted((x1, x2) -> x1.name.compareTo(x2.name))
.limit(2)
.toList() }<hr>

2222 count
${mlst.stream()
.count() }<hr>

3
${mlst.stream()
.sorted((x1, x2) -> x1.name > x2.name ? 1 : -1)
.map(x->x.name+=" : "+=x.age)
.toList() }<hr>

4
${mlst.stream()
.sorted((x1, x2) -> x1.name < x2.name ? 1 : -1)
.map(x->x.name+=" : "+=x.age)
.toList() }<hr>

5
${vals=[20,17,30,2,9,23];
	sorted=vals.stream().sorted().toList() }<hr>

6
${vals=["하","바","나","가"];
	sorted=vals.stream().sorted((x1,x2)->x1<x2?1:-1).toList() }<hr>
</body>
</html>