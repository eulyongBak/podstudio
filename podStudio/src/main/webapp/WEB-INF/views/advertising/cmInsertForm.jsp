<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>dd</title>
	<script>
	$(document).ready(function() {
		$('#sendCM').click(function() {
			$('#sendCM').attr("action", "/insertCM");
			$('#sendCM').attr("method", "POST");
			$('#sendCM').attr("accept-charset", "utf-8");
			$('#sendCM').submit();
		});
	});
	</script>
</head>
<body>
	<form id="cmInsertForm">
		<div>
			<label>CM�����ȣ : </label>
			<input type="text" name="cmNo"/>
		</div>
		<div>
			<label>��ĳ��Ʈ��ȣ : </label>
			<input type="text" name="podcastNo"/>
		</div>
		<div>
			<label>��Ʃ�����ȣ : </label>
			<input type="text" name="studioNo"/>
		</div>
		
		<div>
			<label>�ܰ���ȣ : </label>
			<input type="text" name="costNo"/>
		</div>
		<div>
			<label>������ȣ : </label>
			<input type="text" name="payNo"/>
		</div>
		<div>
			<label>CM������ǰ�� : </label>
			<input type="text" name="cmProduct"/>
		</div>
		<div>
			<label>CM�����ü�� : </label>
			<input type="text" name="cmCompany"/>
		</div>
		<div>
			<label>CM������ : </label>
			<input type="text" name="cmContent"/>
		</div>
		<div>
			<label>CM����Ŭ���� : </label>
			<input type="text" name="cmCount"/>
		</div>
		<!-- <div>
			<label>���񽺽����� : </label>
			<input type="text" name="cmServiceStart"/>
		</div>
		<div>
			<label>���������� : </label>
			<input type="text" name="cmServiceEnd"/>
		</div> -->
		<div>
			<label>���񽺻��� : </label>
			<input type="text" name="cmStatus"/>
			<label>���󼭺� / �������� / ���񽺸���</label>
		</div>
		<button id="sendCM">CM������</button>
		<button id="back">������</button>
	</form>
</body>
</html>