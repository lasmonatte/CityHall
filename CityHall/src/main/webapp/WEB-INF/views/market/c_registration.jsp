<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div>
	<span>전통시장 정보 등록</span>
	<div id="tbl">
		<table>
			<tr>
				<th>시장명</th>
				<td><input type="text" name="name" /></td>
				<th>사업자 등록번호</th>
				<td><input type="text" name="register_num" /></td>
				<th>상태</th>
				<td>dto.status 리스트</td>
			</tr>
			<tr>
				<th>조합명</th>
				<td><input type="text" name="asso_name" /></td>
				<th>조합장</th>
				<td><input type="text" name="asso_rep" /></td>
				<th>조합장 연락처</th>
				<td><input type="text" name="asso_phone" /></td>
			</tr>
			<tr>
				<th>조합 전화번호</th>
				<td><input type="text" name="tel" /></td>
				<th>주소</th>
				<td>addr_db 시도 리스트</td>
				<td>addr_db 시군구 리스트</td>
				<td><input type="text" name="addr_full" /></td>
			</tr>
			<tr>
				<th>점포수</th>
				<td><input type="text" name="shops" /></td>
				<th>방문자수</th>
				<td><input type="text" name="visitors" /></td>
			<!--
				* DB 입력 기본값이 current_timestamp()이므로
					등록 화면에서 굳이 표시할 필요가 없을듯
			 	<th>등록일자</th>
				<td>dto.date_reg 날짜선택</td>
				 -->
			</tr>
			<tr>
				<th>담당자</th>
				<td><input type="text" name="man_name" /></td>
				<th>담당자 이메일</th>
				<td><input type="text" name="man_email" /></td>
				<th>담당자 연락처</th>
				<td><input type="text" name="man_phone" /></td>
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