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
		//JSON 형식의 문자열
		var dog = {
			name : "식빵",
			family : "웰시코기",
			age : 1,
			weight : 2.14
		};
		console.log(dog);
		
		//JSON 형식의 문자열을 자바스크립트 객체로 변환함.
		var data = JSON.stringify(dog);
		console.log(data);
		
		document.getElementById("json").innerHTML = data + "<br>";
		document.getElementById("json").innerHTML += "이름 : " + dog.name + "<br>";
		document.getElementById("json").innerHTML += "품종 : " + dog.family + "<br>";
		document.getElementById("json").innerHTML += "나이 : " + dog.age + "<br>";
		document.getElementById("json").innerHTML += "몸무게 : " + dog.weight + "<br>";
	</script>
</body>
</html>