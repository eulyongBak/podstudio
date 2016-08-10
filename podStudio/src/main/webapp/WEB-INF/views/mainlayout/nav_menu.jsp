<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 사용자 메뉴 -->
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/">홈</a></li>
	<li role="presentation"><a href="/signUp">회원가입</a></li>
	<li role="presentation"><a href="/insertCM">CM광고 추가</a></li>
	<li role="presentation"><a href="/detailListCM?userNo=${ sessionUser.userNo }">내CM광고리스트</a></li>
	<li role="presentation"><a href="/StudioList">STUDIO</a></li>
	<li role="presentation"><a href="/noticeList">공지사항</a></li>
	<li role="presentation"><a href="/podmain?podCastNo=podcast_001">팟캐스트 보기</a></li>
	<li role="presentation"><a href="/addQuestionForm">문의하기</a></li>
	<li role="presentation"><a href="/introduce">프로젝트 소개</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	
</ul>

<!-- 관리자 메뉴 -->
<c:if test="${sessionUser.userLevel eq '관리자'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="#">관리자 메뉴</a></li>
	<li role="presentation"><a href="/questionList">문의 리스트</a></li>
	<li role="presentation"><a href="/noticeWrite">공지추가</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
</ul>
</c:if>
