<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty loginUser }">
	<jsp:forward page='login.do' />
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
	<jsp:include page="member/header.jsp"></jsp:include>

	<form action="logout.do">
		<table style="margin:auto;">
			<tr>
				<td>안녕하세요. ${loginUser.name }(${loginUser.userid })님</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="btn btn-primary" type="submit"
					value="LOGOUT">&nbsp;&nbsp; <input class="btn btn-primary" type="button"
					value="SETTINGS"
					onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
				</td>
			</tr>


		</table>

	</form>
	<jsp:include page="member/Footer.jsp"></jsp:include>
</body>
</html>