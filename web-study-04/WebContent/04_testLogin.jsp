
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = "date123";
	String pwd = "asdf";
	String name = "성윤정";
	request.setCharacterEncoding("UTF-8");
	if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
		response.sendRedirect("04_main.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
	} else
	{
		response.sendRedirect("04_loginForm.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>