<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			let car = new Object();
			car.make = '삼성';
			
			let owner = new Object();
			owner.name = '홍길동';
			owner.age = '30';
			owner.tel = '010-1234-5678';
			owner.address = 'seoul';
			
			car.owner = owner;
			
			console.log(car);
			console.log(owner);
		});
	</script>
</body>
</html>