/* ȸ�������� - ������ ���� üũ*/
function memberChk()
 {
  var check = document.Form;

 if (check.id.value == "") {
   alert("���̵� �Է��ϼ���");
   check.id.focus();
   return false;
  }

 if (check.passwd.value == "") {
   alert("��й�ȣ�� �Է��ϼ���");
   check.passwd.focus();
   return false;
  }

 if (check.passwd1.value == "") {
   alert("��й�ȣ�� �ٽ��ѹ� �Է����ּ���");
   check.passwd1.focus();
   return false;
  }

 if (check.passwd != Form.passwd1.value) {
   alert("��й�ȣ�� �ٸ��ϴ�.");
   check.passwd.value = "";
   check.passwd1.value = "";
   check.passwd.focus();
   return false;
  }

 if (check.name.value == "") {
   alert("�̸��� �Է��� �ּ���");
   check.name.focus();
   return false;
   
   check.submit();
  }
 }