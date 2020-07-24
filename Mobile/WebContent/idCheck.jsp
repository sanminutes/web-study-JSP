<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="dao" class="univdb.MemberDAO"/>
<%
 int re = 0;
 String id = (String)request.getParameter("id");
 re = dao.idCheck(id);
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>아이디 중복 확인</title>
<style>
*{}
#y{
  color:red;
  font-size:12px;
  }
#n{
  color:blue;
   font-size:12px;
  }
</style>
</head>
<body>
<%
if(re == 1){

%>
<div id="y">이미 사용중인 아이디입니다.</div>
<!-- 아이디가 이미 존재할때 이미지 -->
<%}else{ %>
<div id="n">사용가능한 아이디입니다.</div>
<!-- 아이디가 존재하지 않을 때 이미지 -->
<%} %>
</body>
</html>


