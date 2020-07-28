
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
	String pass = "kosea2019a";%>
<%
	String cpage = request.getParameter("custno");
	String sql = "select * from member_tbl_02 where custno=" + cpage;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 정보 수정</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div style="text-align: center;">
		<br>
		<h2>홈쇼핑 회원 정보 수정</h2>
		<form action="update.do" method="post" name="frm">


			<table border="1" style="margin: auto;">
				<tr>

					<%
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							conn = DriverManager.getConnection(url, uid, pass);
							stmt = conn.createStatement();
							rs = stmt.executeQuery(sql);
							while (rs.next()) {
								out.println("<td>회원번호</td>");
								out.println("<td><input type='text' name='custno' value='" + rs.getString(1) + "'></td>");
								out.println("</tr><tr>");
								out.println("<td>회원성명</td>");
								out.println("<td><input type='text' name='custname' value='" + rs.getString(2) + "'></td>");
								out.println("</tr><tr>");
								out.println("<td>회원전화</td>");
								out.println("<td><input type='text' name='phone' value='" + rs.getString(3) + "'></td>");
								out.println("</tr><tr>");
								out.println("<td>회원주소</td>");
								out.println("<td><input type='text' name='address' value='" + rs.getString(4) + "'></td>");
								out.println("</tr><tr>");
								out.println("<td>가입일자</td>");
								out.println("<td><input type='text' name='joindate' value='" + rs.getString(5).subSequence(0, 10)
										+ "'></td>");
								out.println("</tr><tr>");
								out.println("<td>고객등급(A:VIP,B:일반,C:직원)</td>");
								out.println("<td><input type='text' name='grade' value='" + rs.getString(6) + "'></td>");
								out.println("</tr><tr>");
								out.println("<td>거주도시</td>");
								out.println("<td><input type='text' name='city' value='" + rs.getString(7) + "'></td>");
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
					<td colspan="2"><input type="submit" value="수 정"> <input
						type="button" onclick="location.href='listSearch.do'" value="조 회"></td>
				</tr>

			</table>

			<script>
				if ('${message}' != '')
					alert('${message}');
			</script>
		</form>
	</div>
</body>
</html>