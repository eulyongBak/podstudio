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
				<label class="col-sm-2 control-label">팟캐스트번호 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="podcastNo"/>
				</div>
			
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">스튜디오번호 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="studioNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">단가번호 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="costNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">결제번호 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="payNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM광고제품명 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmProduct"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM광고업체명 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmCompany"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM광고내용 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmContent"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">CM광고클릭수 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmCount"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">서비스시작일 : </label>
				<div class="col-sm-7">
					<input type="date" class="form-control"  name="cmServiceStart"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">서비스종료일 : </label>
				<div class="col-sm-7">
					<input type="date" class="form-control" name="cmServiceEnd"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">서비스상태 : </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="cmStatus"/>
					<label>정상서비스 / 서비스진행 / 서비스만료</label>
				</div>
			</div>
		</div>
		<button id="sendCM">CM광고등록</button>
		<button id="back">등록취소</button>
	</form>
</body>
</html>