<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="aa"></div>
<h1>--------------------------</h1>
<div id="bb"></div>
<h1>--------------------------</h1>
<h1 id="cc"></h1>
<h1>--------------------------</h1>
<h1 id="dd"></h1>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			let list = ['123','<h2>3.45</h2>','테스트','2023년 1월'];
			$("#aa").html(list);
			$("#bb").text(list);
			$("#cc").html(list);
			$("#dd").text(list);
		});
	</script>
</body>
</html>