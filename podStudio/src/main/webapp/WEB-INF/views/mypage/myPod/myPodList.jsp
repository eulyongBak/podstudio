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

</style>
</head>
<body>
	<table>
		<tr>
			<th>�о�</th>
			<th>��ĳ��Ʈ ����</th>
			<th>���Ǽҵ� ����</th>
		</tr>
		<c:forEach var="list" items="${ myPodList }">
			<tr>
				<td>${ list.categoryMain }</td>
				<td>${ list.podCastTitle }</td>
				<!-- ��ĳ��Ʈ���� ���Ǽҵ尡 �Ǹ�-->
				<td><a href="/episodeTitle?episodeNo=${list.episodeNo}">${ list.episodeTitle }</a></td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/myPodcast?page=${ page-1 }">[����]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[����]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/myPodcast?page=${ page+1 }">[����]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[����]
		</c:if>
	</div>

</body>
</html>