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
			<h3 id="h3Inline">${sessionUser.userNickname}</h3>���� ���Ǽҵ� ����Ʈ
		</c:if>
		<hr/><br/>
	</div>
	<table class="table table-hover">
		<tr>
				<th>���Ǽҵ� ��ȣ</th>
				<th>��ĳ��Ʈ ��ȣ</th>
				<th>���Ǽҵ� ����</th>
				<th>���Ǽҵ� ������</th>
				<th>÷������ �������</th>
				<th>÷������ ������</th>
 				<th>���Ǽҵ� �������</th> 
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