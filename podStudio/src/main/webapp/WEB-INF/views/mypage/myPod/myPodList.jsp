<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<table class="table table-hover">
		<tr>
			<th>분야</th>
			<th>팟캐스트 제목</th>
			<th>에피소드 제목</th>
		</tr>
		<c:forEach var="list" items="${ myPodList }">
			<tr>
				<td>${ list.categoryMain }</td>
				<td>${ list.podCastTitle }</td>
				<!-- 팟캐스트보기 에피소드가 되면-->
				<td><a href="/episodeTitle?episodeNo=${list.episodeNo}">${ list.episodeTitle }</a></td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/myPodcast?page=${ page-1 }">[이전]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[이전]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/myPodcast?page=${ page+1 }">[다음]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[다음]
		</c:if>
	</div>

