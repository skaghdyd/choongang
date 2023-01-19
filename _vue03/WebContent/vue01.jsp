<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/vue@2.7.14/dist/vue.js"></script>
<div id="app">
<input v-model="empno" placeholder="사원번호를 입력해주세요.">
<button v-on:click="search">검색</button>
<p>{{empno}}</p>
<h3 id="en"></h3>
<h3>{{response}}</h3>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script>
new Vue({
	el: "#app",
	data: {
		myText: '안녕!',
		empno: '',
		response:''
	},
	methods:{
		search:function(){
			let vue = this;
			console.log("**************");
			console.log(this);
			console.log("**************");
			fetch('fetchEmpJsonOne.jsp?empno='+this.empno)
			.then(res=>res.json())
			.then(function(data){
				console.log(data);
				console.log(data.ename);
				console.log(data.job);
				console.log(data.sal);
				$("#en").text(data.ename+","+data.job+","+data.sal)
				vue.response = data;
				console.log("**************");
				console.log(vue);
				console.log("**************");
			})
		}
	}
})
</script>
</body>
</html>


