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
	<table class="bb" border="1"></table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			let list = [ '가', '나', '다', '라' ];
			$.each(list, function(index, value) {
				$("#aa").append(value + '<br>');
				$(".bb").append('<tr><td>' + value + '</td></tr>');
			});
		});
	</script>
</body>
</html>