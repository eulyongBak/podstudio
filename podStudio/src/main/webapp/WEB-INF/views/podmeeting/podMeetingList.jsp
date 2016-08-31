<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form action="/podMeetingList" method="get" accept-charset="euc-kr">
	<label>�˻��� : </label><input type="text" name="word" />
	<button>�˻�</button>
</form>
<table class="table table-hover">
	<tr>
		<th>�۹�ȣ</th>
		<th>����</th>
		<th>�۾���</th>
		<th>���ۼ���</th>
	</tr>

	<c:choose>
		<c:when test="${!empty podMeetingList }">
			<c:forEach var="list" items="${podMeetingList}">
				<tr>
					<td>${fn:substring(list.podMeetingNo,11,14)}</td>
					<td><a href="#">${ list.podMeetingTitle }</a></td>
					<td>${ list.userNickname }</td>
					<td>${ list.podMeetingDate }</td>
				</tr>
			</c:forEach>

		</c:when>
		<c:otherwise>
			<tr>
				<td colspan="4">����Ÿ�� �������� �ʽ��ϴ�.</td>
			</tr>
		</c:otherwise>
	</c:choose>

</table>

<div>
	<c:if test="${ page > 1 }">
		<a href="/podMeetingList?page=${ page-1 }">[����]</a>
	</c:if>
	<c:if test="${ page < lastPage }">
		<a href="/podMeetingList?page=${ page+1 }">[����]</a>
	</c:if>
</div>
