<%@page import="java.util.List"%>
<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	Dao dao = Dao.getInstance();
	String str = dao.selectEmpTempJsonOne(empno);
	System.out.println(str);
	out.print(str);
%>