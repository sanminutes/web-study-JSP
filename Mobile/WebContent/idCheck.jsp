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
<title>���̵� �ߺ� Ȯ��</title>
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
<div id="y">�̹� ������� ���̵��Դϴ�.</div>
<!-- ���̵� �̹� �����Ҷ� �̹��� -->
<%}else{ %>
<div id="n">��밡���� ���̵��Դϴ�.</div>
<!-- ���̵� �������� ���� �� �̹��� -->
<%} %>
</body>
</html>


