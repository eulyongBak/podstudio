<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<h1>상세 보기</h1>
		<form action="/studioModify" method ="post" accept-charset="utf-8">
			<input type="hidden" name="studioNo" value="${studioOne.studioNo }"/>
			<div>스튜디오이름 :</div>
			<div><input type="text" name="studioName" value="${studioOne.studioTitle}"/></div>
		
			<div>스튜디오내용 :</div>
			
			<div>
			<textarea id="studioContent" rows="15" cols="50"
					name="studioContent" >${studioOne.studioContent}</textarea>
			</div>		
			
			<div><button>수정하기</button></div>
		</form>	