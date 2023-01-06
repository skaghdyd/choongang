<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
	</ol>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		let list2 = [ 'Jessica', new Date(), 'Tiffany', 'Sunny', 'Crystal',
				'G.NA', new Date(2012, 11, 11) ];
		for (let i = 0; i < list2.length; i++) {
			console.log(list2[i]);
		}

		$(function() {
			let list = [ 'Jessica', 'Tiffany', 'Sunny', 'Crystal', 'G.NA' ];
			$.each(list, function(index, value) {
				$('ol').append('<li>' + value + '</li>');
			});
		});
	</script>
</body>
</html>