<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.magic.dto.EmployeesVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "kosea";
	String pass = "kosea2019a";%>
<%
EmployeesVO eVos = (EmployeesVO) session.getAttribute("loginUser");
String id = eVos.getId();
String sql = "select * from employess where id='"+id+"'";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<br>
	<form method="post" action="update.do" name="frm">
		<table border=1
			style="margin: auto; text-align: Center; width: 40%; height: 40%">
			<tr>
				<td colspan="2">마이페이지</td>
			</tr>
			<%
				try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td style='width: 50%'>" + "아이디" + "</td>");
					out.println("<td><input type='text' name='id' value='" + rs.getString("id") + "'></td>");
					out.println("</tr><tr>");
					out.println("<td>" + "비밀번호" + "</td>");
					out.println("<td><input type='text' name='pass' value='" + rs.getString("pass") + "'></td>");
					out.println("</tr><tr>");
					out.println("<td >" + "이름" + "</td>");
					out.println("<td><input type='text' name='name' value='" + rs.getString("name") + "'></td>");
					out.println("</tr><tr>");
					out.println("<td >" + "권한" + "</td>");
					out.println("<td><select name='level'>");
					if (rs.getString("lev").equals("A")) {
				out.println("<option value=A>운영자</option>");
					} else {
				out.println("<option value=B>일반회원</option>");
					}
					out.println("</select></td>");
					out.println("</tr><tr>");
					out.println("<td >" + "성별" + "</td>");
					out.println("<td><select name='gender'>");
					if (rs.getString("gender").equals("1")) {
				out.println(" <option value=1>남자</option>");
					} else {
				out.println("<option value=2>여자</option>");
					}
					out.println("</select></td>");
					out.println("</tr><tr>");
					out.println("<td >" + "전화번호" + "</td>");
					out.println("<td><input type='text' name='phone' value='" + rs.getString("phone") + "'></td>");
					out.println("</tr><tr>");
					out.println("<td colspan='2'><input type='submit' value='수정'> <input type='reset' value='취소'></td> ");
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
		<script>
		if ('${message}' != '')
			alert('${message}');
		</script>
	</form>
</body>
</html>