<%@page import="_jsp19_0126.Score"%>
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
Score score = new Score("김",100);
request.setAttribute("score",score);
%>
${score }<hr>
${score.name }<hr>
${score.kor }<hr>
</body>
</html>