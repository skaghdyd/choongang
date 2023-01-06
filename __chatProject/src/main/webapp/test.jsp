<%@page import="java.io.IOException"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.Socket"%>
<%@page import="__chatProject.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="_chatbox" style="display: block">
		<fieldset>
			<div id="messageWindow"></div>
			<br /> <input id="inputMessage" type="text" onkeyup="enterkey()" />
			<input type="submit" value="send" onclick="send()" />
		</fieldset>
	</div>
</body>
</html>