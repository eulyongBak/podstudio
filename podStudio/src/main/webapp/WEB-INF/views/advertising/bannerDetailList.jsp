<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</script>
	<form id="cmDetailListFormAndAction">
	<table border="1">
		<thead>
			<tr>
				<td>배너광고번호</td>
				<td>배너광고제품명</td>
				<td>배너광고업체명</td>
				<td>배너광고이미지</td>
 				<td>배너광고클릭수</td> 
				<td>배너광고 등록일</td> 
				<td>서비스시작일</td> 
				<td>서비스종료일</td> 
				<td>서비스상태(정상서비스 / 서비스진행 / 서비스만료)</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="list" items="${bannerList}" >
			<tr>
				<td>${ list.bannerNo }</td>
 				<td>${ list.bannerProduct }</td>
				<td>${ list.bannerCompany }</td>
				<td>${ list.bannerFileName }</td>
				<td>${ list.bannerCount }</td>
				<td>${ list.bannerDate }</td>
				<td>${ list.bannerServiceStart }</td>
				<td>${ list.bannerServiceEnd }</td>
				<td>${ list.bannerStatus }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>