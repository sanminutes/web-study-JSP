<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE>
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
<style>
* {
	 padding-top:50px;
	 }
</style>
<title>Insert title here</title>
</head>
<body onLoad="setTimeout('nextWin()', 1000)">
<%
	session.invalidate();
	out.println("<center>로그아웃 됨</center>");
%>

</body>
</html>

