<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	#h3Inline	{
	  	display: inline
	}
</style>
<form id="podCastListFormAndAction">
	<div>
		<c:if test="${sessionUser != null}">
			<h3 id="h3Inline">${sessionUser.userNickname}</h3>���� ��ĳ��Ʈ ����Ʈ
		</c:if>
		<hr/><br/>
	</div>
	<table class="table table-hover">
		<tr>
				<th>��ĳ��Ʈ ��ȣ</th>
				<th>ī�װ� ��ȣ1</th>
				<th>ī�װ� ��ȣ2</th>
				<th>��ĳ��Ʈ ����</th>
				<th>��ĳ��Ʈ ������</th>
 				<th>������� ���ɿ���(���� / �Ұ���)</th> 
 				<th>��ĳ��Ʈ ��������</th> 
		</tr>
		<tbody>
		<c:forEach var="list" items="${podCastList}" >
			<tr>
				<td>${ list.podCastNo }</td>
 				<td>${ list.categoryNo1 }</td>
				<td>${ list.categoryNo2 }</td>
				<td>${ list.podCastTitle }</td>
				<td>${ list.podCastSubTitle }</td>
				<td>${ list.podCastPublicBroadCast }</td>
				<td>${ list.podCastDate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</form>