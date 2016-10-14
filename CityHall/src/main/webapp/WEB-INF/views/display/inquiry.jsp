<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div>
	<span>전광판 조회</span>
	<div class="contents">
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
			<tr>
				<th colspan=6>기    록</th>
			</tr>
			<tr>
				<th>작성자</th>
				<th colspan=4>내  용</th>
				<th>작성일자</th>
			</tr>
			<tr>
				<td>LogDto.reg_name + LogDto.reg_position</td>
				<td colspan=4>LogDto.message</td>
				<td>dto.date_reg</td>
			</tr>
		</table>
	</div>
</div>