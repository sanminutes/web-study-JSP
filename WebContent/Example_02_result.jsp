<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="info" class="Example_02.JavaBean_02" />
<jsp:setProperty name="info" property="*" />

<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	text-align: center;
}

body {
	font-family: "나눔바른펜";
}
</style>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>
		<b>입력 완료된 정보</b>
	</h1>

	<table class="table">
		<thead class="table table-sm table-dark">
			<tr>
				<th scope="col">구분</th>
				<th scope="col">상품명</th>
				<th scope="col">가격</th>
				<th scope="col">설명</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td><jsp:getProperty property="name" name="info" /></td>
				<td><jsp:getProperty property="price" name="info" /></td>
				<td><jsp:getProperty property="description" name="info" /></td>
			</tr>

		</tbody>
		<tr>
			<td align="center" colspan="4">
				<button type="BUTTON" class="btn btn-outline-dark"
					onclick="location.href='Example_02_main.jsp'">추가 입력</button> <input
				type="button" name="exit" value="닫기" class="btn btn-outline-dark"
				onClick="window.open('','_self').close();">
			</td>
		</tr>


	</table>
</body>
</html>