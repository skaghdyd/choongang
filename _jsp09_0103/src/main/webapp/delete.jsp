<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	Dao dao = Dao.getInstance();
	dao.delteEmpTemp(empno);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	alert("사원번호 " + <%=empno %> + " 삭제완료!");
	window.location.href="list.jsp";
</script>
</body>
</html>