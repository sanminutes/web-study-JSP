<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css"> 
<!-- 
A:link {text-decoration:none; color:black;} 
A:visited {text-decoration:none; color:black;} 
A:hover {text-decoration:none; color:black;} 
--> 
</style> 

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<body style="margin-right:20px;">

<%
	Object obj_id = session.getAttribute("id");
	Object obj_name = session.getAttribute("name");
	
	if(obj_name == null){
%>

<div ALIGN=right><font size=2><a href="memberForm.html" target=main>회원가입</a>
<a href="loginForm.html" target=main>로그인</a></font></div>

<%
	}else{
		String name = (String)obj_name;
%>
<div ALIGN=right><font size=2><%=name %>님 
<a href="logout.jsp" target=main>로그아웃</a></font></div>
<%
	}
%>
</body>
</html>
