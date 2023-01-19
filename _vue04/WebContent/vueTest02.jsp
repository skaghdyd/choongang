<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Vue.js sample</title>
    <link rel="stylesheet" href="style.css" >
    <script src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.js"></script>
</head>
<body>
<div id="app">
    <p> {{ myText }} </p>
    <p> {{ myPrice }} </p>
    <p> {{ myTea }} </p>
    <p> {{ teaList }} </p>
    <p> {{ $data }} </p>
	<hr>
	<li v-for="(item, key) in $data">
		{{key}}:{{item}}
	</li>
</div>
<script>
let teaList = [
	{name:'커피1',price:3000},
	{name:'커피2',price:4000},
	{name:'커피3',price:5000},
];
    new Vue({
        el: '#app',
        data: {
        	teaList: teaList,
        	myTea: {name:'커피',price:3000},
            myText: ['홍길동','홍길서','홍길남','홍길북'],
            myPrice: 500
        }
    })
</script>
</body>
</html>