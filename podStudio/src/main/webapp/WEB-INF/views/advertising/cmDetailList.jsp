<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</script>

<form id="cmDetailListFormAndAction">
	<table class="table table-hover">
		<thead>
			<tr>
				<td>CM광고번호</td>
				<td>CM광고제품명</td>
				<td>CM광고업체명</td>
				<td>CM광고내용</td>
 				<td>CM광고클릭수</td> 
				<td>CM광고 등록일</td> 
				<td>서비스시작일</td> 
				<td>서비스종료일</td> 
				<td>서비스상태(정상서비스 / 서비스진행 / 서비스만료)</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="list" items="${cmList}" >
			<tr>
				<td>${ list.cmNo }</td>
 				<td>${ list.cmProduct }</td>
				<td>${ list.cmCompany }</td>
				<td>${ list.cmContent }</td>
				<td>${ list.cmCount }</td>
				<td>${ list.cmDate }</td>
				<td>${ list.cmServiceStart }</td>
				<td>${ list.cmServiceEnd }</td>
				<td>${ list.cmStatus }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>