<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form id="studioForm">
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">스튜디오이름 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="studioName"/>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">스튜디오내용 : </label>
			<div class="col-sm-7">
				<textarea rows="10" cols="50" class="form-control" name="studioContent"></textarea>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">이미지 : </label>
			<div class="col-sm-7">
				<input type="file"/>
			</div>
		</div>
	</div>
	<div>
		<button id="sendStudio">스튜디오등록</button>
		<button id="back">뒤로가기</button>
	</div>
</form>
