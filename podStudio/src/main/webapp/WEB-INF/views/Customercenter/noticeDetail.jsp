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
	
			<div>�Խñ� ���� :</div>
			<div>${noticeOne.noticeTitle}</div>
		
			<div>�Խñ� ���� :</div>
			<div>
			<textarea id="noticeContent" rows="15" cols="50"
					name="noticeContent" readonly="readonly">${noticeOne.noticeContent}</textarea>
			</div>
			
			<div>
			<a href="/modifyform?noticeNo=${noticeOne.noticeNo }">����</a> <a href="">����</a>
			</div>
			
</body>
</html>