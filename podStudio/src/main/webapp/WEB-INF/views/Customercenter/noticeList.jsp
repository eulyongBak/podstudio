<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<form action="/noticeList" method="get" accept-charset="euc-kr">
		<label>�˻��� : </label><input type="text" name="word" />
		<button>�˻�</button>
	</form>
	<table  class="table table-hover">
		<tr >
			<th style="text-align: center;">��ȣ</th>
			<th style="text-align: center;">�г���</th>
			<th style="text-align: center;">����</th>
			<th style="text-align: center;">�ۼ�����</th>
		</tr>
		<c:forEach var="list" items="${ noticeList }">
			<tr>
				<td style="text-align: center;">${ fn:substring(list.noticeNo,7,11) }</td>
				<td>${ list.userNickname }</td>
				<td><a href="/noticeContent?noticeNo=${list.noticeNo}">${ list.noticeTitle }</a></td>
				<td style="text-align: center;">${ list.noticeDate }</td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/noticeList?page=${ page-1 }">[����]</a>
		</c:if>
		<c:if test="${ page eq 1 }">
		[����]
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/noticeList?page=${ page+1 }">[����]</a>
		</c:if>
		<c:if test="${ page > lastPage }">
		[����]
		</c:if>
	</div>

