function insertCheck(){
//아이디 입력여부 검사
if(document.Form.id.value=="")
{
 alert("아이디를 입력하지 않았습니다.")
 document.Form.id.focus()
 return
}
//아이디 유효성 검사 (영문소문자, 숫자만 허용)
for (i=0;i<document.Form.id.value.length ;i++ )
{
 ch=document.Form.id.value.charAt(i)
  if (!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z'))
  {
  alert ("아이디는 소문자, 숫자만 입력가능합니다.")
  document.Form.id.focus()
  document.Form.id.select()
  return
  }
}
//아이디에 공백 사용하지 않기
if (document.Form.id.value.indexOf(" ")>=0)
{
 alert("아이디에 공백을 사용할 수 없습니다.")
 document.Form.id.focus()
 document.Form.id.select()
 return
}
//아이디 길이 체크 (6~12자)
if (document.Form.id.value.length<6 || document.Form.id.value.length>12)
{
 alert ("아이디를 6~12자까지 입력해주세요.")
 document.Form.id.focus()
 document.Form.id.select()
 return
}
//비밀번호 입력여부 체크
if(document.Form.passwd.value=="")
{
 alert("비밀번호를 입력하지 않았습니다.")
 document.Form.passwd.focus()
 return
}
//비밀번호 길이 체크(4~8자 까지 허용)
if (document.Form.passwd.value.length<4 || document.Form.passwd1.value.length>8)
{
 alert ("비밀번호를 4~8자까지 입력해주세요.")
 document.Form.passwd.focus()
 document.f.passwd.select()
 return
}

//비밀번호와 비밀번호 확인 일치여부 체크
if (document.Form.passwd.value!=document.Form.passwd1.value)
{
 alert("비밀번호가 일치하지 않습니다")
 document.Form.passwd.value=""
 document.Form.passwd1.value=""
 document.Form.passwd.focus()
 return
}
}