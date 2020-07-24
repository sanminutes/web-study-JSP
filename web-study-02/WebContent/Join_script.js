	function check() {
		var sname = document.getElementById('tname').value;
		var snum = document.getElementById('tnum').value;
		var snum_b = document.getElementById('tnum_b').value;
		var sid = document.getElementById('tid').value;
		var spwd = document.getElementById('tpwd').value;
		var spwd_b = document.getElementById('tpwd_b').value;
		var semail = document.getElementById('temail').value; 
		var spost = document.getElementById('tpost').value;
		var saddr = document.getElementById('taddr').value;
		var scontact = document.getElementById('tcontact').value;
		var sjob = document.getElementById('job').value;
		var item_chk= false;
        var items = document.getElementsByName('item');
''
        for(var i=0;i<items.length;i++){
            if(items[i].checked == true) {
                item_chk	 = true;
                break;
            }
        }
		if (sname == '') {
			alert('이름을 입력해주세요.');
			return false;
		}else if (snum == '' || snum_b == '') {
			alert('주민번호를 입력해주세요.');
			return false;
		} else if (sid == '') {
			alert('아이디를 입력해주세요.');
			return false;
		} else if (spwd == '' || spwd_b == '') {
			alert('비밀번호를 입력해주세요.');
			return false;
		} else if (spwd != spwd_b) {
			alert('비밀번호 확인해주세요.');
			return false;
		} else if (semail == '') {
			alert('이메일을 입력해주세요.');
			return false;
		}else if(spost == ''){
			alert('우편번호를 입력해주세요.');
			return false;
		}else if(saddr ==''){
			alert('주소를 입력해주세요.');
			return false;
		}else if(scontact==''){
			alert('핸드폰번호를 입력해주세요.');
			return false;
		}else if(sjob==''){
			alert('직업을 선택해주세요.');
			return false;
		}else if(!item_chk){
            alert('관심분야 체크해주세요.');
            return false;

		}else{
			return true;
		}
	}