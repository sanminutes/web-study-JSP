<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색 엔진 정보 페이지</h1>
	<br>
	<h3>검색 엔진을 선택하세요.</h3>
	<br>
	<form action="TestResult.jsp">
		<select id="internet" name="internet" size="1">
			<option value="네이버">네이버</option>
			<option value="다음">다음</option>
			<option value="네이트">네이트</option>
			<option value="구글">구글</option>

		</select>
			<input type="submit" value="확인">
	</form>
</body>
</html>