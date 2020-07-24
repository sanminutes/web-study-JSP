<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<script type="text/javascript" src="script/member.js"></script>
<style>
table {
	height: 100px;
	margin: auto;
	background-color:#AFE1FF	;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="../member/header.jsp"></jsp:include>
	<form action="login.do" method="post" name="frm">
		<table>
			<tr>
				<td><b>아이디&nbsp;</b></td>
				<td><input type="text" name="userid" value="${userid}"></td>
				<td rowspan="2"><input type="button"
					style="WIDTH: 50pt; HEIGHT: 50pt" class="btn btn-primary" value="JOIN"
					onclick="location.href='join.do'"></td>
			</tr>
			<tr>
				<td><b>암&nbsp;&nbsp;&nbsp;&nbsp;호&nbsp;</b></td>
				<td><input type="password" name="pwd"></td>

			</tr>
			<tr>
				<td></td>
				<td align="center"><input class="btn btn-primary" type="submit" value="LOGIN"
					onclick="return loginCheck()" style="WIDTH: 70pt;">
					<input class="btn btn-primary" type="reset" style="WIDTH: 70pt;" value="CANCEL">&nbsp;&nbsp;</td>
				<td></td>

			</tr>
			<tr>
				<td colspan="3" style="text-align:center">${message}</td>
			</tr>


		</table>
	</form>
	<jsp:include page="../member/Footer.jsp"></jsp:include>
</body>
</html>