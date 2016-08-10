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
			<label>CM광고번호 : </label>
			<input type="text" name="cmNo"/>
		</div>
		<div>
			<label>팟캐스트번호 : </label>
			<input type="text" name="podcastNo"/>
		</div>
		<div>
			<label>스튜디오번호 : </label>
			<input type="text" name="studioNo"/>
		</div>
		
		<div>
			<label>단가번호 : </label>
			<input type="text" name="costNo"/>
		</div>
		<div>
			<label>결제번호 : </label>
			<input type="text" name="payNo"/>
		</div>
		<div>
			<label>CM광고제품명 : </label>
			<input type="text" name="cmProduct"/>
		</div>
		<div>
			<label>CM광고업체명 : </label>
			<input type="text" name="cmCompany"/>
		</div>
		<div>
			<label>CM광고내용 : </label>
			<input type="text" name="cmContent"/>
		</div>
		<div>
			<label>CM광고클릭수 : </label>
			<input type="text" name="cmCount"/>
		</div>
		<!-- <div>
			<label>서비스시작일 : </label>
			<input type="text" name="cmServiceStart"/>
		</div>
		<div>
			<label>서비스종료일 : </label>
			<input type="text" name="cmServiceEnd"/>
		</div> -->
		<div>
			<label>서비스상태 : </label>
			<input type="text" name="cmStatus"/>
			<label>정상서비스 / 서비스진행 / 서비스만료</label>
		</div>
		<button id="sendCM">CM광고등록</button>
		<button id="back">등록취소</button>
	</form>
</body>
</html>