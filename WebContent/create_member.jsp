<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form method="post" action="create.do" name="frm">
		<table border="1"
			style="margin: auto; text-align: center; width: 40%; height: 40%;">
			<tr>
				<td colspan=2>사원등록</td>
			</tr>
			<tr>
				<td style="width: 50%;">아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>권한</td>
				<td><select name="lev"><option value="A">운영자</option>
						<option value="B">일반회원</option></select></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><select name="gender"><option value="1">남자</option>
						<option value="2">여자</option></select></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="등록"> <input
					type="reset" value="취소"> <input type="button"
					value="메인 페이지로 이동" onclick="location.href='main.jsp'"></td>
			</tr>
		</table>
		<script>
			if ('${message}' != '')
				alert('${message}');
		</script>
	</form>
</body>
</html>