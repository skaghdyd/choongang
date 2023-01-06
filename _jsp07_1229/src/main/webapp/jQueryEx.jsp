<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li id="target">클<strong>릭</strong>!</li>
	</ul>
	<input id="ip1" type="text">
	<button id="btn0">click</button>
	<button id="btn1">text</button>
	<button id="btn2">html</button>
	<h2 id="h2">클릭!!</h2>
	<h2 id="h22">클릭!!!</h2>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#btn0").on("click",function(){
				/* $("#target").text($("#ip1").val()); */
				/* $("#target").text("<a href='http://www.naver.com'>네이버</a>"); */
				$("#target").html("<a href='http://www.naver.com'>네이버</a>");
			});
			$("#btn1").on("click",function(){
				alert($("#target").text());
			});
			$("#btn2").on("click",function(){
				alert($("#target").html());
			});
			
			$("#h2").on("click", function() {
				$(this).hide();
				$("#h22").show();				
			});
			$("#h22").on("click", function() {
				$(this).hide();
				$("#h2").show();
			});
		});
	</script>
</body>
</html>