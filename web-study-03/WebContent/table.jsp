<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<%
			int n = 3;
			for (int i = 0; i < n; i++) {
		%>
		<tr>
			<td>Number</td>
			<td><%=i + 1%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>