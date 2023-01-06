<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="log"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	let list = ['Jessica', 'Tiffany', 'Sunny', 'Crystal', 'G.NA'];
	$('#log').text(list.join(','));
	console.log(list);
});
</script>
</body>
</html>