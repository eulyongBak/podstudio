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
			<th>���� ��ȣ</th>
			<th>�г���</th>
			<th>���ǻ���</th>
			<th>��������</th>	
			<th>���ǽð�</th>
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
			<a href="/questionList=${ page-1 }">[����]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[����]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/questionList=${ page+1 }">[����]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[����]
		</c:if>
	</div>

</body>
</html>