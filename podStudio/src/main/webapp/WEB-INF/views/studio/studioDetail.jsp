<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">스튜디오 이름:</label>
			<div class="col-sm-7">
				<input class="form-control" type="text" readonly="readonly" value="${studioOne.studioName}" />
			</div>
		</div>
	</div>

	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">스튜디오 내용 :</label>
	<div class="col-sm-7">
				<textarea id="studioContent" rows="10" cols="50" class="form-control" name="studioContent"
				readonly="readonly">${studioOne.studioContent}</textarea>
			</div>
		</div>
	</div>

	<c:if test="${sessionUser.userLevel eq '관리자'}">
		<div>
			<a href="/studioModify?studioNo=${studioOne.studioNo }">수정</a>
			<a href="/studioDeleteForm?studioNo=${studioOne.studioNo }">삭제</a>
		</div>
	</c:if>