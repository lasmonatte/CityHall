/* ------------------------------------ Click on login and Sign Up to  changue and view the effect
---------------------------------------
*/

function cambiar_login() {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";  
document.querySelector('.cont_form_login').style.display = "block";
document.querySelector('.cont_form_sign_up').style.opacity = "0";               

setTimeout(function(){  document.querySelector('.cont_form_login').style.opacity = "1"; },400);  
  
setTimeout(function(){    
document.querySelector('.cont_form_sign_up').style.display = "none";
},200);  
  }

function cambiar_sign_up(at) {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
  document.querySelector('.cont_form_sign_up').style.display = "block";
document.querySelector('.cont_form_login').style.opacity = "0";
  
setTimeout(function(){  document.querySelector('.cont_form_sign_up').style.opacity = "1";
},100);  

setTimeout(function(){   document.querySelector('.cont_form_login').style.display = "none";
},400);  


}    



function ocultar_login_sign_up() {

document.querySelector('.cont_forms').className = "cont_forms";  
document.querySelector('.cont_form_sign_up').style.opacity = "0";               
document.querySelector('.cont_form_login').style.opacity = "0"; 

setTimeout(function(){
document.querySelector('.cont_form_sign_up').style.display = "none";
document.querySelector('.cont_form_login').style.display = "none";
},500);  
  
  }


//Check Password
function checkPassword(){
	var password=document.getElementById('password').value;
	var conf_password=document.getElementById('conf_password').value;
	var msg="";

	if(password==conf_password){
		msg="비밀번호가 일치합니다.";
		document.getElementById('btn_sign_up').innerHTML="<input type=\"submit\" value=\"발급신청\" class=\"btn_sign_up\" />";
	} else{
		msg="비밀번호가 일치하지 않습니다.";
		document.getElementById('btn_sign_up').innerHTML="<button type=\"button\" class=\"btn_sign_up\" >정보를 입력하세요</button>"
	}
	
	document.getElementById('conf_msg').innerHTML = msg;
}
	