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
이름 : <input v-model="myName" placeholder="이름을 입력해주세요."><br>
좋아하는 색은 :<br>
<label><input type="radio" value="red" v-model="picked">적</label><br>
<label><input type="radio" value="green" v-model="picked">녹</label><br>
<label><input type="radio" value="blue" v-model="picked">청</label><br>
좋아하는 과일은 :<br>
<label><input type="radio" value="apple" v-model="fruit">사과</label><br>
<label><input type="radio" value="melon" v-model="fruit">멜론</label><br>
<label><input type="radio" value="orange" v-model="fruit">오렌지</label><br>
<p v-bind:style="{color: picked}">내이름은 {{myName}} 이고 좋아하는 색은 {{picked}}입니다.
 좋아하는 과일은 {{fruit}} 입니다.</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/vue@2.7.14/dist/vue.js"></script>
<script>
	new Vue({
		el: "#app",
		data: {
			myName: '',
			picked: 'red',
			fruit: 'apple'
		}		
	});
</script>
</body>
</html>