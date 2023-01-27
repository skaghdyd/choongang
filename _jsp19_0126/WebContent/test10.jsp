<%@page import="_jsp19_0126.Ther"%>
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
Ther ther = new Ther();
String loc = "서울";
Double val = -15.0;
ther.setCel(loc, val);
request.setAttribute("ther",ther);
%>
${ther.info }<hr>
${ther.cel }<hr>
${ther.getCel('서울') }<hr>
</body>
</html>