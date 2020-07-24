<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 표현 언어(EL, EXpression Language : 이렇게 값을 가져오면 편하다 -->
	${"표현 언어로 적은 Hello" }
	<br>
	<!-- 표현식 (Expression) -->
	<%="표현식으로 적은 " + "Hello"%><br>
	<!-- 스크립트릿 -->
	<%
		out.println("스크립트릿으로 적은 " + "Hello");
	%>
	<br>

</body>
</html>