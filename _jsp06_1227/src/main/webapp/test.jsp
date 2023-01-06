<%@page import="java.util.Comparator"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.*"%>
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
	EmpDao ed = EmpDao.getInstance();
	List<Emp> list = ed.selectAll("a");

	double avg = list.stream().filter(emp -> emp.getDeptno() == 10).mapToInt(Emp::getSal).average().getAsDouble();
	out.println(avg + "<br>");

	List<Emp> dept10 = new ArrayList<Emp>();
	list.stream().filter(emp -> emp.getDeptno() == 20).forEach(e -> dept10.add(e));
	for (Emp emp : dept10) {
		out.println(emp + "<br>");
	}
	%>

	<table border="1" style="text-align: center">
		<tr>
		<td>deptNo(부서)</td>
		<td>avg_sal(월급평균)</td>
		</tr>
		<%
		Map<Integer, Double> map = list.stream()
				.collect(Collectors.groupingBy(Emp::getDeptno, Collectors.averagingDouble(Emp::getSal)));
		List<Integer> deptNoList = new ArrayList<Integer>(map.keySet());
		deptNoList.sort((s1, s2) -> s1.compareTo(s2));
		for (Integer deptNo : deptNoList) {
		%>
		<tr>
			<td><%=deptNo%></td>
			<td><%=map.get(deptNo)%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>