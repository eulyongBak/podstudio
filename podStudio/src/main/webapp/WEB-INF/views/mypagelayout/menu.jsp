<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="list-group">
	<a href="/" class="list-group-item active">집으로</a>
</div>
<div class="list-group">
  <a href="#" class="list-group-item active">회원정보</a>
  <a href="/userDetail" class="list-group-item">회원 정보보기</a>
  <a href="/modifyUser" class="list-group-item">회원 정보수정</a>
  <a href="/deleteUser" class="list-group-item">회원탈퇴</a>
  <a href="#" class="list-group-item">제작자 권한신청</a>
  <a href="#" class="list-group-item">광고주 권한신청</a>
  <a href="#" class="list-group-item">공연관계자 권한신청</a>
</div>
<!-- 제작자 메뉴 -->
<c:if test="${sessionUser.userLevel eq '제작자'}">
	<div class="list-group">
		<a href="#" class="list-group-item active">제작자정보</a>
		<a href="/myPodCastInfo" class="list-group-item">내 팟캐스트 정보</a>
		<a href="/insertPodCast" class="list-group-item">팟캐스트 추가</a>
		<a href="/podCastList?userNo=${sessionUser.userNo}" class="list-group-item">팟캐스트 리스트</a>
		<a href="/insertEpisode" class="list-group-item">에피소드 추가</a>
		<a href="/episodeList" class="list-group-item">에피소드 리스트</a>
	</div>
</c:if>