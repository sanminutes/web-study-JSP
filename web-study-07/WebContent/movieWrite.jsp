<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="movie" class="com.mission.javabeans.MovieBean" />
<jsp:setProperty name="movie" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력 완료된 정보</h3>
	<table>
		<tr>
			<td><b>제목</b></td>
			<td><jsp:getProperty name="movie" property="title" /></td>
		</tr>
		<tr>
			<td><b>가격</b></td>
			<td><jsp:getProperty name="movie" property="price" /></td>
		</tr>
		<tr>
			<td><b>감독</b></td>
			<td><jsp:getProperty name="movie" property="director" /></td>
		</tr>
		<tr>
			<td><b>출연배우</b></td>
			<td><jsp:getProperty name="movie" property="actor" /></td>
		</tr>
		<tr>
			<td><b>시놉시스</b></td>
			<td><jsp:getProperty name="movie" property="synopsis" /></td>
		</tr>
		<tr>
			<td><b>장르</b></td>
			<td><jsp:getProperty name="movie" property="genre" /></td>
		</tr>
	</table>
</body>
</html>
