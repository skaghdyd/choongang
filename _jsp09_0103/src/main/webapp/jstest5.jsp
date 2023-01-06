<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 이용하기</title>
<style>
td {
	border: 1px solid gray;
}
</style>
</head>
<body>
	<table id="treeData"></table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$.ajax({
				url:"item.json",
				dataType:"json",
				success:function(data){
					$("#treeData").append(
							`<tr>
							<td>id</td>
							<td>name</td>
							<td>price</td>
							<td>description</td>
							</tr>`
							);
					$.each(data, function() {
						$("#treeData").append(
								"<tr>" +
								"<td>" + this.id + "</td>" + 
								"<td>" + this.name + "</td>" + 
								"<td align='right'>" + this.price + "</td>" + 
								"<td>" + this.description + "</td>" + 
								"</tr>"
								);
					});
					console.log('ajax통신으로 json데이터 가져오기 성공');
				}
			});
			/* $.getJSON('item.json', function(data, textStatus) {
				//console.log(data);
				//console.log(textStatus);
				$("#treeData").append(
						`<tr>
						<td>id</td>
						<td>name</td>
						<td>price</td>
						<td>description</td>
						</tr>`
						);
				$.each(data, function() {
					$("#treeData").append(
							"<tr>" + "<td>" + this.id + "</td>" + "<td>"
									+ this.name + "</td>"
									+ "<td align='right'>" + this.price
									+ "</td>" + "<td>" + this.description
									+ "</td>" + "</tr>");
				});
			}); */
		});
	</script>
</body>
</html>