<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>��ĳ��Ʈ ����������</h1>
<br/>
<div>
	<label>��ĳ��Ʈ ���ƿ� ����</label>
	<table border="1">
		<thead>
			<tr>
				<td>��ĳ��Ʈ ��ȣ</td>
				<td>����</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${goodRankingList}">
				<tr>
					<td>${ list.podCastNo }</td>
					<td>${ list.goodRank }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</div>
<br/>
<br/>
<div>
	<label>��ĳ��Ʈ û��� ����</label>
	<table border="1">
		<thead>
			<tr>
				<td>��ĳ��Ʈ ��ȣ</td>
				<td>����</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${listenRankingList}">
				<tr>
					<td>${ list.podCastNo }</td>
					<td>${ list.listenRank }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
