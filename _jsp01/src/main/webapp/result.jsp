<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println(request.getParameter("kor"));
	out.println(request.getParameter("math"));
	out.println(request.getParameter("eng"));
	
	String kor = request.getParameter("kor");
	int kNum;
	if(kor==null){
		kNum = 0;
	} else {
		try {
			kNum = Integer.parseInt(kor);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.(국어)");
		}
	}
	
	String math = request.getParameter("math");
	int mNum;
	if(kor==null){
		mNum = 0;
	} else {
		try {
			mNum = Integer.parseInt(math);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.(국어)");
		}
	}
	
	String eng = request.getParameter("eng");
	int eNum;
	if(kor==null){
		eNum = 0;
	} else {
		try {
			eNum = Integer.parseInt(eng);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.(국어)");
		}
	}
	
%>
</body>
</html>