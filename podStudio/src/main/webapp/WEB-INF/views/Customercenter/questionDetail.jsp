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
	
	<div>�Խñ� ���� :</div>
	<div>
		<input type="text" readonly="readonly"
			value="${questionDetail.customercenterTitle}" />
	</div>

	<div>�Խñ� ���� :</div>
	<div>
		<textarea id="noticeContent" rows="15" cols="50" name="noticeContent"
			readonly="readonly">${questionDetail.customercenterContent}</textarea>
	</div>

</body>
</html>