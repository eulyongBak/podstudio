<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionUser.userLevel eq '������'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="#">������ �޴�</a></li>
	<li role="presentation"><a href="/questionList">���� ����Ʈ</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
</ul>
</c:if>