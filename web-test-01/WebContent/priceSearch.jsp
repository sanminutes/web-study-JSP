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
	String sql = "SELECT mt2.custno, mt2.custname,mt3.PRICE , sum(mt.price) FROM money_TBL_02 mt, MEMBER_TBL_02 mt2, GRADE_TBL_02 mt3 WHERE mt.CUSTNO = mt2.CUSTNO AND mt2.grade = mt3.GRADE GROUP BY mt2.custno, mt2.custname, mt3.PRICE ORDER BY sum(mt.PRICE) desc";%>
<title>회원매출조회</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<br>
	<h2 style="text-align: center">회원매출조회</h2>
	<br>
	<table border="1" style="margin: auto; text-align: center;">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>고객등급</th>
			<th>매출</th>
		</tr>
		<%
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("<td>" + rs.getString(4) + "</td>");
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
	<br>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>