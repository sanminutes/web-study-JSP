function insertCheck(){
//���̵� �Է¿��� �˻�
if(document.Form.id.value=="")
{
 alert("���̵� �Է����� �ʾҽ��ϴ�.")
 document.Form.id.focus()
 return
}
//���̵� ��ȿ�� �˻� (�����ҹ���, ���ڸ� ���)
for (i=0;i<document.Form.id.value.length ;i++ )
{
 ch=document.Form.id.value.charAt(i)
  if (!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z'))
  {
  alert ("���̵�� �ҹ���, ���ڸ� �Է°����մϴ�.")
  document.Form.id.focus()
  document.Form.id.select()
  return
  }
}
//���̵� ���� ������� �ʱ�
if (document.Form.id.value.indexOf(" ")>=0)
{
 alert("���̵� ������ ����� �� �����ϴ�.")
 document.Form.id.focus()
 document.Form.id.select()
 return
}
//���̵� ���� üũ (6~12��)
if (document.Form.id.value.length<6 || document.Form.id.value.length>12)
{
 alert ("���̵� 6~12�ڱ��� �Է����ּ���.")
 document.Form.id.focus()
 document.Form.id.select()
 return
}
//��й�ȣ �Է¿��� üũ
if(document.Form.passwd.value=="")
{
 alert("��й�ȣ�� �Է����� �ʾҽ��ϴ�.")
 document.Form.passwd.focus()
 return
}
//��й�ȣ ���� üũ(4~8�� ���� ���)
if (document.Form.passwd.value.length<4 || document.Form.passwd1.value.length>8)
{
 alert ("��й�ȣ�� 4~8�ڱ��� �Է����ּ���.")
 document.Form.passwd.focus()
 document.f.passwd.select()
 return
}

//��й�ȣ�� ��й�ȣ Ȯ�� ��ġ���� üũ
if (document.Form.passwd.value!=document.Form.passwd1.value)
{
 alert("��й�ȣ�� ��ġ���� �ʽ��ϴ�")
 document.Form.passwd.value=""
 document.Form.passwd1.value=""
 document.Form.passwd.focus()
 return
}
}