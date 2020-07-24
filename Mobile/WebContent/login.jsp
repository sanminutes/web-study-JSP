<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="univdb.*" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="EUC-KR"
name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1.0,
user-scalable=no"/>

<script>
	function nextWin()
	{
	location = "index.jsp";
	}
</script> 
<title>Insert title here</title>
<style>
* {margin:0 auto;}
#tit {
	 padding-top:100px;
	 }
</style>
</head>

<body onLoad="setTimeout('nextWin()', 1000)"> 

<div id="tit">
<%
	request.setCharacterEncoding("euc-kr"); 
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	MemberDAO mdao = new MemberDAO();
	boolean success = mdao.isPasswd(id, passwd);
	if(!success){
		out.println("<script>alert('회원가입이 안되어 있거나 비밀번호가 다릅니다.');history.go(-1);</script>");
	}else{
		MemberEntity member = mdao.getMember(id);
		session.setAttribute("id", member.getId());
		session.setAttribute("name", member.getName());
		out.println("<center>" + member.getName() + "님 환영합니다. <p> 이 페이지는  자동으로 메인화면으로 이동됩니다. </center>");
%>

<%
if(id.equals("test")){
%>
<a href="#">관리자모드접속(회원목록보기)</a><br>
<%
}
%>
<script>parent.frames.head_two.location.reload();</script>
<%
	}
%>
</div>
</body>
</html>
