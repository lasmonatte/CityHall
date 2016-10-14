<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div>
	<span>시장 계약 정보 등록</span>
	<div class="contents">
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
			<tr>
				<th>파일 업로드</th>
				<td>업로드 버튼</td>
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