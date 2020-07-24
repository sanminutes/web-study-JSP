<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 예제</title>
<script type="text/javascript" src="Join_script.js"></script>
<!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>
	<h3>회원가입</h3>
	<form method="get" action="JoinServlet">
		<table >
			<tr>
				<td>이름</td>
				<td><input type="text" id="tname" name="name"></td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td><input type="text" id="tnum" name="IDnum"> - <input
					type="text" id="tnum_b" name="IDnum_2"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" id="tid" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" id="tpwd" name="pwd"></td>
			</tr>
			<tr>
				<td>비밀번호확인</td>
				<td><input type="password" id="tpwd_b" name="pwd_r"></td>
			</tr>
			<tr>
				<td><label for="email">이메일</label></td>
				<td><input type="text" id='temail' name="email_a"> @ <input
					type="text" name="email_b"> <select id="email_b"
					name="email" size="1">
						<option value="naver.com">naver.com</option>
						<option value="kakao.com">kakao.com</option>
				</select></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" id="tpost" name="post"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" id = "taddr" name="addr"> <input type="text"
					name="addr_b"></td>
			</tr>
			<tr>
				<td>핸드폰번호</td>
				<td><input type="text" id="tcontact" name="contact"></td>
			</tr>
			<tr>
				<td><label for="job" style="float: left;">직업</label></td>
				<td><select id="job" name="interest" size='4'><option
							value="학생">학생</option>
						<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
						<option value="언론">언론</option>
						<option value="공무원">공무원</option>
						<option value="군인">홍진선</option>
				</select></td>
			</tr>
			<tr>
				<td>메일/SMS 정보 수신</td>
				<td><input type="radio" id="chk_mail" name="chk_mail"
					value="yes" checked>수신 <input type="radio" id="chk_mail"
					name="chk_mail" value="no">수신거부</td>
			</tr>
			<tr>
				<td>관심분야</td>
				<td><input type="checkbox"  name="item" value="생두">생두 <input
					type="checkbox" name="item" value="원두">원두 <input
					type="checkbox" name="item" value="로스팅">로스팅 <input
					type="checkbox" name="item" value="핸드드립">핸드드립 <input
					type="checkbox" name="item" value="에스프레소">에스프레소 <input
					type="checkbox" name="item" value="창업">창업</td>
			</tr>

		</table>

		<table style="width: 60%; height: 100px; text-align: center;">
			<tr>
				<td>
				<input class="btn btn-primary" type="submit" value="회원가입"  onclick="return check()">
					<input class="btn btn-primary" type="reset" value="취소"></td>
			</tr>
		</table>
	</form>

</body>
</html>