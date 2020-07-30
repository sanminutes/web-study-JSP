<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.magic.dto.EmployeesVO"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="0"
		style="width: 100%; height: 100%; font-size: 20pt; text-align: center;">
		<tr>
	
			<%
				if (session.getAttribute("loginUser") == null) {
			%>
			<td style="width: 15%"></td>
			<td style="width: 15%"></td>
			<td style="width: 15%" onmouseover="this.style.background='#BDBDBD'"
				onmouseout="this.style.background='white'"><a href="login.jsp"
				style="color: black; text-decoration:none;">로그인</a></td>
			<td style="width: 30%">사원 등록<br> <a style="color: gray;">(관리자로
					로그인 후 사용가 능)</a>
			</td>
			<td style="width: 25%">마이페이지<br> <a style="color: gray;">(로그인
					후 사용 가능)</a>
			</td>
			<%
				} else {
			%>
			<td style="width: 15%">${loginUser.name }님반갑습니다</td>
			<td style="width: 15%">레벨 : ${loginUser.lev }</td>
			<td style="width: 15%" onmouseover="this.style.background='#BDBDBD'"
				onmouseout="this.style.background='white'"><a href="logout.do"
				style="color: black; text-decoration: none;">로그아웃</a></td>
			<%
				EmployeesVO eVos = (EmployeesVO) session.getAttribute("loginUser");
			String lev = eVos.getLev();

			if (lev.equals("A")) {
			%>
			<td style="width: 30%" onmouseover="this.style.background='#BDBDBD'"
				onmouseout="this.style.background='white'"><a
				href="create_member.jsp"
				style="color: black; text-decoration: none;">사원 등록<br></a></td>
			<%
				} else {
			%>
			<td style="width: 30%">사원 등록<br> <a style="color: gray;">(관리자로
					로그인 후 사용가 능)</a>
			</td>
			<%
				}
			%>

			<td style="width: 25%" onmouseover="this.style.background='#BDBDBD'"
				onmouseout="this.style.background='white'"><a href="update.do"
				style="color: black; text-decoration: none;">마이페이지<br></a></td>
			<%
				}
			%>

		</tr>
	</table>

</body>
</html>