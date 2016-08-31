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
<h1>��ĳ��Ʈ ����������</h1>
<div class="container">
	<div class="row">
		<div class="col-md-6">
			<table class="table table-hover">
				<thead>
					<tr>
						<th colspan="2"><label>��ĳ��Ʈ ���ƿ� ����</label></th>
					</tr>
					<tr>
						<th>��ĳ��Ʈ ��ȣ</th>
						<th>����</th>
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
						<th colspan="2"><label>��ĳ��Ʈ û��� ����</label></th>
					</tr>
					<tr>
						<th>��ĳ��Ʈ ��ȣ</th>
						<th>����</th>
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
