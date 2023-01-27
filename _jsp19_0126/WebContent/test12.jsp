<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${grt = (a,b) -> a>b ? true : false;'' }<hr>
${grt(3,4) }<hr>
${grt(4,4) }<hr>
${grt(5,4) }<hr>
<%-- ${((a,b) -> a>b ? true : false)(3,4) }<hr>
${((a,b) -> a>b ? true : false)(4,4) }<hr>
${((a,b) -> a>b ? true : false)(5,4) }<hr> --%>
${a = n -> n == 1 ? 1 : n*a(n-1);'' }<hr>
${a(5) }<hr>
</body>
</html>