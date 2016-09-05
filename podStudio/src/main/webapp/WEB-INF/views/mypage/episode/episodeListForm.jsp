<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	#h3Inline	{
	  	display: inline
	}
</style>
<form id="podCastListFormAndAction">
	<div>
		<c:if test="${sessionUser != null}">
			<h3 id="h3Inline">${sessionUser.userNickname}</h3>님의 에피소드 리스트
		</c:if>
		<hr/><br/>
	</div>
	<table class="table table-hover">
		<tr>
				<th>에피소드 번호</th>
				<th>팟캐스트 번호</th>
				<th>에피소드 제목</th>
				<th>에피소드 부제목</th>
				<th>첨부파일 오디오명</th>
				<th>첨부파일 비디오명</th>
 				<th>에피소드 등록일자</th> 
		</tr>
		<c:forEach var="list" items="${episodeList}" >
		<tr>
			<td>${ list.episodeNo }</td>
				<td>${ list.podCastNo }</td>
			<td>${ list.episodeTitle }</td>
			<td>${ list.episodeContent }</td>
			<td>${ list.episodeAudio }</td>
			<td>${ list.episodeVideo }</td>
			<td>${ list.episodeDate }</td>
		</tr>
		</c:forEach>
	</table>
</form>