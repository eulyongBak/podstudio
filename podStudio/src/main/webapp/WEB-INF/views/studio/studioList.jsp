<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<style>
table, tr, th, td {
	border: 1px solid #000000;
	border-collapse: collapse;
}
table tr #tableNo {
	width:10%;
}
table tr #tableName {
	width:35%;
}
table tr #tableContent {
	width:30%;
}
table tr #tableUser {
	width:25%;
}

</style>

<body>

	<table>
		<tr>
			<th>번호</th>
			<th>스튜디오명</th>
			<th>상세설명</th>
			<th>작성자</th>
		</tr>

		<c:forEach var="list" items="${ studioList }">
			<tr>
				<td id="tableNo">${fn:substring(list.studioNo,7,10) }</td>
				<td id="tableName"><a href="/studioContent?studioNo=${list.studioNo }">${list.studioName }</a></td>
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

	<form action="/studioList" method="get" accept-charset="UTF-8">
		<label>검색어:</label><input type="text" name="word" />
		<button>검색</button>
	</form>

	<br />

	<div>
		<button>
			<a href="/insertStudio">스튜디오추가</a>
		</button>
	</div>


</body>
