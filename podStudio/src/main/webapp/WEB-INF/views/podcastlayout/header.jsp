<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css">


<ol class="breadcrumb">
	<li><a href="/home">홈</a></li>
	<li><a href="#">후원센터</a></li>

	<c:if test="${empty sessionUser.userNo}">
		<li><a href="/home">로그인</a></li>
	</c:if>
	<c:if test="${!empty sessionUser.userNo }">
		<li><a href="/myPage">마이페이지</a></li>
	</c:if>
	<li><a href="/noticeList">고객센터</a></li>
</ol>