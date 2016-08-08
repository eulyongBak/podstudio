<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div>스튜디오 이름:</div>
	<div>
		<input type="text" readonly="readonly"
			value="${studioOne.studioName}" />
	</div>

	<div>스튜디오 내용 :</div>
	<div>
		<textarea id="studioContent" rows="15" cols="50" name="studioContent"
			readonly="readonly">${studioOne.studioContent}</textarea>
	</div>

	<c:if test="${sessionUser.userLevel eq '관리자'}">
		<div>
			<a href="/modifyform?studioNo=${studioOne.studioNo }">수정</a>
			<a href="/studioDeleteForm?studioNo=${studioOne.studioNo }">삭제</a>
		</div>
	</c:if>