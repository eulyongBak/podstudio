<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
table, tr, th, td {
	border: 1px solid #000000;
	border-collapse: collapse;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/performanceList?areacode=1">서울</a></li>
	<li role="presentation"><a href="/performanceList?areacode=2">인천</a></li>
	<li role="presentation"><a href="/performanceList?areacode=3">대전</a></li>
	<li role="presentation"><a href="/performanceList?areacode=4">대구</a></li>
	<li role="presentation"><a href="/performanceList?areacode=5">광주</a></li>
	<li role="presentation"><a href="/performanceList?areacode=6">부산</a></li>
	<li role="presentation"><a href="/performanceList?areacode=7">울산</a></li>
	<li role="presentation"><a href="/performanceList?areacode=8">세종</a></li>
	<li role="presentation"><a href="/performanceList?areacode=31">경기</a></li>
	<li role="presentation"><a href="/performanceList?areacode=32">강원</a></li>
	<li role="presentation"><a href="/performanceList?areacode=33">충북</a></li>
	<li role="presentation"><a href="/performanceList?areacode=34">충남</a></li>
	<li role="presentation"><a href="/performanceList?areacode=35">경북</a></li>
	<li role="presentation"><a href="/performanceList?areacode=36">경남</a></li>
	<li role="presentation"><a href="/performanceList?areacode=37">전북</a></li>
	<li role="presentation"><a href="/performanceList?areacode=38">전남</a></li>
	<li role="presentation"><a href="/performanceList?areacode=39">제주</a></li>
</ul>

<table>
	<tr>
		<th>제목</th>
		<th>주소</th>
		<th>행사시작일</th>
		<th>행사종료일</th>
		<th>전화번호</th>
	</tr>
	<c:forEach var="p" items="${PerpomanceList }">
		<c:if test="${p.areacode eq areacode}">
			<tr>
				<td>${p.title }</td>
				<td>${p.addr1 }</td>
				<td>${p.eventstartdate }</td>
				<td>${p.eventenddate }</td>
				<td>${p.tel }</td>
			</tr>
		</c:if>
	</c:forEach>
</table>
<c:if test="${startPage > 1 }">
<a href="/performanceList?startPage=${startPage - 1 }">이전</a>
</c:if>
<c:if test="${ startPage < pageSize }">
<a href="/performanceList?startPage=${startPage + 1 }">다음</a>
</c:if>
</body>
</html>

