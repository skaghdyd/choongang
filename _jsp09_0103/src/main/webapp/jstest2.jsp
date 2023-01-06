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
			car.make = 'samsung';
			car.model = 'sm5';
			car.year = 2012;
			car.buyDate = new Date(2012, 12, 1);

			let owner = new Object();
			owner.name = 'wonder girls';
			owner.age = 20;

			car.owner = owner;

			console.log(car.make);
			console.log(car.model);
			console.log(car.owner.name);
		});
	</script>
</body>
</html>