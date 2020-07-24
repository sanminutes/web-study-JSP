<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="univdb.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("euc-kr"); %>
<jsp:useBean id="member" class="univdb.MemberEntity" scope="page" />
<jsp:setProperty name="member" property="*" />
<center>
<%
	MemberDAO mdao = new MemberDAO();
	boolean success = mdao.insertDB(member);
	if(!success)
		out.println("<script>alert('회원가입 실패'); history.go(-1);</script>");
	else{
		out.println("<h2>회원가입 성공 </h2>");
		out.println("<a href='loginForm.jsp'>로그인</a>");
	}
%>
</center>
</body>
</html>
