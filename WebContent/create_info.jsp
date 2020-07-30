<%@page import="java.sql.DriverManager"%>
<%@page import="com.magic.dto.EmployeesVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "kosea";
	String pass = "kosea2019a";%>
<%
	String sql = "select * from employess where id='" + request.getParameter("id") + "'";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form method="post" action="main.jsp" name="frm">
		<table border="1"
			style="margin: auto; text-align: center; width: 40%; height: 40%;">
			<tr>
				<td colspan="2" style="font-size: 20pt;"><br> <b>사원등록</b><br>${message }</td>
			</tr>
			<%
				try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td style='width: 50%'>아이디</td>");
					out.println("<td>" + rs.getString("id") + "</td>");
					out.println("</tr><tr>");
					out.println("<td>비밀번호</td>");
					out.println("<td>" + rs.getString("pass") + "</td>");
					out.println("</tr><tr>");
					out.println("<td>이름</td>");
					out.println("<td>" + rs.getString("name") + "</td>");
					out.println("</tr><tr>");
					out.println("<td>권한</td>");
					if (rs.getString("lev").equals("A")) {
				out.println("<td>" + "운영자" + "</td>");
					} else {
				out.println("<td>" + "일반회원" + "</td>");
					}
					out.println("</tr><tr>");
					out.println("<td>성별</td>");
					if (rs.getString("gender").equals("1")) {
				out.println("<td>" + "남자" + "</td>");
					} else {
				out.println("<td>" + "여자" + "</td>");
					}
					out.println("</tr><tr>");
					out.println("<td>전화번호</td>");
					out.println("<td>" + rs.getString("phone") + "</td>");
					out.println("</tr><tr>	");
					out.println("<td colspan='2'><input type='submit' value='메인 페이지로 이동'></td>");
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
	</form>
</body>
</html>