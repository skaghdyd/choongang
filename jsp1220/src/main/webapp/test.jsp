<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>오늘은 2022-12-20</h1>
	<form action="">
		구구단 <input type="text" name="level">단<br> <input
			type="submit" value="실행">
	</form>
	<%
	String str = request.getParameter("level");
	if (str != null) {
		int level = 0;
		try {
			level = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
		}
		for (int i = 1; i <= 9; i++) {
	%>
	<h2><%=i * level%></h2>
	<%
	}
	}
	%>
</body>
</html>