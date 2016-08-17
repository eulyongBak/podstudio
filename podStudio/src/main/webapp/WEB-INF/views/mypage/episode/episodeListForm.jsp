<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="podCastListFormAndAction">
	<table border="1">
		<thead>
			<tr>
				<td>���Ǽҵ� ��ȣ</td>
				<td>��ĳ��Ʈ ��ȣ</td>
				<td>���ƿ���� ��ȣ</td>
				<td>û������� ��ȣ</td>
				<td>���Ǽҵ� ����</td>
				<td>���Ǽҵ� ������</td>
				<td>÷������ �������</td>
				<td>÷������ ������</td>
 				<td>���Ǽҵ� �������</td> 
			</tr>
		</thead>
		<tbody>
		<c:if test="${sessionUser != null}">
			${sessionUser.userNickname}���� ���Ǽҵ� ����Ʈ
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