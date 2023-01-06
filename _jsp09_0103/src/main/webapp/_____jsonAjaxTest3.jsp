<%@page import="java.util.List"%>
<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	border: 1px solid gray;
}
</style>
</head>
<body>
	<table id="treeData"></table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script>
		fetch("_____jsonAjaxTest1.jsp")
		//.then(res=>res.json())
		.then(data=>data.json())
		.then(function(data){
			$("#treeData").append(
					`<tr>
					<td>empno</td>
					<td>ename</td>
					<td>job</td>
					<td>mgr</td>
					<td>hiredate</td>
					<td>sal</td>
					<td>comm</td>
					<td>deptno</td>
					</tr>`
					);
			$.each(data, function() {    	
				$("#treeData").append(
						"<tr>" +
						"<td>" + this.empno + "</td>" + 
						"<td>" + this.ename + "</td>" + 
						"<td>" + this.job + "</td>" + 
						"<td>" + this.mgr + "</td>" + 
						"<td>" + this.hiredate + "</td>" + 
						"<td>" + this.sal + "</td>" + 
						"<td>" + this.comm + "</td>" + 
						"<td>" + this.deptno + "</td>" + 
						"</tr>"
						);
			});
		});
	</script>
</body>
</html>