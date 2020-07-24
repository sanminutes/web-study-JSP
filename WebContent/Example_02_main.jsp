<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	text-align: center;
}

table {
	width: 50%;
	hetight: 100px;
	margin: auto;
}

body {
	font-family: "나눔바른펜";
}
</style>
<script>
	function check() {
		var tname = document.getElementById("name").value;
		var tprice = document.getElementById("price").value;
		var description = document.getElementById("description").value;
		if (tname == '') {
			alert("상품명을 입력해주세요.")
			return false;
		} else if (tprice == '') {
			alert("가격을 입력해주세요.")
			return false;
		} else if (description == '') {
			alert("설명을 입력해주세요.")
			return false;
		} else if (tprice)
			return true;
	}
</script>
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
	<form method="post" action="Example_02_result.jsp">
		<h1>

			<b>상품정보 입력 폼</b>
		</h1>
		<p>
		<p>
		<table>
			<tr>
				<td bgcolor="#3DB7CC" style="text-align: center"><font
					color="white">상품명</font></td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td bgcolor="#3DB7CC" style="text-align: center"><font
					color="white">가격</font></td>
				<td><input type="text" id="price" name="price"></td>
			</tr>
			<tr>
				<td bgcolor="#3DB7CC" style="text-align: center"><font
					color="white">설명</font></td>
				<td><textarea name="description" cols="60" rows="5"
						id="description"></textarea></td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="submit" name="send"
					value="전송" class="btn btn-outline-info" onclick="return check()">
					<input type="reset" name="cancel" value="취소"
					class="btn btn-outline-info"></td>
			</tr>

		</table>
	</form>
</body>
</html>