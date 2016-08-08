<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Title</title>
</head>
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
	
	<table>
		<tr>
			<th>문의 번호</th>
			<th>닉네임</th>
			<th>문의사항</th>
			<th>문의제목</th>	
			<th>문의시간</th>
		</tr>
		<c:forEach var="list" items="${ questionList }">
			<tr>
				<td>${ list.customercenterNo }</td>
				<td>${ list.userNickname }</td>
				<td>${ list.categorySub }</td>
				<td><a href="/customercenterContent?noticeNo=${list.customercenterNo}">${ list.customercenterTitle }</a></td>
				<td>${ list.customercenterDate}</td>

				<td></td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/questionList=${ page-1 }">[이전]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[이전]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/questionList=${ page+1 }">[다음]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[다음]
		</c:if>
	</div>

</body>
</html>