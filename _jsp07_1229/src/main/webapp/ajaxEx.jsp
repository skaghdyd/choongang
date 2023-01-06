<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>The XMLHttpRequest Object</h2>
	<button id="btn" onClick="getContent()">클릭</button>
	<div id="demo"></div>
	<p>
		<input type="button" id="exe" value="실행">
		<span id="tt"></span>
	</p>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		function getContent() {
			var xhttp = new XMLHttpRequest();
			xhttp.open("GET", "./list.jsp", true);
			xhttp.send();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					document.getElementById("demo").innerHTML = xhttp.responseText;
				}
			}
		}
		
		$("#exe").on("click",function(){
			//console.log("test");
			$.ajax({
				url:"./list.jsp",
				success:function(data){
					$("#tt").html(data);
				}
			});
		});
	</script>
</body>
</html>