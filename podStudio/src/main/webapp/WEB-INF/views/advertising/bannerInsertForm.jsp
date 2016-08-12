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
	<!-- <div>
		<label>배너번호 : </label>
		<label>
			<input type="text" name="bannerNo" />
		</label>
	</div> -->
	<div>
		<label>회원번호 : </label>
		<label>(SQL Session에 있는 값이 Hidden에 담겨 넘어간다)</label>
		<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	</div>
	<div>
		<label>팟캐스트번호 : </label>
		<input type="text" name="podcastNo" />
	</div>
	<div>
		<label>스튜디오번호 : </label>
		<input type="text" name="studioNo" />
	</div>
	<div>	
		<label>공연번호 : </label>
		<input type="text" name="showNo" />
	</div>
	<div>
		<label>단가번호 : </label>
		<input type="text" name="costNo" />
	</div>
	<div>	
		<label>결제번호 : </label>
		<input type="text" name="payNo" />
	</div>
	<div>	
		<label>배너광고상품명 : </label>
		<input type="text" name="bannerProduct" />
	</div>
	<div>
		<label>배너상품회사 : </label>
		<input type="text" name="bannerCompany" />
	</div>
	<div>
		<label>배너광고파일 : </label>
		<input type="text" name="bannerFileName" />
	</div>
	<div>	
		<label>배너광고클릭수 : </label>
		<input type="text" name="bannerCount" />
	</div>
	<div>	
		<label>배너광고서비스시작시간 : </label>
		<input type="date" name="bannerServiceStart" />
	</div>
	<div>	
		<label>배너광고서비스끝시간 : </label>
		<input type="date" name="bannerServiceEnd" />
	</div>
	<div>
		<label>배너광고등록상태 : </label>
		<input type="text" name="bannerStatus" />
		<label>	(정상서비스 / 서비스 진행중 / 서비스 완료)</label>
	</div>
	<button id="sendBanner">배너광고등록</button>
	<button id="back">등록취소</button>
</form>