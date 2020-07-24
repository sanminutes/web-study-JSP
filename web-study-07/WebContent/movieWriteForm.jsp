<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="movieWrite.jsp">
		<h3>정보 등록</h3>
		<table>
			<tr>
				<td><b>제목</b></td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td><b>가격</b></td>
				<td><input type="text" name="price">원</td>
			</tr>
			<tr>
				<td><b>감독</b></td>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<td><b>출연배우</b></td>
				<td><input type="text" name="actor"></td>
			</tr>
			<tr>
				<td><b>시놉시드</b></td>
				<td><textarea name="synopsis" cols="40" rows="10"></textarea></td>
			</tr>
			<tr>
				<td><b> 장르</b></td>
				<td><select id="genre" name="genre" size="1">
						<option value="">선택하세요</option>
						<option value="로맨스">로맨스</option>
						<option value="스릴러">스릴러</option>
						<option value="미스터리">미스터리</option>
						<option value="액션">액션</option>
						<option value="코미디">코미디</option>
						<option value="애니메이션">애니메이션</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align=right><input type="submit" value="확 인">
					<input type="submit" value="취 소"></td>
			<tr>
		</table>
	</form>
</body>
</html>