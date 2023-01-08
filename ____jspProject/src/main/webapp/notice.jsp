<%@page import="notice.PageVO"%>
<%@page import="notice.NoticeDto"%>
<%@page import="java.util.List"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int currentPage = 1; //처음엔 무조건 1페이지

if (request.getParameter("currentPage") != null) {
	//선택한 페이지가 있으면 해당 페이지로 변경
	currentPage = Integer.parseInt(request.getParameter("currentPage"));
}

Dao dao = Dao.getInstance();

List<NoticeDto> noticeList = dao.notice_selectAll(currentPage);
int totalPost = dao.notice_getTotalPost();
PageVO pageVO = new PageVO(currentPage, 10, totalPost);
System.out.println(pageVO.toString());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice</title>
<style>
* {
	background-color: white;
}

#mainDiv {
	display: flex;
	height: auto;
	min-height: 100%;
	padding-bottom: 200px;
}

#main {
	width: 100%;
	padding: 20px 100px 20px 100px;
	border: 1px solid black;
	margin: 10px auto;
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
	<div id="mainDiv">
		<jsp:include page="noticeAside.jsp"></jsp:include>
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
					<%
					for (NoticeDto noticeDto : noticeList) {
						String createDate = noticeDto.getCreateDate();
						String year = createDate.substring(0, 4);
						String month = createDate.substring(4, 6);
						String date = createDate.substring(6, 8);
					%>
					<tr>
						<td width="70"><%=noticeDto.getIdx()%></td>
						<td width="500"><a href="#"><%=noticeDto.getTitle()%></a></td>
						<td width="120"><%=noticeDto.getAuthor()%></td>
						<td width="100"><%=year + "-" + month + "-" + date%></td>
						<td width="100"><%=noticeDto.getHit()%></td>
					</tr>
					<%
					}
					%>

				</tbody>
			</table>
			<div id="paging">
				<%
				if (totalPost > 0) {
					if (pageVO.isPrev()) {
				%>
				<a target="iframe1" href="notice.jsp?currentPage=1">처음</a> <a
					target="iframe1"
					href="notice.jsp?currentPage=<%=pageVO.getFirstPage() - 1%>">이전</a>
				<%
				}
				for (int i = pageVO.getFirstPage(); i <= pageVO.getLastPage(); i++) {
				%>
				<a target="iframe1" href="notice.jsp?currentPage=<%=i%>"><%=i%></a>
				<%
				}
				if (pageVO.isNext()) {
				%>
				<a target="iframe1"
					href="notice.jsp?currentPage=<%=pageVO.getLastPage() + 1%>">다음</a> <a
					target="iframe1"
					href="notice.jsp?currentPage=<%=pageVO.getEndPage()%>">끝</a>
				<%
				}
				}
				%>
			</div>
			<div align="right">
				<input id="noticeWrite" type="button" value="글쓰기"
					onclick="location.href='noticeWrite.jsp'">
			</div>
		</section>
	</div>
</body>
</html>