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
	<h1>���� �Խ���</h1>
	<table>
		<tr>
			<th>����</th>	<th>�۾���</th><th>��Ͻð�</th>	
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
			<a href="/list?textPage=${textPage-1}">����</a>
		</c:if>
		
		<c:if test="${textPage<lastTextPage}">
			<a href="/list?textPage=${textPage+1}">����</a>
		</c:if>
			
	</div>
	<div>
		<form action="/textInsert">
			<input type="submit" value="�۾���">
		</form>
	</div> --%>
	<div>
		<input type="submit" value="����+����">
		<input type="text">
		<input type="submit" value="�˻�">
	</div>
</body>
</html>