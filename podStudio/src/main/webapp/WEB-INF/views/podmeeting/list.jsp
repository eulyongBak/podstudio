<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>List title here</title>
</head>
<body>
	<h1>단팟 게시판</h1>
	<table>
		<tr>
			<th>제목</th>	<th>글쓴이</th><th>등록시간</th>	
		</tr>
		
		<%-- <c:forEach var="text" items="${list}">
			<tr>
				<td><a href="/text?title=${text.title}">${text.title}</a></td>
				<td>${text.writer}</td>
				<td>${text.writeTime}</td>
			</tr>
		</c:forEach>
	</table>r
	<div>
		<c:if test="${textPage>1}">
			<a href="/list?textPage=${textPage-1}">이전</a>
		</c:if>
		
		<c:if test="${textPage<lastTextPage}">
			<a href="/list?textPage=${textPage+1}">다음</a>
		</c:if>
			
	</div>
	<div>
		<form action="/textInsert">
			<input type="submit" value="글쓰기">
		</form>
	</div> --%>
	<div>
		<input type="submit" value="제목+내용">
		<input type="text">
		<input type="submit" value="검색">
	</div>
</body>
</html>