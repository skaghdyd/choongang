<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
PrintWriter writer = response.getWriter();

request.setCharacterEncoding("utf-8");

//request.getServletContext().getContextPath()
String savePath = "C:\\Users\\admin\\Desktop\\choongang\\" + request.getServletContext().getContextPath() + "\\src\\main\\webapp\\uploadFile";
System.out.println("savePath >>> " + savePath);

//파일 크기 15MB로 제한
int sizeLimit = 1024 * 1024 * 15;
MultipartRequest mr = new MultipartRequest(request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy());

File file = mr.getFile("selectedFile");
if (file == null) {
	out.print("파일 업로드 오류!");
} else {
	String oldName = mr.getFilesystemName("selectedFile");//자동으로 생성된 파일명
	String extension = oldName.substring(oldName.lastIndexOf("."), oldName.length());//확장자
	String now = new SimpleDateFormat("yyyyMMddHHmmssS").format(new Date());//현재시간
	
	//신규 파일명 : 세션아이디_현재시간_확장자
	File newFile = new File(savePath + File.separator + mr.getParameter("sessionId") + "_" + now + extension);
	file.renameTo(newFile);//파일명 수정
	
	System.out.println("**********************************************************");
	System.out.println("File Name : " + newFile.getName());
	System.out.println("File Size : " + newFile.length());
	System.out.println("**********************************************************");
	
	writer.println("<script>");
	writer.println("alert('글 작성이 완료되었습니다.')");
	writer.println("location.href='notice.jsp'");
	writer.println("</script>");
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