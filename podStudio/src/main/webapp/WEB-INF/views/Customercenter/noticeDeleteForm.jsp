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

		<form action="/noticeDelete" method ="post" accept-charset="utf-8">
			<input type="hidden" name="noticeNo" value="${noticeOne.noticeNo }"/>
			<div><button>����</button></div>
		</form>	
		
		<form action="/noticeList" method="get" accept-charset="utf-8">
		<button>���</button>
		</form>
</body>
</html>