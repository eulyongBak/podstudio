<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기폼</h1>
	<form action="/insertText" method="post" accept-charset="UTF-8">
		<table>
			<tr>
				<td>제목:<input type="text" name="title" /></td>
			</tr>
			<tr>
				<td><textarea rows="40" cols="100" name="content"></textarea></td>
			</tr>
			<tr>
				<td>글쓴이<input type="text" name="writer" /> 비밀번호: <input
					type="password" name="pw" />
				</td>
			</tr>
		</table>

		<div>
			<input type="submit" value="등록" />
		</div>
	</form>
</body>
</html>