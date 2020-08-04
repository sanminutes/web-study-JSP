<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<script src="add.js"></script>

	<form action="upload2.do" method="post" enctype="multipart/form-data">
		<section class="content">
			<table border="1" style="margin: auto;">


				<tr>
					<td>1. 파일 지정 하기 :</td>
					<td><input type="file" name="uploadFile01"></td>
				</tr>
				<!-- 			<tr>
				<td>2. 파일 지정 하기 :</td>
				<td><input type="file" name="uploadFile02"></td>
			</tr>
			<tr>
				<td>3. 파일 지정 하기 :</td>
				<td><input type="file" name="uploadFile03"></td>
			</tr> -->
				<tr>
					<td colspan=2 style="text-align: Center;"><input type="submit"
						value="전송"> <input type="button"
						onclick="javascript:addCheck()" value="추가"></td>
				</tr>


			</table>
		</section>
	</form>

</body>
</html>