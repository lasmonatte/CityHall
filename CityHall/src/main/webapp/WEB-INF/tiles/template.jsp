<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cityhall</title>
	<link rel="stylesheet" href="/cityhall/resources/css/tiles/layout_01.css">
</head>
<body>
	<div id="tiles_header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="tiles_nav">
		<tiles:insertAttribute name="nav" />
	</div>
	<div id="tiles_left">
		<tiles:insertAttribute name="left" />
	</div>
	<div id="tiles_content">
		<tiles:insertAttribute name="content" />
	</div>
	<div id="tiles_footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>