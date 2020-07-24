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

		String appPath = application.getContextPath();
		String filePath = application.getRealPath("06_aaplication.jsp");
		String ServerInfo = application.getServerInfo();
		String ContextPath = application.getContextPath();

		application.log("");
	%>
	웹 애플리케이션의 컨텍스트 패스명
	<br>
	<b><%=appPath%></b>
	<hr>
	웹 애플리케이ㅣ션의 파일 경로명
	<br>
	<b><%=filePath%></b>
	<br>
		<br>
	<b><%=ServerInfo%></b>
	<br>
		<br>
	<b><%=ContextPath%></b>
	<br>
		<br>
	<b><%=filePath%></b>
	<br>

</body>
</html>