<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div>
	<div id="header_logo">
		<img id="h_logo" alt="KDramacity" src="/cityhall/resources/images/logo.png" />
	</div>
	<div id="header_userInfo">
		<sec:authentication property="principal.name"/> <sec:authentication property="principal.position"/>
		<a href="/cityhall/user/logout"><button type="button">로그아웃</button></a> 
	</div>
</div>