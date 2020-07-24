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
}

.htag {
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="../member/header.jsp"></jsp:include>
	<div class="htag">'*' 표시 항목은 필수 입력 항목입니다.</div>
	<br>
	<form action="join.do" method="post" name="frm">
		<table>
			<tr>
				<td>이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름</td>
				<td><input type="text" name="name" size="20">*</td>
			</tr>
			<tr>
				<td>아&nbsp;&nbsp;이&nbsp;&nbsp;디</td>
				<td><input type="text" name="userid" size="20" id="userid">*
					<input type="hidden" name="reid" size="20"> <input
					class="btn btn-primary" type="button" value="ID CEHCK"
					onclick="idCheck()"></td>
			</tr>
			<tr>
				<td>암&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;호</td>
				<td><input type="password" name="pwd" size="20">*</td>
			</tr>
			<tr height="30">
				<td width="80">암호확인</td>
				<td><input type="password" name="pwd_check" size="20">*</td>
			</tr>
			<tr>
				<td>이&nbsp;&nbsp;메&nbsp;&nbsp;일</td>
				<td><input type="text" name="email" size="20"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" size="20"></td>
			</tr>
			<tr>
				<td>등&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;급</td>
				<td><input type="radio" name="admin" value="0"
					checked="checked">USER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
					type="radio" name="admin" value="1">ADMIN</td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><input class="btn btn-primary" type="submit"
					value="SEND" onclick="return joinCheck()" style="WIDTH: 70pt;">
					<input class="btn btn-primary" type="reset" value="CANCEL"
					style="WIDTH: 70pt;"></td>
			</tr>
			<tr>
				<td colspan="2">${message }</td>
			</tr>
		</table>
	</form>
	<jsp:include page="../member/Footer.jsp"></jsp:include>
</body>
</html>