<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css">


<ol class="breadcrumb">
	<li><a href="/home">Ȩ</a></li>
	<li><a href="#">�Ŀ�����</a></li>

	<c:if test="${empty sessionUser.userNo}">
		<li><a href="/home">�α���</a></li>
	</c:if>
	<c:if test="${!empty sessionUser.userNo }">
		<li><a href="/myPage">����������</a></li>
	</c:if>
	<li><a href="/noticeList">������</a></li>
</ol>