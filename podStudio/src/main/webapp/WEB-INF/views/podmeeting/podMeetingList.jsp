<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Title</title>
<style>
table, tr, th, td {
	border: 1px solid #000000;
}

body {
	width: 900px;
	margin: 0 auto;
	padding-top: 50px;
}
</style>
</head>
<body>
	<form action="/podMeetingList" method="get" accept-charset="euc-kr">
		<label>검색어 : </label><input type="text" name="word" />
		<button>검색</button>
	</form>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>글작성일</th>
		</tr>
		
		
		<!-- (c:forEach : jstl문법,CDN ), {}는 el태그,   -->
		
		<c:choose>			
			<c:when test="${!empty podMeetingList }">				
				<c:forEach var="list" items="${podMeetingList}">	
					<tr>
						<td>${list.podMeetingNo}</td>
						<td><a href="#">${ list.podMeetingTitle }</a></td>
						<td>${ list.userNickname }</td>
						<td>${ list.podMeetingDate }</td>
					</tr>
				</c:forEach>
				
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4" > 데이타가 존재하지 않습니다.</td>				
				</tr>
			</c:otherwise>
		</c:choose>		
		
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/list?page=${ page-1 }">[이전]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[이전]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/list?page=${ page+1 }">[다음]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[다음]
		</c:if>
	</div>

</body>
</html>