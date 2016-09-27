<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div>
	<span>전광판 등록</span>
	<div id="tbl">
		<table>
			<tr>
				<th>종류</th>
				<td>dto.type</td>
				<th>이름</th>
				<td>dto.name</td>
				<th>설치시장</th>
				<td>dto.marketnum으로 가져온 시장명</td>
			</tr>
			<tr>
				<th>크기</th>
				<td>dto.size인치</td>
				<th>설치일자</th>
				<td>dto.date_install
				<th>제조사</th>
				<td>dto.maker</td>
			</tr>
			<tr>
				<th>모델명</th>
				<td>dto.model</td>
				<th>일련번호</th>
				<td>dto.serial</td>
				<th>제조일자</th>
				<td>dto.date_prod</td>
			</tr>
			<!-- 조회때 추가
			<tr>
				<th colspan=6>기    록</th>
			</tr>
			<tr>
				<th>작성자</th>
				<th colspan=4>내  용</th>
				<th>작성일자</th>
			</tr>
			<tr>
				<td colspan=6>LogDto.message</td>
			</tr>
			-->
		</table>
		<div>
			<input type="submit" value="등록" />
		</div>
	</div>
</div>