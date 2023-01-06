<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="aa"></table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$.getJSON('item.json', function(value){
				console.log(value);
				console.log("***********************");
				$.each(value, function(){
					console.log(this);
				});
			});
		});
	</script>
</body>
</html>