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
	<h1>�� ����</h1>
		<form action="/noticeModify" method ="post" accept-charset="utf-8">
			<input type="hidden" name="noticeNo" value="${noticeOne.noticeNo }"/>
			<div>�Խñ� ���� :</div>
			<div><input type="text" name="noticeTitle" value="${noticeOne.noticeTitle}"/></div>
		
			<div>�Խñ� ���� :</div>
			
			<div>
			<textarea id="noticeContent" rows="15" cols="50"
					name="noticeContent" >${noticeOne.noticeContent}</textarea>
			</div>		
			
			<div><button>�����ϱ�</button></div>
		</form>	
</body>
</html>