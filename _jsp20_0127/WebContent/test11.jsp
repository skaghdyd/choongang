<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
1 ${a=[1,2,3,4,5].stream()
.anyMatch(v->v>4).get() }<hr>

2 ${a=[1,2,3,4,5].stream()
.allMatch(v->v>1).get() }<hr>

3 ${a=[1,2,3,4,5].stream()
.noneMatch(v->v>5).get() }<hr>
</body>
</html>