<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionUser.userLevel eq '관리자'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="#">관리자 메뉴</a></li>
	<li role="presentation"><a href="/questionList">문의 리스트</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
</ul>
</c:if>