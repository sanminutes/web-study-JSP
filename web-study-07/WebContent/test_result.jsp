<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<script>
	function check() {
		alert()
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- post로 전송시 한글이 깨지지 않도록 하는 태그  -->
	<fmt:requestEncoding value="UTF-8"></fmt:requestEncoding>
	<c:choose>
		<c:when
			test="${param.id=='user'&&param.pwd==1234&&param.level=='사용자' }">
			<c:redirect url="user.jsp">
				<c:param name="id" value="${param.id }" />
			</c:redirect>
		</c:when>

		<c:when
			test="${param.id=='admin'&&param.pwd==1234&&param.level=='관리자' }">
			<c:redirect url="admin.jsp">
				<c:param name="id" value="${param.id }" />
			</c:redirect>
		</c:when>
		<c:otherwise>
			<script>
				alert("아이디와 비밀번호를 확인해주세요.");
				history.go(-1);
			</script>
		</c:otherwise>

'
	</c:choose>


</body>
</html>