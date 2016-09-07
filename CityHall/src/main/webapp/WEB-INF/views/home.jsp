<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p> <sec:authentication property="principal.name"/> <sec:authentication property="principal.position"/>님 </p>
<sec:authentication property='principal.enabled'/>


