<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

//파일이 저장될 서버의 경로. 되도록이면 getRealPath를 이용하자.
//String savePath = "D:/Projects/workspace/projectName/WebContent/folderName";
String savePath = request.getServletContext().getRealPath("uploadFile");
System.out.println(savePath);

//파일 크기 15MB로 제한
int sizeLimit = 1024 * 1024 * 15;
MultipartRequest mr = new MultipartRequest(request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy());
System.out.println(mr.getParameter("title"));
System.out.println(mr.getParameter("content"));
System.out.println(mr.getFilesystemName("selectedFile"));
System.out.println(mr.getOriginalFileName("selectedFile"));
File file = mr.getFile("selectedFile");
if (file == null) {
	out.print("파일 업로드 오류!");
} else {
	out.print("File Name : " + file.getName() + "<br>");
	out.print("File Size : " + file.length() + "<br>");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice Write Action</title>
</head>
<body>
</body>
</html>