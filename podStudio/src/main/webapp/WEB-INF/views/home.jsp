<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>팟캐스트 메인페이지</h1>
<br/>
<div>
	<label>팟캐스트 좋아요 순위</label>
	<table border="1">
		<thead>
			<tr>
				<td>팟캐스트 번호</td>
				<td>순위</td>
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
	<label>팟캐스트 청취수 순위</label>
	<table border="1">
		<thead>
			<tr>
				<td>팟캐스트 번호</td>
				<td>순위</td>
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
