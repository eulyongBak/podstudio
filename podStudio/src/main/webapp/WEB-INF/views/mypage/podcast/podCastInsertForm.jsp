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
			<label class="col-sm-2 control-label">Main ī�װ� :</label>
			<label class="col-sm-4 control-label" class="textAligin">�� �������ּ��� (�ʼ�����)</label>
			<div class="col-sm-3">
				<select class="form-control" id="selectCategoryMain" name="categoryNo1">
					<option>�����ϼ���</option>
					<option value="category_1">������ġ����</option>
					<option value="category_2">�������</option>
					<option value="category_3">������</option>
					<option value="category_4">�ǰ�������</option>
					<option value="category_5">�ɸ�</option>
					<option value="category_6">����</option>
					<option value="category_7">����</option>
					<option value="category_8">��ȭ</option>
					<option value="category_9">����������</option>
					<option value="category_10">����</option>
					<option value="category_11">�ؿ�</option>
					<option value="category_12">��Ÿ</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">Sub ī�װ� : </label>
			<label class="col-sm-4 control-label" class="textAligin">�������ּ��� (���û���)</label>
			<div class="col-sm-3">
				<select class="form-control" id="selectCategorySub" name="categoryNo2">
					<option value="">�����ϼ���</option>
					<option value="category_1">������ġ����</option>
					<option value="category_2">�������</option>
					<option value="category_3">������</option>
					<option value="category_4">�ǰ�������</option>
					<option value="category_5">�ɸ�</option>
					<option value="category_6">����</option>
					<option value="category_7">����</option>
					<option value="category_8">��ȭ</option>
					<option value="category_9">����������</option>
					<option value="category_10">����</option>
					<option value="category_11">�ؿ�</option>
					<option value="category_12">��Ÿ</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ĳ��Ʈ ���� :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podCastTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">��ĳ��Ʈ ������ :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="podCastSubTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">������۰��ɿ��� :</label>
			<div class="col-sm-7">
				<input type="radio" name="podCastPublicBroadCast" value="����" /> ����&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="radio" name="podCastPublicBroadCast" value="�Ұ���" /> �Ұ���
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">����÷�� :</label>
			<div class="col-sm-7">
				<input type="file" />
			</div>
		</div>
	</div>
	<div>
		<button id="sendPodCast">��ĳ��Ʈ���</button>
		<button id="back">������</button>
	</div>
</form>