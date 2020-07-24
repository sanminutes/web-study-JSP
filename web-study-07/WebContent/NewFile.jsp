<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
td, h3 {
	text-align: center;
}

table {
	height: 100px;
	margin: auto;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>2명만 로그인 할 수 있는 로그인 페이지</h3>
	<hr>
	<form method="post" action="test_result.jsp">

		<table>
			<tr>
				<td><b>아이디 : </b></td>
				<td><input type="text" id="id" name="id" size="20"></td>
			</tr>
			<tr>
				<td><b>암 호 :</b></td>
				<td><input type="password" id="pwd" name="pwd" size="20"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="radio" name="level" value="사용자"
					checked="checked"> <b>사용자</b> <input type="radio"
					name="level" value="관리자"> <b>관리자</b></td>

			</tr>
			<tr>
				<td colspan=2><input class="btn btn-info" type="submit" value="로그인"></td>

			</tr>



		</table>

	</form>
</body>

</html>