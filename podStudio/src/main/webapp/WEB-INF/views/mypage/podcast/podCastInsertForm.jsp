<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
	#selectCategoryMain, #selectCategorySub	{
		height: 35px;
    	width: 130px;
    	display: inline
	}
</style>
<script>
$(document).ready(function() {
	$('#back').click(function() {
		parent.history.back();
		return false;
	});
	
	$('#sendPodCast').click(function() {
		$('#podCastInsertForm').attr("action", "/insertPodCast");
		$('#podCastInsertForm').attr("method", "POST");
		$('#podCastInsertForm').attr("accept-charset", "utf-8");
		$('#podCastInsertForm').submit();
	});
});
</script>
<form id="podCastInsertForm">
	<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">Main 카테고리 :</label>
			<label class="col-sm-4 control-label" class="textAligin">꼭 선택해주세요 (필수사항)</label>
			<div class="col-sm-3">
				<select class="form-control" id="selectCategoryMain" name="categoryNo1">
					<option>선택하세요</option>
					<option value="category_1">뉴스정치경제</option>
					<option value="category_2">교육기술</option>
					<option value="category_3">스포츠</option>
					<option value="category_4">건강및의학</option>
					<option value="category_5">심리</option>
					<option value="category_6">음악</option>
					<option value="category_7">게임</option>
					<option value="category_8">영화</option>
					<option value="category_9">도서및출판</option>
					<option value="category_10">종교</option>
					<option value="category_11">해외</option>
					<option value="category_12">기타</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">Sub 카테고리 : </label>
			<label class="col-sm-4 control-label" class="textAligin">선택해주세요 (선택사항)</label>
			<div class="col-sm-3">
				<select class="form-control" id="selectCategorySub" name="categoryNo2">
					<option value="">선택하세요</option>
					<option value="category_1">뉴스정치경제</option>
					<option value="category_2">교육기술</option>
					<option value="category_3">스포츠</option>
					<option value="category_4">건강및의학</option>
					<option value="category_5">심리</option>
					<option value="category_6">음악</option>
					<option value="category_7">게임</option>
					<option value="category_8">영화</option>
					<option value="category_9">도서및출판</option>
					<option value="category_10">종교</option>
					<option value="category_11">해외</option>
					<option value="category_12">기타</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">팟캐스트 제목 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podCastTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">팟캐스트 부제목 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podCastSubTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">공개방송가능여부 :</label>
			<div class="col-sm-7">
				<input type="radio" name="podCastPublicBroadCast" value="가능" /> 가능&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="radio" name="podCastPublicBroadCast" value="불가능" /> 불가능
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">파일첨부 :</label>
			<div class="col-sm-7">
				<input type="file" />
			</div>
		</div>
	</div>
	<div>
		<button id="sendPodCast">팟캐스트등록</button>
		<button id="back">등록취소</button>
	</div>
</form>