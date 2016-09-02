<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
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
	<div>
		<label>ȸ����ȣ : </label>
		<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	</div>
	<div>
		<label>Main ī�װ� : </label>
		<label>�� �������ּ���(�ʼ�����)</label>
		<select name="categoryNo1">
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
	<div>
		<label>Sub ī�װ� : </label>
		<label>���� �з� �Һ��� �������ּ���. (���û���)</label>
		<select name="categoryNo2">
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
	<div>
		<label>��ĳ��Ʈ ���� : </label>
		<input type="text" name="podCastTitle" />
	</div>
	<div>
		<label>��ĳ��Ʈ ������</label>
		<input type="text" name="podCastSubTitle" />
	</div>
	<div>
		<label>������۰��ɿ��� : </label>
		<input type="radio" name="podCastPublicBroadCast" value="����" />����
		<input type="radio" name="podCastPublicBroadCast" value="�Ұ���" />�Ұ���
	</div>
	<div>
		<label>����÷�� : </label>
		<input type="file" />
	</div>
	<div>
		<button id="sendPodCast">��ĳ��Ʈ���</button>
		<button id="back">������</button>
	</div>
</form>