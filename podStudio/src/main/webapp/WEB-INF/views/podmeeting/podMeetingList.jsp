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
		<label>�˻��� : </label><input type="text" name="word" />
		<button>�˻�</button>
	</form>
	<table>
		<tr>
			<th>�۹�ȣ</th>
			<th>����</th>
			<th>�۾���</th>
			<th>���ۼ���</th>
		</tr>
		
		
		<!-- (c:forEach : jstl����,CDN ), {}�� el�±�,   -->
		
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
					<td colspan="4" > ����Ÿ�� �������� �ʽ��ϴ�.</td>				
				</tr>
			</c:otherwise>
		</c:choose>		
		
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/list?page=${ page-1 }">[����]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[����]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/list?page=${ page+1 }">[����]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[����]
		</c:if>
	</div>

</body>
</html>