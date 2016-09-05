<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
	$(document).ready(function() {
		$('#sendStudio').click(function() {
			$('#studioInsertForm').attr("action", "/insertStudio");
			$('#studioInsertForm').attr("method", "POST");
			$('#studioInsertForm').submit();
		});
	});
</script>



<form id="studioInsertForm">
	<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
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
			<label class="col-sm-2 control-label">지역 :</label>
			<div class="col-sm-7">
				<select class="form-control" name="categoryNo">
					<option value="category_22">서울</option>
					<option value="category_23">부산</option>
					<option value="category_24">대구</option>
					<option value="category_25">인천</option>
					<option value="category_26">광주</option>
					<option value="category_27">대전</option>
					<option value="category_28">울산</option>
					<option value="category_29">세종</option>
					<option value="category_30">경기</option>
					<option value="category_31">강원</option>
					<option value="category_32">충북</option>
					<option value="category_33">충남</option>
					<option value="category_34">전북</option>
					<option value="category_35">전남</option>
					<option value="category_36">경북</option>
					<option value="category_37">경남</option>
					<option value="category_38">제주</option>
				</select>
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
