<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<input id="toggle" type="checkbox" />
<div id="wrap">

	
<nav id="top_gnb">
	<div>
	<%
		Object obj_id = session.getAttribute("id");
		Object obj_name = session.getAttribute("name");
	
		if(obj_name == null){
	%>
		<a href="loginForm.jsp"><b>LOGIN</b></a>
	<%
		}else{
		String name = (String)obj_name;
	%>
		<a href="logout.jsp" target=main><b>LOGOUT</b></a>
	<%
		}
	%>
	</div>	
	<div><a href="#"><b>MYPAGE</b></a></div>
	<div><a href="#"><b>CART</b></a></div>
	<div><a href="#"><b>WISHLIST</b></a></div>
	</nav>
		
	<header id="main_header">	
	<div id="logo">
		<a href="index.jsp"><img src="img/logo.png" border=0;  style="width: 100%; height: auto;"></a></div>
	</header>

	<nav id="bottom_gnb">
		<div id="tit"></div>
	<div><label for="toggle" onclick="">MENU</label></div>
	<div><a href="brand.jsp">BRAND</a></div>
	<div><a href="#">GALLERY</a></div>
	<div><a href="#">Q&A</a></div>
	</nav>
	
	<div id="toogle_gnb_wrap">
	<div id="toggle_gnb">
	<ul>
		<li><a href="#">��Ų�ɾ�</a></li>
		<li><a href="#">Ŭ��¡</a></li>
		<li><a href="#">������/��</a></li>
		<li><a href="#">�ٵ�/���</a></li>
		<li><a href="#">���̽� ����ũ��</a></li>
		<li><a href="#">����Ʈ ����ũ��</a></li>
		
		</ul>
		</div>
		</div>
	</div>
</body>
</html>