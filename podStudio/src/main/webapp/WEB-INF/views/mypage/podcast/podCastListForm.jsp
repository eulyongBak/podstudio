<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</script>
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
		<c:if test="${sessionUser == null}">
			${sessionUser.userNickname}���� ��ĳ��Ʈ ����Ʈ
		</c:if>
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