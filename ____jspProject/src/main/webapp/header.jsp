<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
<style type="text/css">
#header_header {
	width: 100%;
	height: 100px;
}

#header_nav {
	width: 100%;
	height: 23px;
	border-top: 1px solid red;
	border-bottom: 1px solid red;
	margin-right: 10%;
	background-color: black;
	color: white;
}

#header_nav * {
	background-color: black;
	color: white;
	text-decoration: none;
	margin-right: 50px;
}
</style>
</head>
<body>
	<header id="header_header" align=center>
		<div align=right>
			<a href="login.jsp">로그인</a> <a href="signUp.jsp">회원가입</a>
		</div>
		<div align=left>
			<a href="main.jsp">로고</a>
		</div>
		<div align=right>
			<a href="#">찜상품보기</a> <a href="#">장바구니</a>
		</div>
	</header>
	<nav id="header_nav" align=center>
		<span>카테고리</span> <a href="#">메뉴1</a> <a href="#">메뉴2</a> <a href="#">메뉴3</a>
		<a href="#">메뉴4</a> <a href="notice.jsp">고객센터</a>
	</nav>
</body>
</html>