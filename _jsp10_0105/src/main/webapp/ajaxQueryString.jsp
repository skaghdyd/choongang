<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<input type="hidden" name="seq" value="1">
		<label>이름을 입력하세요 : </label>
		<input type="text" name="username">
		<br>
		<label>패스워드를 입력하세요 : </label>
		<input type="password" name="passowrd">
		<br> 
		<input type="checkbox" name="hobby" value="music">
		<input type="checkbox" name="hobby" value="yoga">
		<input type="checkbox" name="hobby" value="reading">
		<input type="button" id="submit" value="전송">
	</form>
	<div id="result"></div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#submit").on("click", function(){
				let form_data = $("form").serialize();
				$("#result").text(form_data);
			});
		});
	</script>
</body>
</html>