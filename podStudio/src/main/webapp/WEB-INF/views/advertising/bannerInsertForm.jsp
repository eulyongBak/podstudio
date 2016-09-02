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
			<label class="col-sm-2 control-label">��ĳ��Ʈ��ȣ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podcastNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��Ʃ�����ȣ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="studioNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">������ȣ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="showNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">�ܰ���ȣ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="costNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">������ȣ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="payNo" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ����ǰ�� : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerProduct" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʻ�ǰȸ�� : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerCompany" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ������� : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerFileName" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ���Ŭ���� : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerCount" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ����񽺽��۽ð� : </label>
			<div class="col-sm-7">
				<input type="date" class="form-control" name="bannerServiceStart" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ����񽺳��ð� : </label>
			<div class="col-sm-7">
				<input type="date" class="form-control" name="bannerServiceEnd" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ʱ����ϻ��� : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="bannerStatus" />
				<label>	(���󼭺� / ���� ������ / ���� �Ϸ�)</label>
			</div>
		</div>
	</div>
	<button id="sendBanner">��ʱ�����</button>
	<button id="back">������</button>
</form>