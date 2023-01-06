<%@page import="java.sql.Date"%>
<%@page import="jdbc.Emp"%>
<%@page import="jdbc.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int mgr = Integer.parseInt(request.getParameter("mgr"));
	String hiredate = request.getParameter("hiredate");
	int sal = Integer.parseInt(request.getParameter("sal"));
	int comm = Integer.parseInt(request.getParameter("comm"));
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	
	Dao edd = Dao.getInstance();
	Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
	int res = edd.insertEmpTemp(emp);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	if(<%=res%> == 0){
		alert("저장실패!");
	} else {
		alert("사원 [<%=empno %> : <%=ename%>] 저장완료!");
	}
	window.location.href="list.jsp";
</script>
</body>
</html>