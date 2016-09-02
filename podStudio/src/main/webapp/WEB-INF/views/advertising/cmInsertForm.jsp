<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script>
	$(document).ready(function() {
		$('#sendCM').click(function() {
			$('#cmInsertForm').attr("action", "/insertCM");
			$('#cmInsertForm').attr("method", "POST");
			$('#cmInsertForm').attr("accept-charset", "utf-8");
			$('#cmInsertForm').submit();
		});
	});
	</script>
</head>
<body>
	<form id="cmInsertForm">
		<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">��ĳ��Ʈ��ȣ : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="podcastNo"/>
				</div>
			
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">��Ʃ�����ȣ : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="studioNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">�ܰ���ȣ : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="costNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">������ȣ : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="payNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM������ǰ�� : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmProduct"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM�����ü�� : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmCompany"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM������ : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmContent"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM����Ŭ���� : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmCount"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">���񽺽����� : </label>
				<div class="col-sm-7">
					<input type="date" class="form-control"  name="cmServiceStart"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">���������� : </label>
				<div class="col-sm-7">
					<input type="date" class="form-control" name="cmServiceEnd"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">���񽺻��� : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmStatus"/>
					<label>���󼭺� / �������� / ���񽺸���</label>
				</div>
			</div>
		</div>
		<button id="sendCM">CM������</button>
		<button id="back">������</button>
	</form>
</body>
</html>