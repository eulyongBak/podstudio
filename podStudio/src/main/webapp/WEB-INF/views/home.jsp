<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
Home Page

<a href="/signUp">ȸ������</a>
<br />
<%-- <a href="/detail?userNo=${userNo}">ȸ������</a><br/> --%>
<a href="/detail">ȸ������</a>
<br />

<a href="/insertCM">CM���� �߰�</a>

<a href="/insertStudio">STUDIO �߰�</a>

<a href="/noticeList">��������</a>
<c:if test="${sessionUser.userLevel eq '������'}">
<a href="/noticeWrite">�����߰�</a>
</c:if>
<br />
<a href="/podmain?podCastNo=podcast_001">��ĳ��Ʈ ����</a>
