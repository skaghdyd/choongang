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
			let car = {
					make:'삼성',
					owner:{
						name:'홍길동',
						age:'30',
						tel:'010-1234-5678',
						address:'seoul'
					}
			};
			
			console.log(car);
		});
	</script>
</body>
</html>