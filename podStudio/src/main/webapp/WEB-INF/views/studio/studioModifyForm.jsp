<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<h1>스튜디오 정보 수정</h1>
		<form action="/studioModify" method ="post" accept-charset="utf-8">
			<input type="hidden" name="studioNo" value="${studioOne.studioNo }"/>
			<div class="form-horizontal">
				<div class="form-group">
					<label class="col-sm-2 control-label">스튜디오이름 :</label>
					<div class="col-sm-7">
						<input class="form-control" type="text" name="studioName" value="${studioOne.studioTitle}"/>
					</div>
				</div>
			</div>
		
			<div class="form-horizontal">
				<div class="form-group">
					<label class="col-sm-2 control-label">스튜디오내용 :</label>
					<div class="col-sm-7">
						<textarea id="studioContent" class="form-control" rows="10" cols="50" name="studioContent" >
						${studioOne.studioContent}</textarea>
					</div>
				</div>
			</div>		
			
			<div>
				<button>수정하기</button>
			</div>
		</form>	