<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<body>
	
	<table>
	<tr>
		<th>studioNo</th>
		<th>studioName</th>
		<th>studioContent</th>
		<th>studioImage</th>
	</tr>
	
	<c:forEach var="list" items="${ studioList }">
		<tr>
			<td>${list.studioNo }</td>
			<td>${list.studioName }</td>
			<td>${list.studioContent }</td>
			<td><a href="/studioContent?studioNo=${list.studioNo }">${list.studioName}</a></td>
			<td>${list.studioImage }</td>
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
		<label>검색어:</label><input type="text" name="word"/>
		<button>검색</button>
	</form>
	
	<br/>
	
	<div>
	<button><a href="/insertStudio" >스튜디오추가</a></button>
	</div>
	
	
</body>
