<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="m_inquiry.jsp" %>

<div>
	<div class="contents">
		<span>계약 정보</span>
		<table>
			<tr>
				<th>시작일자</th>
				<td>dto.date_start</td>
				<th>종료일자</th>
				<td>dto.date_end</td>
				<th>계약기간</th>
				<td>dto.period</td>
			</tr>
			<tr>
				<th>신규 전광판</th>
				<td>dto.display_new</td>
				<th>대행 전광판</th>
				<td>dto.display_proc</td>
			</tr>
			<tr>
				<th>음악방송</th>
				<td>dto.isMusic</td>
				<th>캘린더</th>
				<td>dto.isCalander</td>
				<th>운영비</th>
				<td>dto.isOperation</td>
			</tr>
			<!-- 
				IF dto.isOperation == true
			<tr>
				<th>전기료</th>
				<td>dto.fare_elec</td>
				<th>통신비</th>
				<td>dto.fare_comm</td>			
			</tr>
			 -->
		</table>
	</div>
	<div class="contents">
		<span>부가서비스 정보</span>
		<table>
			<tr>
				<th>서비스 종류</th>
				<td>paymentDto.category</td>
				<th>업체명</th>
				<td>paymentDto.company_name</td>
				<th>금액</th>
				<td>paymentDto.money</td>
				<th>월 입금일</th>
				<td>paymentDto.due_day</td>
			</tr>
		</table>
	</div>
	<div class="contents">
		<span>전광판 정보</span>
		<table>
			<tr>
				<th>전광판명</th>
				<td>displayDto.name</td>
				<th>크기</th>
				<td>displayDto.size</td>
				<th>제조사</th>
				<td>displayDto.maker</td>
			</tr>
			<tr>
				<th>모델명</th>
				<td>displayDto.model</td>				
				<th>일련번호</th>
				<td>displayDto.serial</td>
				<th>생산일자</th>
				<td>displayDto.date_prod</td>
				<th>설치일자</th>
				<td>displayDto.date_install</td>
			</tr>
		</table>
	</div>
</div>