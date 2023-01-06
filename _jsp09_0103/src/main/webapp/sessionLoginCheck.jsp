<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String mid = (String) session.getAttribute("MID");
if (mid != null) {
	out.println("로그인 상태");
} else {
	out.println("로그아웃 상태");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>