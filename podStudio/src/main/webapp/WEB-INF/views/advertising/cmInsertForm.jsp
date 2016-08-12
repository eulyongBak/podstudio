<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
		<div>
			<label>회원번호 : </label>
			<label>(SQL Session에 있는 값이 Hidden에 담겨 넘어간다)</label>
			<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
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
		<div>
			<label>서비스시작일 : </label>
			<input type="date" name="cmServiceStart"/>
		</div>
		<div>
			<label>서비스종료일 : </label>
			<input type="date" name="cmServiceEnd"/>
		</div>
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