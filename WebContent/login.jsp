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
	<br>
	<form method="post" action="login.do" name="frm">
		<table border="1" cellspacing="0" cellpadding="0"
			style="width: 30%; height: 30%; font-size: 16pt; text-align: center; margin: auto;">
			<tr>
			
				<td colspan="2">로그인</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>레벨</td>
				<td><select name="level"><option value=A>운영자</option>
						<option value=B>일반회원</option>

				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인"> <input
					type="reset" value="취소"></td>
			</tr>

		</table>

		<script>
			if ('${message}' != '')
				alert('${message}');
		</script>
	</form>
</body>
</html>