<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "kosea3";
	String pass = "kosea2019a";
	String sql = "select max(custno) from member_tbl_02";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 등록</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div style="text-align: center;">
		<br>
		<h2>홈쇼핑 회원 등록</h2>
		<br>
		<form action="join.do" method="post" name="frm">


			<table border="1" style="margin: auto;">
				<tr>
					<td><b>회원번호(자동발생)</b></td>

					<%
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							conn = DriverManager.getConnection(url, uid, pass);
							stmt = conn.createStatement();
							rs = stmt.executeQuery(sql);
							while (rs.next()) {
								out.println(
										"<td>" + "<input text='text' name='custno' value='" + (rs.getInt(1) + 1) + "'>" + "</td>");
							}
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							try {
								if (rs != null)
									rs.close();
								if (stmt != null)
									stmt.close();
								if (conn != null)
									conn.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					%>

				</tr>
				<tr>
					<td><b>회원성명</b></td>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<td><b>회원전화</b></td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td><b>회원주소</b></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><b>가입일자</b></td>
					<td><input type="text" name="joindate"></td>
				</tr>
				<tr>
					<td><b>고객등급 [A:VIP,B:일반,C:직원]</b></td>
					<td><input type="text" name="grade"></td>
				</tr>
				<tr>
					<td><b>도시코드</b></td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="등 록"
						onclick="return check()"> <input type="button"
						onclick="location.href='listSearch.do'" value="조 회"></td>
				</tr>
			</table>

			<script>
				if ('${message}' != '')
					alert('${message}');
			</script>
		</form>
	</div>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>