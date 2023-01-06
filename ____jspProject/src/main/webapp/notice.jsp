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

#noticeTable {
	width: 100%;
}

#paging {
	margin: 20px 0 20px 0;
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
			<h1 align="left">공지사항</h1>
			<table id="noticeTable" align=center border="1px">
				<thead>
					<tr>
						<th width="70">번호</th>
						<th width="500">제목</th>
						<th width="120">글쓴이</th>
						<th width="100">작성일</th>
						<th width="100">조회수</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td width="70">1</td>
						<td width="500"><a href="#">1번째 글</a></td>
						<td width="120">1번째 글 글쓴이</td>
						<td width="100">1번째 글 작성일</td>
						<td width="100">1번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">2</td>
						<td width="500"><a href="#">2번째 글</a></td>
						<td width="120">2번째 글 글쓴이</td>
						<td width="100">2번째 글 작성일</td>
						<td width="100">2번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
					<tr>
						<td width="70">3</td>
						<td width="500"><a href="#">3번째 글</a></td>
						<td width="120">3번째 글 글쓴이</td>
						<td width="100">3번째 글 작성일</td>
						<td width="100">3번째 글 조회수</td>
					</tr>
				</tbody>
			</table>
			<div id="paging">[페이징처리예정] 처음 1 2 3 4 5 끝</div>
			<div align="right">
				<input id="noticeWrite" type="button" value="글쓰기"
					onclick="location.href='noticeWrite.jsp'">
			</div>
		</section>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>