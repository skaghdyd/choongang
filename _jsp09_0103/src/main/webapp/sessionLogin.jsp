<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String password = request.getParameter("password");
if (id.equals(password)) {
	session.setAttribute("MID", id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		alert("로그인 성공");
		location.href = "sessionLoginCheck.jsp";
	</script>
</body>
</html>
<%
} else {
%>
<script>
	alert("로그인 실패");
	history.go(-1);
</script>
<%
}
%>