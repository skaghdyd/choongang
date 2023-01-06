<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmpDao empDao = EmpDao.getInstance();
	Emp emp = empDao.select(empno);
	%>
	<table border="1" style="text-align: center">
		<tr>
			<td>Empno(사번)</td>
			<td>Ename(이름)</td>
			<td>Deptno(부서)</td>
		</tr>
		<tr>
			<td><a href="content.jsp?empno=<%=emp.getEmpno()%>"><%=emp.getEmpno()%></a></td>
			<td><%=emp.getEname()%></td>
			<td><%=emp.getDeptno()%></td>
		</tr>
	</table>
</body>
</html>