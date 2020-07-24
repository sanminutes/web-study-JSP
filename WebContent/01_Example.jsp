<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<script>
	function check() {
		var tname = document.getElementById("name").value;
		if (tname == '') {
			alert("작성자 입력란을 채워주세요");
			return false;
		}
	}
</script>
<style>
h2 {
	text-align: center;
}

table {
	width: 60%;
	hetight: 100px;
	margin: auto;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="01_result.jsp">
		<h2>게시판 글쓰기</h2>
		<br>

		<table>
			<tr>
				<td bgcolor="#BDBDBD" align="center"><b>작성자</b></td>
				<td><input type="text" id="name" name="name" size="20"></td>
			</tr>

			<tr>
				<td bgcolor="#BDBDBD" align="center"><b>비밀번호</b></td>
				<td><input type="password" name="pass" size="20">(게시물
					수정 삭제시 필요합니다)</td>
			</tr>

			<tr>
				<td bgcolor="#BDBDBD" align="center"><b>이메일</b></td>
				<td><input type="text" name="email" size="50"></td>
			</tr>

			<tr>
				<td bgcolor="#BDBDBD" align="center"><b>글 제목</b></td>
				<td><input type="text" name="title" size="80"></td>
			</tr>

			<tr>
				<td bgcolor="#BDBDBD" align="center"><b>글 내용</b></td>
				<td><textarea cols="90" rows="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" name="send" value="등록"
					onclick="return check()"> <input type="reset" name="cancel"
					value="다시 작성"></td>
			</tr>



		</table>
	</form>
</body>
</html>