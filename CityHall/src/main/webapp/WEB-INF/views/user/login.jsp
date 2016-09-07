<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>케이드라마씨티</title>
	
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
	<link rel="stylesheet" href="/cityhall/resources/css/login/style.css">
</head>
<body>
<div class="cotn_principal">
	<div class="cont_centrar">
		<div class="cont_login">
			<div class="cont_info_log_sign_up">
				<div class="col_md_login">
					<div class="cont_ba_opcitiy">
						<h2>로그인</h2>  
						<p>발급받은 아이디가 있으시면 로그인 하세요</p> 
						<button class="btn_login" onclick="cambiar_login()">로그인</button>
					</div>
				</div>
				<div class="col_md_sign_up">
					<div class="cont_ba_opcitiy">
						<h2>아이디 발급신청</h2>
						<p>아이디가 없으신 분은 발급신청을 눌러주세요</p>
						<button class="btn_sign_up" onclick="cambiar_sign_up()">아이디 발급신청</button>
					</div>
				</div>
      			</div>
			<div class="cont_back_info">
				<div class="cont_img_back_grey">
					<img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
				</div>
			</div>
			<div class="cont_forms" >
				<div class="cont_img_back_">
					<img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
				</div>
				<div class="cont_form_login">
					<a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
					<h2>로그인</h2>
					<form action="../user/login" method="post" name="login">
					<input type="text" placeholder="아이디" name="id" required/>
					<input type="password" placeholder="비밀번호" name="password" required/>
					<input type="submit" value="로그인" class="btn_login" />
					</form>
				</div>
				<div class="cont_form_sign_up">
					<a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
					<h2>아이디 발급신청</h2>
					<form action="signUp" method="post" name="signup">
					<input type="text" placeholder="아이디" name="id" required pattern="([A-z]{1}?[A-z0-9]{1,19})" title="아이디는 영문으로 시작해야하며 20글자까지 가능합니다" />
					<input type="password" placeholder="비밀번호" name="password" required maxlength="20" id="password" title="비밀번호는 20글자까지 가능합니다."/>
					<input type="password" placeholder="비밀번호 확인" name="conf_password" required maxlength="20" id="conf_password" onkeyup='checkPassword()'/><br />
					<span id="conf_msg"></span>
					<input type="text" placeholder="이름" name="name" required pattern="[A-z가-힣]{2,29}"/>
					<input type="text" placeholder="부서" name="dept" required maxlength="29"/>
					<input type="text" placeholder="직위" name="position" required maxlength="19"/>
					<input type="text" placeholder="연락처" name="phone" required pattern="[0-9]{9,19}" title="숫자만 입력하세요"/>
					<input type="email" placeholder="이메일" name="email" maxlength="99"/>
					<input type="text" placeholder="주소" name="address" maxlength="249"/>
					<span id="btn_sign_up">
					<button type="button" class="btn_sign_up" >정보를 입력하세요</button>
					</span>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="/cityhall/resources/js/login/index.js"></script>
</body>
</html>
