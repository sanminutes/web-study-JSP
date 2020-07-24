<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "kosea2";
	String pass = "kosea2019a";
	String sql = "select * from employee";%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	text-align: center;
	height: 100px;
	margin: auto;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<table class="table">
		<thead class="thead-dark">
			<tr>

				<th>NAME</th>
				<th>ADDRESS</th>
				<th>SSN</th>

			</tr>
		</thead>
		<%
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString("name").toUpperCase() + "</td>");
					out.println("<td>" + rs.getString("address").toUpperCase() + "</td>");
					out.println("<td>" + rs.getString("ssn") + "</td>");
					out.println("</tr>");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						rs.close();
					if (conn != null)
						rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		%>
	</table>
	<%@ include file="Footer.jsp"%>
</body>
</html>