<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1.0,
user-scalable=no"/>
<link href="css/default.css" rel="stylesheet" type="text/css" />
<link href="css/front.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<style>
* {
  margin:0 auto;
  font-size:14px;
  color:#8C8C8C;
  border:0;
  text-decoration:none;
}
#tit {
	 padding-top:50px;

	 }
#textline {
		  text-align:center;
		  padding-bottom:20px;
		  border-bottom:1px dotted gray;
		  }
#menu_one {
		  display:table;
		  width:100%;
	
	      }
#menu_one > div {

				display: table-cell;

	      		}
#menu_one > div > a {
					display: blcok;
					height: 35px;
					line-height: 35px;
					text-align:center;
					color:gray;
					float:left;
					width:90%;



					}

</style>
	
</head>
<body>

<form method=post action=login.jsp>
	<a href="index.jsp"><img src="img/logo.png" border=0; style="width: 100%; height: auto; "></a>
<table>


<tr>
	<td style="border:1px solid #D5D5D5;" >
	<input type=text name=id maxlength=25 placeholder=" ���̵�"  style="width:280px; height:40px; ime-mode:disabled;"></td>
</tr>

<tr>
	<td style="border:1px solid #D5D5D5;" >
	<input type=password name=passwd maxlength=25 placeholder=" ��й�ȣ" style="width:280px; height:40px; ime-mode:disabled;"></td>
</tr>
<tr height=20>
</tr>

<tr>
	<td>
	<div id="textline">
	
		<input type=submit value="�α���" style="	border:1px solid #5CD1E5; font-size:14pt ; color:white ; background-color:#5CD1E5 ; width:220px"> 
		</div>
		<div id="menu_one">
		<div><a href="#">���̵�ã��</a></div>
		<div><a href="#">��й�ȣã��</a></div>
		<div><a href="memberForm.jsp">ȸ������</a></div>
		</div>
	</td>
</tr>
</table>
</form> 

<div id="tit"></div>
<jsp:include page="footer.jsp"/>
</body>
</html>