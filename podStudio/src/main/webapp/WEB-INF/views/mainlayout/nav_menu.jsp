<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ����� �޴� -->
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/">Ȩ</a></li>
	<li role="presentation"><a href="/noticeList">��������</a></li>
	<li role="presentation"><a href="/podmain?podCastNo=podcast_001">��ĳ��Ʈ ����</a></li>
	<li role="presentation"><a href="/insertPodMeeting">���� ���</a></li>
	
</ul>

<!-- ������ �޴� -->
<c:if test="${sessionUser.userLevel eq '������'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/questionList">���� ����Ʈ</a></li>
	<li role="presentation"><a href="/noticeWrite">�����߰�</a></li>
	<!-- ������ ���������� �޴��� �� ���ϼ� �ְԲ� �߰� �� ���� -->
	<li role="presentation"><a href="/insertCM?userNo=${ sessionUser.userNo }">CM���� �߰�</a></li>
	<li role="presentation"><a href="/detailListCM?userNo=${ sessionUser.userNo }">��CM������Ʈ</a></li>
	<li role="presentation"><a href="/insertBanner?userNo=${ sessionUser.userNo }">��ʱ��� �߰�</a></li>
	<li role="presentation"><a href="/detailListBanner?userNo=${ sessionUser.userNo }">����ʱ�����Ʈ</a></li>
	<li role="presentation"><a href="/studioList">STUDIO</a></li>
</ul>
</c:if>

<!-- ������ �޴� -->
<c:if test="${sessionUser.userLevel eq '������'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/insertCM?userNo=${ sessionUser.userNo }">CM���� �߰�</a></li>
	<li role="presentation"><a href="/detailListCM?userNo=${ sessionUser.userNo }">��CM������Ʈ</a></li>
	<li role="presentation"><a href="/insertBanner?userNo=${ sessionUser.userNo }">��ʱ��� �߰�</a></li>
	<li role="presentation"><a href="/detailListBanner?userNo=${ sessionUser.userNo }">����ʱ�����Ʈ</a></li>
</ul>
</c:if>

<!-- ������ �޴� -->
<c:if test="${sessionUser.userLevel eq '������'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/studioList">STUDIO</a></li>
</ul>
</c:if>

