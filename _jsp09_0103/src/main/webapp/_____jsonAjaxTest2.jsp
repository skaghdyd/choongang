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
    $(function () {
        $.ajax({
            url: "_____jsonAjaxTest1.jsp",		// 데이터를 가져올 경로 설정
            datatype: "json",		// 데이터를 가져오는 방식
            success: function(data){	// 데이터를 가져왔을때 동작. 매개변수로 data 입력
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
				$.each($.parseJSON(data), function() {    	
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
            }
        }) 	
     });
 </script>
</body>
</html>