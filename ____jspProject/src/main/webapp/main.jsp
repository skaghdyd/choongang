<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<style>
* {
	background-color: white;
}

#main {
	padding-top: 20px;
	width: 100%;
	height: auto;
	min-height: 100%;
	padding-bottom: 200px;
}

#chatButton {
	border: 1px solid black;
	width: 50px;
	height: 50px;
}

#chatBox {
	border: 1px solid black;
	width: 400px;
	height: 500px;
}

#messageWindow, #inputText {
	border: 1px solid black;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section id="main" align=center>
		<article id="article0">
			<p>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
			</p>
		</article>
		<article id="article1">
			<p>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
			</p>
		</article>
		<article id="article2">
			<p>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
				dsjzviopsdisdiajdsjzviopsdisdiajdsjzviopsd<br>
			</p>
		</article>
		<div align="right">
			<div id="chatButton">채팅버튼</div>
			<div id="chatBox">
				<div id="messageWindow">
					<p>1번 채팅</p>
					<p>2번 채팅</p>
					<p>3번 채팅</p>
				</div>
				<fieldset>
		            <input id="inputMessage" type="text" onkeyup="enterkey()">
		            <input type="button" value="send" onclick="send()">
				</fieldset>
			</div>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>