<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>KDramacity</title>
</head>
<body>
<form action='<c:url value="/user/signUp"/>' method="post">
	아이디 : <input type="text" name="id" id="id"/>
	비밀번호 : <input type="password" name="password" id="password"/>
	이름 : <input type="text" name="name" id="name"/>
	부서 : <input type="text" name="dept" id="dept"/>
	직위 : <input type="text" name="position" id="position"/> 
	  
	 권한 :
	 <select name="authorities" id="authorities">
		<option value="ROLE_USER">사용자</option>
		<option value="ROLE_ADMIN">관리자</option>
	</select>
	<input type="submit" value="회원가입">
</form>

</body>
</html>