<%@page import="com.board.db.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.bean.exam.*" %>  

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
    Score s = new Score();
    s.setName("홍길동");
    s.setKor(85);
    s.setEng(76);    
    request.setAttribute("score1", s);
    
    BoardDto boardDto = new BoardDto();
    boardDto.setWriter("홍길동");
    boardDto.setNum(123);
    request.setAttribute("boardDto", boardDto);
%>
    이름 : ${score1.name}<br>
    국어 : ${score1.kor}<br>
    영어 : ${score1.eng}<br><br>
    
    이름 : ${boardDto.writer}<br>
 글번호 : ${boardDto.num}<br>
</body>
</html>