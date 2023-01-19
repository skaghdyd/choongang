<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="app">
<input v-model.lazy="myName" placeholder="myName">
<p>{{myText}}</p>
<p>나는 {{myName}}입니다.</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/vue@2.7.14/dist/vue.js"></script>
<script>
	new Vue({
		el: "#app",
		data: {
			myText: '안녕',
			myName: '왕홍식'
		}		
	});
</script>
</body>
</html>