<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="podCastListFormAndAction">
	<table border="1">
		<thead>
			<tr>
				<td>��ĳ��Ʈ ��ȣ</td>
				<td>ī�װ� ��ȣ1</td>
				<td>ī�װ� ��ȣ2</td>
				<td>��ĳ��Ʈ ����</td>
				<td>��ĳ��Ʈ ������</td>
 				<td>������� ���ɿ���(���� / �Ұ���)</td> 
 				<td>��ĳ��Ʈ ��������</td> 
			</tr>
		</thead>
		<tbody>
		<c:if test="${sessionUser != null}">
			${sessionUser.userNickname}���� ��ĳ��Ʈ ����Ʈ
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