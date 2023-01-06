<%@page import="java.sql.Date"%>
<%@page import="jdbc.Emp"%>
<%@page import="jdbc.EmpDeptDao"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int mgr = Integer.parseInt(request.getParameter("mgr"));
	Date hiredate = Date.valueOf(request.getParameter("hiredate"));
	int sal = Integer.parseInt(request.getParameter("sal"));
	int comm = Integer.parseInt(request.getParameter("comm"));
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	
	EmpDeptDao edd = EmpDeptDao.getInstance();
	Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
	int res = edd.insertEmpTemp(emp);
%>
</body>
</html>