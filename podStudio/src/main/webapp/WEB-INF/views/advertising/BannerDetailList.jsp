<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<form action="/noticeList" method="get" accept-charset="euc-kr">
	<label>검색어 : </label><input type="text" name="word" />
	<button>검색</button>
</form>
<table>
	<tr>
		<th>noticeNo</th>
		<th>userNickname</th>
		<th>noticeTitle</th>
		<th>noticeDate</th>
	</tr>
	<c:forEach var="list" items="${ noticeList }">
		<tr>
			<td>${ list.noticeNo }</td>
			<td>${ list.userNickname }</td>
			<td><a href="/noticeContent?noticeNo=${list.noticeNo}">${ list.noticeTitle }</a></td>
			<td>${ list.noticeDate }</td>
		</tr>
	</c:forEach>
</table>

<div>
	<c:if test="${ page > 1 }">
		<a href="/noticeList?page=${ page-1 }">[이전]</a>
	</c:if>
	<c:if test="${ page eq 1 }">
		[이전]
		</c:if>
	<c:if test="${ page < lastPage }">
		<a href="/noticeList?page=${ page+1 }">[다음]</a>
	</c:if>
	<c:if test="${ page > lastPage }">
		[다음]
		</c:if>
</div>
