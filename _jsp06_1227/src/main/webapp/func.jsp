<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>함수</h1>
	<input type="text" id="inp">
	<button id="btn">함수테스트</button>
	<ul id="lst">
	</ul>
	<script type="text/javascript">
		btn.onclick = function() {
			test();
		}
		function test() {
			let inp = document.querySelector("#inp");
			let li = document.createElement("li");
			li.appendChild(document.createTextNode(inp.value));
			lst.appendChild(li);
		}
	</script>
</body>
</html>