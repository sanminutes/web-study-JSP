<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="EUC-KR"
name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1.0,
user-scalable=no"/>

<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.4.2.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="jquery/jquery.blueberry.js"></script>


<script>
$(window).load(function() {
	$('.blueberry').blueberry();
});
</script>
<link rel="stylesheet" href="css/blueberry.css" />
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link href="css/front.css" rel="stylesheet" type="text/css" />


</head>


<body>
<jsp:include page="header.jsp" />
	 <div class="blueberry">
      <ul class="slides">
        <li><img src="img/1-1.jpg" /></li>
        <li><img src="img/1-2.png" /></li>
        <li><img src="img/1-5.png" /></li>
        <li><img src="img/2-1.png" /></li>
        <li><img src="img/2-2.png" /></li>
      </ul>
      </div>
     <div id="table">
     <h4>신상품</h4>
     </div>
		<div id="content">
		<section id="main_section">
			<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
		</section>
		<section id="main_section">
			<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
		</section>
		<section id="main_section">
			<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
			</section>
		</div>
	
	
	<div id="table">
	<h4>인기 상품</h4>
	</div>
			<div id="content">
		<section id="main_section">
			<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
		</section>
		<section id="main_section">
				<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
			</section>
		<section id="main_section">
			<article class="main_article">
			<h1>상품</h1>
			<p>정보</p>
			</article>
			</section>
	</div>
<jsp:include page="footer.jsp"/>
	
	
	

</body>
</html>