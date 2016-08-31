<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<form action="/studioList" method="get" accept-charset="UTF-8">
	<label>검색어:</label><input type="text" name="word" />
	<button>검색</button>
</form>
<table class="table table-hover">
	<tr>
		<th style="text-align: center;">번호</th>
		<th style="text-align: center;">스튜디오명</th>
		<th style="text-align: center;">상세설명</th>
		<th style="text-align: center;">작성자</th>
	</tr>

	<c:forEach var="list" items="${ studioList }">
		<tr>
			<td id="tableNo">${fn:substring(list.studioNo,7,10) }</td>
			<td id="tableName"><a
				href="/studioContent?studioNo=${list.studioNo }">${list.studioName }</a></td>
			<td id="tableContent">${fn:substring(list.studioContent,0,5)}</td>
			<td id="tableUser">${list.userNickname }</td>
		</tr>
	</c:forEach>
</table>

<div>

	<c:if test="${ page > 1 }">
		<a href="/studioList?page=${ page-1 }">[이전]</a>
	</c:if>
	<c:if test="${ page eq 1 }">
		[이전]
		</c:if>
	<c:if test="${ page < lastPage }">
		<a href="/studioList?page=${ page+1 }">[다음]</a>
	</c:if>
	<c:if test="${ page > lastPage }">
		[다음]
		</c:if>
</div>


<br />

<div>
	<button>
		<a href="/insertStudio">스튜디오추가</a>
	</button>
</div>

