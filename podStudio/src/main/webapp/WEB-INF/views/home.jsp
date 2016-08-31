<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
.container .row .col-md-6 .table tr th{
	text-align: center;
}
.container .row .col-md-6 .table tr .title {
	text-align: left;
}
.container .row .col-md-6 .table tr .rank {
	text-align: center;
}
</style>
<h1>팟캐스트 메인페이지</h1>
<div class="container">
	<div class="row">
		<div class="col-md-6">
			<table class="table table-hover">
				<thead>
					<tr>
						<th colspan="2"><label>팟캐스트 좋아요 순위</label></th>
					</tr>
					<tr>
						<th>팟캐스트 번호</th>
						<th>순위</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${goodRankingList}">
						<tr>
							<td class="title">${ list.podCastTitle }</td>
							<td class="rank">${ list.goodRank }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<div class="col-md-6">
			<table class="table table-hover">
				<thead>
					<tr>
						<th colspan="2"><label>팟캐스트 청취수 순위</label></th>
					</tr>
					<tr>
						<th>팟캐스트 번호</th>
						<th>순위</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${listenRankingList}">
						<tr>
							<td class="title">${ list.podCastTitle }</td>
							<td class="rank">${ list.listenRank }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
