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
/* $(document).ready(function() {
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
}); */
</script>
<form id="episodeInsertForm">
	<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">���Ǽҵ� ��ȣ :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podcastNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">���Ǽҵ� ���� :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="episodeTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">���Ǽҵ� ���� :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="episodeContent" />
			</div>
		</div>
	</div>
	<div>
		<button id="sendPodCast">��ĳ��Ʈ���</button>
		<button id="back">������</button>
	</div>
</form>