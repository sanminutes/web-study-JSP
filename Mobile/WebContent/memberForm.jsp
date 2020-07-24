<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1.0,
user-scalable=no"/>
<link href="css/default.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<script type="text/javascript" src="jquery/jquery-1.9.0.js"></script>
<script type="text/javascript" src="jquery/insertCheck.js"></script>
<script type="text/javascript" src="jquery/memberChk.js"></script>
<script type="text/javascript">
$(function() {
	$('#id').blur(function () {
		//alert( $('#name').val());
		
		//AJAX 사용
		//get방식이용 = $.get
		$.get('idCheck.jsp',
		{id : $('#id').val() },
		function(data) {
			$('#message').html(data);
		});
		//$("<div><p>Hello</p></div>".appendTo("body")
	});
	
});


</script>
<style>
* {
  margin:0 auto;
  font-size:14px;
  color:#8C8C8C;
  border:0;
  text-decoration:none;
}
#jR {
	 padding-top:20px;
	 text-align:center;
}
#GG {
	 padding-top:20px;
}
table {border-spacing: 0; align:center;}
table th, table td {padding: 5}

</style>
</head>
<body>
<form method=post action=addMember.jsp name="Form">
<a href="index.jsp"><img src="img/logo.png"  border=0; style="width: 100%; height: auto;"></a>
<table border="1" style="border-collapse:collapse; border:1px solid #D5D5D5;">


<tr>
	<td style="border:1px solid #D5D5D5;" >
	<input type=text name=id id=id size=15 maxlength=20 placeholder=" 아이디" onClick="check()"
	style="width:280px; height:40px; ime-mode:disabled;"><div id="message"></div></td>	
	</tr>
	<tr>
	<td style="border:1px solid #D5D5D5;">
	<input type=password name=passwd size=15 placeholder=" 비밀번호"  
	style="width:280px; height:40px; ime-mode:disabled;"></td>
	</tr>
	<tr>
	<td style="border:1px solid #D5D5D5;">
	<input type=password name=passwd1 size=15 placeholder=" 비밀번호 재입력" onblur="passwdCheck()"
	style="width:280px; height:40px; ime-mode:disabled;"></td>
	</tr>
</table>
<div id="GG">
<table border="1" style="border-collapse:collapse; border:1px solid #D5D5D5;">
	<tr>
	<td style="border:1px solid #D5D5D5;">
	<input type=text name=name size=15 maxlength=20 placeholder=" 이름"
	style="width:280px; height:40px; ime-mode:active;"></td>
	<tr>
	<td style="border:1px solid #D5D5D5;">
	<input type=text name=address size=15 maxlength=20 placeholder=" 주소" 
	style="width:280px; height:40px;"></td>
	<tr>
	<td style="border:1px solid #D5D5D5;">
	<input type=text name=email size=15 maxlength=50 placeholder=" 이메일" 
	style="width:280px; height:40px; ime-mode:disabled;"></td>
</table>
</div>
<div id="jR">
	<input type=submit value="확인" onClick="memberChk()" 
	style="border:1px solid #5CD1E5; font-size:14pt ; color:white ; 
	background-color:#5CD1E5 ; width:280px; height:40px;">
</div>
<div id="jR"></div>

</form>
<jsp:include page="footer.jsp"/>
</body>

</html>
