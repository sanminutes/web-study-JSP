<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h2 style="text-align: center;">회원 수정</h2>
	<form action="memberUpdate.do" method="post" name="frm">
		<table style="margin: auto;">
			<tr>
				<td>이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름</td>
				<td><input type="text" name="name" size="20"
					value="${mVo.name }" readonly></td>
			</tr>
			<tr>
				<td>아&nbsp;&nbsp;이&nbsp;&nbsp;디</td>
				<td><input type="text" name="userid" size="20"
					value="${mVo.userid }" readonly></td>
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
				<td><input type="text" name="email" size="20"
					value="${mVo.email }"></td>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" size="20"
					value="${mVo.phone }">
			</tr>
			<tr>
				<td>등&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;급</td>
				<td><c:choose>
						<c:when test="${mVo.admin==0 }">
							<input type="radio" name="admin" value="0" checked="checked">USER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="admin" value="1">ADMIN
</c:when>
						<c:otherwise>
							<input type="radio" name="admin" value="0">USER
<input type="radio" name="admin" value="1" checked="checked">ADMIN
</c:otherwise>
					</c:choose></td>
			</tr>
			<tr>
				<td></td>
				<td><input class="btn btn-primary" type="submit" value="SEND"
					onclick="return joinCheck()" style="WIDTH: 70pt;"> <input
					class="btn btn-primary" type="reset" value="CANCEL"
					style="WIDTH: 70pt;"></td>
			</tr>



		</table>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>