<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- ����� �޴� -->
<ul class="nav nav-tabs">
	<li role="presentation"><a href="/">Ȩ</a></li>
	<li role="presentation"><a href="/signUp">ȸ������</a></li>
	<li role="presentation"><a href="/insertCM">CM���� �߰�</a></li>
	<li role="presentation"><a href="/detailListCM?userNo=${ sessionUser.userNo }">��CM������Ʈ</a></li>
	<li role="presentation"><a href="/StudioList">STUDIO</a></li>
	<li role="presentation"><a href="/noticeList">��������</a></li>
	<li role="presentation"><a href="/podmain?podCastNo=podcast_001">��ĳ��Ʈ ����</a></li>
	<li role="presentation"><a href="/addQuestionForm">�����ϱ�</a></li>
	<li role="presentation"><a href="/introduce">������Ʈ �Ұ�</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	
</ul>

<!-- ������ �޴� -->
<c:if test="${sessionUser.userLevel eq '������'}">
<ul class="nav nav-tabs">
	<li role="presentation"><a href="#">������ �޴�</a></li>
	<li role="presentation"><a href="/questionList">���� ����Ʈ</a></li>
	<li role="presentation"><a href="/noticeWrite">�����߰�</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
	<li role="presentation"><a href="#">Messages</a></li>
</ul>
</c:if>
