<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="list-group">
	<a href="/" class="list-group-item active">������</a>
</div>
<div class="list-group">
  <a href="#" class="list-group-item active">ȸ������</a>
  <a href="/userDetail" class="list-group-item">ȸ�� ��������</a>
  <a href="/modifyUser" class="list-group-item">ȸ�� ��������</a>
  <a href="/deleteUser" class="list-group-item">ȸ��Ż��</a>
  <a href="#" class="list-group-item">������ ���ѽ�û</a>
  <a href="#" class="list-group-item">������ ���ѽ�û</a>
  <a href="#" class="list-group-item">���������� ���ѽ�û</a>
</div>
<!-- ������ �޴� -->
<c:if test="${sessionUser.userLevel eq '������'}">
	<div class="list-group">
		<a href="#" class="list-group-item active">����������</a>
		<a href="/myPodCastInfo" class="list-group-item">�� ��ĳ��Ʈ ����</a>
		<a href="/insertPodCast" class="list-group-item">��ĳ��Ʈ �߰�</a>
		<a href="/podCastList?userNo=${sessionUser.userNo}" class="list-group-item">��ĳ��Ʈ ����Ʈ</a>
		<a href="/insertEpisode" class="list-group-item">���Ǽҵ� �߰�</a>
		<a href="/episodeList" class="list-group-item">���Ǽҵ� ����Ʈ</a>
	</div>
</c:if>