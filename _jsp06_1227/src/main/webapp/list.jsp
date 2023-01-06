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
	String str;
	if (request.getParameter("order") == null) {
		str = "default";
	} else {
		str = request.getParameter("order");
	}
	%>
	<table border="1" style="text-align: center">
		<tr>
			<td>Empno(사번)</td>
			<td>Ename(이름)</td>
			<td>
				<form action="list.jsp">
					<select name="order" onChange="submit()">
						<%
						if (str.equals("asc")) {
						%>
						<option value="default">부서별</option>
						<option selected value="asc">오름차순</option>
						<option value="desc">내림차순</option>
						<%
						} else if (str.equals("desc")) {
						%>
						<option value="default">부서별</option>
						<option value="asc">오름차순</option>
						<option selected value="desc">내림차순</option>
						<%
						} else {
						%>
						<option value="default">부서별</option>
						<option value="asc">오름차순</option>
						<option value="desc">내림차순</option>
						<%
						}
						%>
					</select>
				</form>
			</td>
		</tr>
		<%
		EmpDao empDao = EmpDao.getInstance();
		for (Emp emp : empDao.selectAll(str)) {
		%>
		<tr>
			<td><a href="content.jsp?empno=<%=emp.getEmpno()%>"><%=emp.getEmpno()%></a></td>
			<td><%=emp.getEname()%></td>
			<td><%=emp.getDeptno()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>