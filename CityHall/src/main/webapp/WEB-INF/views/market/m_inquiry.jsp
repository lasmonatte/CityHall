<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="contents">
	<div>
		<span>조회</span>
	</div>
	<div>
		<table>
			<tr>
				<th>시장명</th>
				<td>dto.name</td>
				<th>사업자 등록번호</th>
				<td>dto.register_num</td>
				<th>상태</th>
				<td>dto.status</td>
			</tr>
			<tr>
				<th>조합명</th>
				<td>dto.asso_name</td>
				<th>조합 전화번호</th>
				<td>dto.tel</td>
				<th>조합장</th>
				<td>dto.asso_rep</td>
			</tr>
			<tr>
				<th>조합장 연락처</th>
				<td>dto.asso_phone</td>
				<th>주소</th>
				<td colspan="3">dto.addr_full</td>
			</tr>
			<tr>
				<th>점포수</th>
				<td>dto.shops</td>
				<th>방문자수</th>
				<td>dto.visitors</td>
				<th>등록일자</th>
				<td>dto.date_reg</td>
			</tr>
			<tr>
				<th>담당자</th>
				<td>dto.man_name</td>
				<th>담당자 이메일</th>
				<td>dto.man_email</td>
				<th>담당자 연락처</th>
				<td>dto.man_phone</td>
			</tr>
		</table>
	</div>
	<div>
		<table>
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
		</table>
	</div>
</div>
