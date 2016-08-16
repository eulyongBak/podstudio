<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="podCastListFormAndAction">
	<table border="1">
		<thead>
			<tr>
				<td>팟캐스트 번호</td>
				<td>카테고리 번호1</td>
				<td>카테고리 번호2</td>
				<td>팟캐스트 제목</td>
				<td>팟캐스트 부제목</td>
 				<td>공개방송 가능여부(가능 / 불가능)</td> 
 				<td>팟캐스트 개설일자</td> 
			</tr>
		</thead>
		<tbody>
		<c:if test="${sessionUser != null}">
			${sessionUser.userNickname}님의 팟캐스트 리스트
		</c:if>
		<c:forEach var="list" items="${episodeList}" >
			<tr>
				<td>${ list.episodeNo }</td>
 				<td>${ list.podCastNo }</td>
				<td>${ list.goodNo }</td>
				<td>${ list.listenNo }</td>
				<td>${ list.episodeTitle }</td>
				<td>${ list.episodeContent }</td>
				<td>${ list.episodeAudio }</td>
				<c:if test="${list.episodeVideo != null}">
					<td>${ list.episodeVidio }</td>
				</c:if>
				<td>${ list.episodedate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>