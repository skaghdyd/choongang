<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String loginId = (String) session.getAttribute("loginId");
	if(loginId==null){
		System.out.println("세션 없음");
	} else {
		System.out.println("세션 있음");
	}
%>
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

#iframe1 {
	width: 100%;
	height: 100vh;
}

#chatButton {
	position: fixed;
	bottom:30px;
	right:30px;
	border: 1px solid black;
	width: 50px;
	height: 50px;
	line-height: 50px;
}

#chatBox {
	display: none;
	position: fixed;
	bottom: 81px;
	right: 32px;
	width: 400px;
	height: 500px;
}

#messageWindow {
	position: absolute;
	bottom: 50px;
	border: 1px solid black;
	width: 100%;
	height: 450px;
	margin-right: 5px;
	overflow: auto;
}

#inputWindow {
	position: absolute;
	bottom: 0px;
	border: 1px solid black;
	width: 100%;
	height: 50px;
	line-height: 50px;
}

#inputMessage {
	width: 300px;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section id="main" align=center>
		<article id="article1">
			<iframe id="iframe1" name="iframe1" src="main.jsp" width="1000px" height="700px" seamless></iframe>
		</article>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
	<div align="right">
		<div id="chatBox">
			<div id="messageWindow"></div>
			<div id="inputWindow" align="center">
	            <input id="inputMessage" type="text" onkeyup="enterkey()">
	            <input type="button" value="send" onclick="send()">
			</div>
		</div>
		<div id="chatButton" align="center">채팅</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#chatButton").on("click", function(){
				if ($("#chatBox").css("display")=="block"){
					$("#chatBox").hide();
				} else {
					$("#chatBox").show();
				}
			});
		});
		
		var textarea = document.getElementById("messageWindow");
	    var webSocket = new WebSocket('ws://172.30.1.77:8080/____jspProject/broadcasting');
	    var inputMessage = document.getElementById('inputMessage');
	    webSocket.onerror = function(event) {
	        onError(event)
	    };
	    webSocket.onopen = function(event) {
	        onOpen(event)
	        webSocket.send("입|장");
	    };
	    webSocket.onmessage = function(event) {
	        onMessage(event)
	    };
	    function onMessage(event) {
	        var message = event.data.split("|");
	        var sender = message[0];
	        var content = message[1];
	        if (content == "") {
	            
	        } else {
	            if (content.match("/")) {
	                if (content.match(("/" + $("#chat_id").val()))) {
	                    var temp = content.replace("/" + $("#chat_id").val(), "(귓속말) :").split(":");
	                    if (temp[1].trim() == "") {
	                    } else {
	                        $("#messageWindow").html($("#messageWindow").html() + "<p class='whisper'>"
	                            + sender + content.replace("/" + $("#chat_id").val(), "(귓속말) :") + "</p>");
	                    }
	                } else {
	                }
	            } else {
	                if (content.match("!")) {
	                    $("#messageWindow").html($("#messageWindow").html()
	                        + "<p class='chat_content'><b class='impress'>" + sender + " : " + content + "</b></p>");
	                } else {
	                    $("#messageWindow").html($("#messageWindow").html()
	                        + "<p class='chat_content'>" + sender + " : " + content + "</p>");
	                }
	            }
	        }
	    }
	    function onOpen(event) {
	        $("#messageWindow").html("<p class='chat_content'>채팅에 참여하였습니다.</p>");
	    }
	    function onError(event) {
	        alert(event.data);
	    }
	    function send() {
	        if (inputMessage.value == "") {
	        } else {
	            $("#messageWindow").html($("#messageWindow").html()
	                + "<p class='chat_content'>나 : " + inputMessage.value + "</p>");
	        }
	        webSocket.send(/* $("#chat_id").val() */"sessionId" + "|" + inputMessage.value);
	        inputMessage.value = "";
	    }
	    //     엔터키를 통해 send함
	    function enterkey() {
	        if (window.event.keyCode == 13) {
	            send();
	        }
	    }
	    //     채팅이 많아져 스크롤바가 넘어가더라도 자동적으로 스크롤바가 내려가게함
	    window.setInterval(function() {
	        var elem = document.getElementById('messageWindow');
	        elem.scrollTop = elem.scrollHeight;
	    }, 0);
	</script>
</body>
</html>