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
	<h2>부서별 직위별 월급평균</h2>
	<table border="1" style="text-align: center">
		<tr>
			<td>deptno(부서)</td>
			<td>job(직위)</td>
			<td>sal(월급)</td>
		</tr>
		<%
		EmpDao empDao = EmpDao.getInstance();
		for (Emp emp : empDao.selDeptSvg()) {
		%>
		<tr>
			<td><%=emp.getDeptno()%></td>
			<td><%=emp.getJob()%></td>
			<td><%=emp.getSal()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>