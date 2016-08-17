<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="podCastListFormAndAction">
	<table border="1">
		<thead>
			<tr>
				<td>에피소드 번호</td>
				<td>팟캐스트 번호</td>
				<td>좋아요순위 번호</td>
				<td>청취수순위 번호</td>
				<td>에피소드 제목</td>
				<td>에피소드 부제목</td>
				<td>첨부파일 오디오명</td>
				<td>첨부파일 비디오명</td>
 				<td>에피소드 등록일자</td> 
			</tr>
		</thead>
		<tbody>
		<c:if test="${sessionUser != null}">
			${sessionUser.userNickname}님의 에피소드 리스트
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
				<td>${ list.episodeVideo }</td>
				<td>${ list.episodeDate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>