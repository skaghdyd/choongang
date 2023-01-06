<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="json"></div>
	<script type="text/javascript">
		var date = new Date(); //자바스크립트 Date 객체
		console.log(date);
		
		var data = date.toJSON(); //JSON 형식의 문자열을 자바스크립트 객체로 변환함.
		console.log(data);
		
		document.getElementById("json").innerHTML = date + "<br>";
		document.getElementById("json").innerHTML += data;
	</script>
</body>
</html>