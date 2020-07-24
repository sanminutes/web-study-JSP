<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String internet = request.getParameter("internet");
	System.out.println(internet + "//");
	if (internet.equals("네이버")) {
		response.sendRedirect("http://www.naver.com");
	} else if (internet.equals("다음")) {
		response.sendRedirect("http://www.daum.net");
	} else if (internet.equals("네이트")) {
		response.sendRedirect("http://www.nate.com");
	} else {
		response.sendRedirect("http://www.google.co.kr");
	}
%>