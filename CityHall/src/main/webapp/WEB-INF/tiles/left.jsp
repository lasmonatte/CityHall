<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div id="accordian">
	<ul>
		<li class="active">
			<h3><span class="icon-market"></span>전 통 시 장</h3>
			<ul>
				<li><a href="/cityhall/market/m_registration">시장 등록</a></li>
				<li><a href="/cityhall/market/m_listAll">전체 시장 조회</a></li>
				<li><a href="/cityhall/market/c_registration">계약 등록</a></li>
				<li><a href="/cityhall/market/c_listAll">계약 조회</a></li>
			</ul>
		</li>
		<!-- we will keep this LI open by default -->
		<li>
			<h3><span class="icon-addService"></span>부 가 서 비 스</h3>
			<ul>
				<li><a href="#">부가서비스 등록</a></li>
				<li><a href="#">부가서비스 조회</a></li>
			</ul>
		</li>
		<li>
			<h3><span class="icon-display"></span>전 광 판</h3>
			<ul>
				<li><a href="/cityhall/display/registration">전광판 등록</a></li>
				<li><a href="/cityhall/display/inquiry">전광판 조회</a></li>
			</ul>
		</li>
		<li>
			<h3><span class="icon-ad"></span>광 고 관 련</h3>
			<ul>
				<li><a href="/cityhall/advertiser/registration">광고주 등록</a></li>
				<li><a href="#">광고주 조회</a></li>
				<li><a href="#">광고 등록</a></li>
				<li><a href="#">광고 조회</a></li>
			</ul>
		</li>
	</ul>
</div>

<!-- prefix free to deal with vendor prefixes -->
<script src="http://thecodeplayer.com/uploads/js/prefixfree-1.0.7.js" type="text/javascript"></script>

<!-- jQuery -->
<script src="http://thecodeplayer.com/uploads/js/jquery-1.7.1.min.js" type="text/javascript"></script>

<script src="/cityhall/resources/js/tiles/left.js" type="text/javascript"></script>