<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="contents">
	<div>
		<span>전통시장 전체 조회</span>
	</div>
	<div>
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
				<c:forEach var="marketDto" items="${marketDtoList }">
				<tr onclick="test(${marketDto.num })">
					<td data-column="name">${marketDto.name }</td>
					<td data-column="register_num">${marketDto.register_num }</td>
					<td data-column="status">${marketDto.status }</td>
					<td data-column="asso_name">${marketDto.asso_name }</td>
					<td data-column="asso_rep">${marketDto.asso_rep }</td>
					<td data-column="asso_phone">${marketDto.asso_phone }</td>
					<td data-column="tel">${marketDto.tel }</td>
					<td data-column="addr">${marketDto.addr_full }</td>
					<td data-column="man_name">${marketDto.man_name }</td>
					<td data-column="man_email">${marketDto.man_email }</td>
					<td data-column="man_phone">${marketDto.man_phone }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>