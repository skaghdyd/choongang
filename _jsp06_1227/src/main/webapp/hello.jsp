<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Web Programming</h1>
	<input id="in">
	<button id="btn">클릭</button>
	<ul id="itemList">
		<li>HTML</li>
		<li>CSS</li>
		<li>Javascript</li>
	</ul>
	<script type="text/javascript">
		btn.addEventListener("click", function() {
			var inText = document.getElementById("in").value;
			var txtNode = document.createTextNode(inText);
			
			var newLi = document.createElement("li")
			newLi.appendChild(txtNode);
			
			document.querySelector("#itemList").appendChild(newLi);
		});
	</script>
</body>
</html>