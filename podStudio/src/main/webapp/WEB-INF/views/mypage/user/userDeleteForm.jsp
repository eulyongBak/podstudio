<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Title</title>
</head>
<body>
	<div>
		<form action="/deleteUser" method ="post" accept-charset="utf-8">
			<input type="hidden" name="userNo" value="${sessionUser.userNo }"/>
			<div><button>삭제</button></div>
		</form>	
	</div>
	<div>	
		<form action="/myPage" method="get" accept-charset="utf-8">
		<button>취소</button>
		</form>
	</div>
</body>
</html>