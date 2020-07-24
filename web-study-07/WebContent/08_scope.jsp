<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%
	pageContext.setAttribute("name", "page man");
	request.setAttribute("name", "request man");
	session.setAttribute("name", "session man");
	application.setAttribute("name", "application man");
%> --%>

name : ${name}
<hr>
page 속성 : ${pageScope.name}
<hr>
request 속성 : ${requestScope.name}
<hr>
session 속성 : ${sessionScope.name}
<hr>
application 속성 : ${applicationScope.name}
<hr>