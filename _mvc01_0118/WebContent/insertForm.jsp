<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="scott.do" method="post">
		<input type="hidden" name="action" value="insert">
		empno : <input type="text" name="empno"><br>
		ename : <input type="text" name="ename"><br>
		job : <input type="text" name="job"><br>
		mgr : <input type="text" name="mgr"><br>
		hiredate : <input type="text" name="hiredate"><br>
		sal : <input type="text" name="sal"><br>
		comm : <input type="text" name="comm"><br>
		deptno : <input type="text" name="deptno"><br>
		<input type="submit" value="insert">
	</form>
</body>
</html>