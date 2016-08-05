<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
Home Page

<a href="/signUp">회원가입</a>
<br />
<%-- <a href="/detail?userNo=${userNo}">회원정보</a><br/> --%>
<a href="/detail">회원정보</a>
<br />

<a href="/insertCM">CM광고 추가</a>

<a href="/insertStudio">STUDIO 추가</a>

<a href="/noticeList">공지사항</a>
<c:if test="${sessionUser.userLevel eq '관리자'}">
<a href="/noticeWrite">공지추가</a>
</c:if>
<br />
<a href="/podmain?podCastNo=podcast_001">팟캐스트 보기</a>
