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
<input v-model.lazy="myName" placeholder="여기를 수정해보세요">
<p>{{myText}}</p>
<p>나는 {{myName}}입니다.</p>
<textarea v-model="myText2"></textarea>
<p>문장은 {{myText2}}입니다.</p>
<p>문자수는 {{myText2.length}}자 입니다.</p>
<hr>
<label><input type="radio" value="red" v-model="picked">적</label>
<label><input type="radio" value="green" v-model="picked">녹</label>
<label><input type="radio" value="blue" v-model="picked">청</label>
<p>{{picked}} 선택됨.</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/vue@2.7.14/dist/vue.js"></script>
<script>
	new Vue({
		el: "#app",
		data: {
			myText: '안녕',
			myName: '',
			myText2: 'hi',
			picked: 'green'
		}		
	});
</script>
</body>
</html>