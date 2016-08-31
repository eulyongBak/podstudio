<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<table class="table table-hover">
		<tr>
			<th>문의 번호</th>
			<th>닉네임</th>
			<th>문의사항</th>
			<th>문의제목</th>	
			<th>문의시간</th>
		</tr>
		<c:forEach var="list" items="${ questionList }">
			<tr>
				<td>${ fn:substring(list.customercenterNo,15,18) }</td>
				<td>${ list.userNickname }</td>
				<td>${ list.categorySub }</td>
				<td><a href="/questionDetail?customercenterNo=${list.customercenterNo}">${ list.customercenterTitle }</a></td>
				<td>${ list.customercenterDate}</td>

				<td></td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:if test="${ page > 1 }">
			<a href="/questionList=${ page-1 }">[이전]</a>
		</c:if>
		<c:if test="${ page < lastPage }">
			<a href="/questionList=${ page+1 }">[다음]</a>
		</c:if>
	</div>

</body>
</html>