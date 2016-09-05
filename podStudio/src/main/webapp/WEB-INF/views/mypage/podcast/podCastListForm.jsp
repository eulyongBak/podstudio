<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	#h3Inline	{
	  	display: inline
	}
</style>
<form id="podCastListFormAndAction">
	<div>
		<c:if test="${sessionUser != null}">
			<h3 id="h3Inline">${sessionUser.userNickname}</h3>님의 팟캐스트 리스트
		</c:if>
		<hr/><br/>
	</div>
	<table class="table table-hover">
		<tr>
				<th>팟캐스트 번호</th>
				<th>카테고리 번호1</th>
				<th>카테고리 번호2</th>
				<th>팟캐스트 제목</th>
				<th>팟캐스트 부제목</th>
 				<th>공개방송 가능여부(가능 / 불가능)</th> 
 				<th>팟캐스트 개설일자</th> 
		</tr>
		<tbody>
		<c:forEach var="list" items="${podCastList}" >
			<tr>
				<td>${ list.podCastNo }</td>
 				<td>${ list.categoryNo1 }</td>
				<td>${ list.categoryNo2 }</td>
				<td>${ list.podCastTitle }</td>
				<td>${ list.podCastSubTitle }</td>
				<td>${ list.podCastPublicBroadCast }</td>
				<td>${ list.podCastDate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>