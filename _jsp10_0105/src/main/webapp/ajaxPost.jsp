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
		<label>이름을 입력하세요 : </label>
		<input type="text" name="username" class="username">
		<br>
		<input type="button" id="submit" value="전송">
	</form>
	<div id="message"></div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#submit").on("click", function() {
				let username = $(".username").val();
				let sendData = "username=" + username;

				$.post("welcome.jsp", sendData, function(msg) {
					$("#message").html(msg);
					console.log("*****");
					console.log(msg);
					console.log(sendData);
				});
				return false;
			});
		});
	</script>
</body>
</html>