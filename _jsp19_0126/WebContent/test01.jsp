<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String aa = "test";
	application.setAttribute("aa","application입니다.");
	session.setAttribute("aa","session입니다.");
	request.setAttribute("aa","request입니다.");
	pageContext.setAttribute("aa","pageContext입니다.");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JAVA aa => <%=aa %><br>
aa => ${aa }<br>
application aa => ${applicationScope.aa }<br>
session aa => ${sessionScope.aa }<br>
request aa => ${requestScope.aa }<br>
pageContext aa => ${pageScope.aa }<br>
</body>
</html>