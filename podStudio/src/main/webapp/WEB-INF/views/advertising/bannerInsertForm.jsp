<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<script>
	$(document).ready(function() {
		$('#sendBanner').click(function() {
			$('#bannerInsertForm').attr("action", "/insertBanner");
			$('#bannerInsertForm').attr("method", "POST");
			$('#bannerInsertForm').attr("accept-charset", "utf-8");
			$('#bannerInsertForm').submit();
		});
	});
</script>

<form id="bannerInsertForm">
	<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">팟캐스트번호 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podcastNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">스튜디오번호 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="studioNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">공연번호 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="showNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">단가번호 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="costNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">결제번호 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="payNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고상품명 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerProduct" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너상품회사 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerCompany" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고파일 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerFileName" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고클릭수 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerCount" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고서비스시작시간 : </label>
			<div class="col-sm-7">
				<input type="date" class="form-control" name="bannerServiceStart" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고서비스끝시간 : </label>
			<div class="col-sm-7">
				<input type="date" class="form-control" name="bannerServiceEnd" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">배너광고등록상태 : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerStatus" />
				<label>	(정상서비스 / 서비스 진행중 / 서비스 완료)</label>
			</div>
		</div>
	</div>
	<button id="sendBanner">배너광고등록</button>
	<button id="back">등록취소</button>
</form>