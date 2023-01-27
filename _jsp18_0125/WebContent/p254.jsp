<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name1","연습zz");
	String name1 = "test";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getParameter("code1") %><br/>
${param.code1 }<br/>
<%= name1 %><br/>
${name1}<br/>
${pageContext.request.requestURI}<br/>
${requestScope.name1}<br/>
${10 }<br/>
${10.123 }<br/>
</body>
</html>