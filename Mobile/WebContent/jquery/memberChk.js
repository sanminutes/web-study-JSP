/* 회원가입폼 - 데이터 유무 체크*/
function memberChk()
 {
  var check = document.Form;

 if (check.id.value == "") {
   alert("아이디를 입력하세요");
   check.id.focus();
   return false;
  }

 if (check.passwd.value == "") {
   alert("비밀번호를 입력하세요");
   check.passwd.focus();
   return false;
  }

 if (check.passwd1.value == "") {
   alert("비밀번호를 다시한번 입력해주세요");
   check.passwd1.focus();
   return false;
  }

 if (check.passwd != Form.passwd1.value) {
   alert("비밀번호가 다릅니다.");
   check.passwd.value = "";
   check.passwd1.value = "";
   check.passwd.focus();
   return false;
  }

 if (check.name.value == "") {
   alert("이름을 입력해 주세요");
   check.name.focus();
   return false;
   
   check.submit();
  }
 }