<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
max ${a=[1,2,3].stream().max().get() }<hr>
min ${a=[1,2,3].stream().min().get() }<hr>
orElse ${a=[23,34,45].stream().min().orElse("없음") }<hr>
orElse ${a=[].stream().min().orElse("없음") }<hr>
orElseGet ${a=[].stream().min().orElseGet(() -> "음-1욦") }<hr>
\${mv='-';'' } ${mv='-';'' }<hr>
\${a=[1,2,3].stream().min().ifPresent(x->(mv=x)) } ${a=[1,2,3].stream().min().ifPresent(x->(mv=x)) }<hr>
최소값 ${mv }

</body>
</html>