<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "kosea3";
	String pass = "kosea2019a";
	String sql = "SELECT custno, custname, phone, address, joindate, t.PRICE, city FROM KOSEA3.MEMBER_TBL_02 m, KOSEA3.GRADE_TBL_02 t WHERE m.GRADE = t.GRADE";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div style="text-align: center">
		<br>
		<h2>회원목록조회/수정</h2>
			<table border="1" style="margin: auto; text-align: center;">
				<tr>
					<th>회원번호</th>
					<th>회원성명</th>
					<th>전화번호</th>
					<th>주소</th>
					<th>가입일자</th>
					<th>고객등급</th>
					<th>거주지역</th>
				</tr>
				<%
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn = DriverManager.getConnection(url, uid, pass);
						stmt = conn.createStatement();
						rs = stmt.executeQuery(sql);
						while (rs.next()) {
							out.println("<tr>");
							out.println("<td>" + "<a href='update.jsp?custno=" + rs.getString(1) + "'>" + rs.getString(1)
									+ " </a></td>");
							out.println("<td>" + rs.getString(2) + "</td>");
							out.println("<td>" + rs.getString(3) + "</td>");
							out.println("<td>" + rs.getString(4) + "</td>");
							out.println("<td>" + rs.getString(5).substring(0, 10) + "</td>");
							out.println("<td>" + rs.getString(6) + "</td>");
							out.println("<td>" + rs.getString(7) + "</td>");
							out.println("</tr>");
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
			</table>
	</div>
</body>
</html>