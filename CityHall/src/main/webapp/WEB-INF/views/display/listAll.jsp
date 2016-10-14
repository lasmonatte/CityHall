<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="contents">
	<span>전통시장 전체 조회</span>
	<table>
		<thead>
			<tr>
				<th>시장명</th>
				<th>사업자 등록번호</th>
				<th>시장 상태</th>
				<th>조합명</th>
				<th>조합장</th>
				<th>조합장 연락처</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>담당자명</th>
				<th>담당자 이메일</th>
				<th>담당자 연락처</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td data-column="name">${dto.name }</td>
				<td data-column="register_num">${dto.register_num }</td>
				<td data-column="status">${dto.status }</td>
				<td data-column="asso_name">${dto.asso_name }</td>
				<td data-column="asso_rep">${dto.asso_rep }</td>
				<td data-column="asso_phone">${dto.asso_phone }</td>
				<td data-column="tel">${dto.tel }</td>
				<td data-column="addr">${dto.addr_full }</td>
				<td data-column="man_name">${dto.man_name }</td>
				<td data-column="man_email">${dto.man_email }</td>
				<td data-column="man_phone">${dto.man_phone }</td>
			</tr>
		</tbody>
	</table>
</div>