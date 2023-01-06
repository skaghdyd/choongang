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
			let car2 = {
				make : 'samsung',
				model : 'sm5',
				year : 2012,
				buydate : new Date(2012, 12, 1),
				owner : {
					name : 'wonder girls',
					age : 20
				}
			}
			console.log(car2.make);
			console.log(car2.model);
			console.log(car2.owner.name);
			console.log(car2.owner.age);
		});
	</script>
</body>
</html>