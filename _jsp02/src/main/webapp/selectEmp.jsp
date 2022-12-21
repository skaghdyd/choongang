<%@page import="java.sql.Date"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("oracle.jdbc.OracleDriver");
	//out.println("드라이버 로딩");

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String password = "tiger";
	Connection conn = DriverManager.getConnection(url, user, password);
	//out.println("DB 연결<br>");

	String sql = "select * from emp where deptno = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);

	//http://localhost:8080/_jsp02/selectEmp.jsp?deptNo=20
	int num = Integer.parseInt(request.getParameter("deptNo"));
	pstmt.setInt(1, num);

	ResultSet rs = pstmt.executeQuery();
	%>

	<table border="1">
		<tr>
			<td>empNo</td>
			<td>eName</td>
			<td>job</td>
			<td>mgr</td>
			<td>hireDate</td>
			<td>sal</td>
			<td>comm</td>
			<td>deptNo</td>
		</tr>
		<%
		while (rs.next()) {
			int empNo = rs.getInt("EMPNO");
			String eName = rs.getString("ENAME");
			String job = rs.getString("JOB");
			String mgr = rs.getString("MGR");
			Date hireDate = rs.getDate("HIREDATE");
			int sal = rs.getInt("SAL");
			int comm = rs.getInt("COMM");
			int deptNo = rs.getInt("DEPTNO");
			//out.println(empNo + " - " + eName + " - " + job + " - " + mgr + " - " + hireDate + " - " + sal + " - " + comm + " - " + deptNo + "<br>");
		%>
		<tr>
			<td><%=empNo%></td>
			<td><%=eName%></td>
			<td><%=job%></td>
			<td><%=mgr%></td>
			<td><%=hireDate%></td>
			<td><%=sal%></td>
			<td><%=comm%></td>
			<td><%=deptNo%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>