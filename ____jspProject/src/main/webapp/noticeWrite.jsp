<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice</title>
<style>
* {
	background-color: white;
}

#left {
	width: 300px;
	margin-right: 50px;
}

#left ul {
	background-color: black;
	list-style: none;
	margin: 0;
	padding: 0;
}

#left ul li {
	margin-left: 20px;
	padding-top: 5px;
	background-color: black;
}

#left ul li a {
	background-color: black;
	color: white;
	text-decoration: none;
}

#main {
	width: 100%;
	padding: 20px 100px 20px 100px;
	border: 1px solid black;
	margin: 10px auto;
}

#mainDiv {
	display: flex;
	height: auto;
	min-height: 100%;
	padding-bottom: 200px;
}

#board_write {
	border: 1px solid black;
}

#titleDiv, #contentDiv {
	border: 1px solid black;
}

#title {
	width: 99%;
	height: 100%;
	border: none;
}

#content {
	width: 99%;
	height: 100%;
	border: none;
	resize: none;
}

#main * {
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="mainDiv">
		<aside id="left">
			<h4>고객센터</h4>
			<ul>
				<li><a target="iframe1" href="notice.jsp">공지사항</a></li>
				<li><a target="iframe1" href="board.php?board_id=board">자주하는
						질문</a></li>
				<li><a target="iframe1" href="board.php?board_id=music">1:1
						문의</a></li>
				<li><a target="iframe1" href="board.php?board_id=movie">대량주문
						문의</a></li>
			</ul>
		</aside>
		<section id="main" align=center>
			<h4 align="left">공지사항 작성</h4>
			<div>
				<%-- <form action="<%=request.getContextPath() %>/upload" name="boardForm" enctype="multipart/form-data" method="post"> --%>
				<form action="noticeWriteAction.jsp" name="boardForm" enctype="multipart/form-data" method="post">
					<input type="hidden" name="sessionId" value="admin">
					<div id="titleDiv" align="left">
						<input id="title" type="text" name="title" placeholder=" 제목"
							required>
					</div>
					<div id="contentDiv">
						<textarea id="content" name="content" rows="30" placeholder="내용"
							required></textarea>
					</div>
					<div align="left">
						<input type="file" name="selectedFile" />
					</div>
					<div align="right">
						<button type="submit">글 작성</button>
					</div>
				</form>
			</div>
		</section>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>