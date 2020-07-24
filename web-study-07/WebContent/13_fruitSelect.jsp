<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.fruit==1 }">
			<body bgcolor="red">
				<span style="color: white;">사과</span>
			</body>
		</c:when>

		<c:when test="${param.fruit==2 }">
			<body bgcolor="green">
				<span style="color: white;">메론</span>
			</body>
		</c:when>

		<c:when test="${param.fruit==3 }">
			<body bgcolor="yellow">
				<span style="color: white;">바나나</span>
			</body>
		</c:when>
	</c:choose>
</body>
</html>