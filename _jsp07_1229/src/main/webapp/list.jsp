<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="ajaxTest">
		<%
		String str;
		if (request.getParameter("order") == null) {
			str = "default";
		} else {
			str = request.getParameter("order");
		}
		%>
		<table border="1" style="text-align: center">
			<tr>
				<td>Empno(사번)</td>
				<td>Ename(이름)</td>
				<td>
					<form action="list.jsp">
						<select id="order" name="order">
							<%
							if (str.equals("asc")) {
							%>
							<option value="default">부서별</option>
							<option selected value="asc">오름차순</option>
							<option value="desc">내림차순</option>
							<%
							} else if (str.equals("desc")) {
							%>
							<option value="default">부서별</option>
							<option value="asc">오름차순</option>
							<option selected value="desc">내림차순</option>
							<%
							} else {
							%>
							<option value="default">부서별</option>
							<option value="asc">오름차순</option>
							<option value="desc">내림차순</option>
							<%
							}
							%>
						</select>
					</form>
				</td>
			</tr>
			<%
			EmpDao empDao = EmpDao.getInstance();
			for (Emp emp : empDao.selectAll(str)) {
			%>
			<tr>
				<td><a class="ajaxTest2" href="#"><%=emp.getEmpno()%></a></td>
				<td><%=emp.getEname()%></td>
				<td><%=emp.getDeptno()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<div id="ajaxTest2"></div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script>
		$("#order").on(
				"change",
				function() {
					$.ajax({
						url : "./list.jsp?" + $("#order").attr("name") + "="
								+ $("#order").val(),
						success : function(data) {
							$("#ajaxTest").html(data);
						}
					});
				});
		$(".ajaxTest2").on("click", function(event) {
			event.preventDefault();
			console.log($(this).text());
			$.ajax({
				url : "content.jsp?empno=" + $(this).text(),
				success : function(data) {
					$("#ajaxTest2").html(data);
				}
			});
		});
	</script>
</body>
</html>