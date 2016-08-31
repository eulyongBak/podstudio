<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<h1>CM광고 리스트</h1>
	<div class="row">
		<div class="col-sm-1">팟캐스트 번호</div>
		<div class="col-sm-1">스튜디오 번호</div>
		<div class="col-sm-1">단가 번호</div>
		<div class="col-sm-1">결제 번호</div>
		<div class="col-sm-1">CM광고 제품명</div>
		<div class="col-sm-1">CM광고 업체명</div>
		<div class="col-sm-1">CM광고 내용</div>
		<div class="col-sm-1">CM광고 클릭수(비디오)</div>
		<div class="col-sm-1">CM광고등록시간</div>
		<div class="col-sm-1">서비스시작일</div>
		<div class="col-sm-1">서비스종료일</div>
		<div class="col-sm-1">상태</div>
	</div>
	<div class="row">
		<div class="col-sm-1">${podcastNo}</div>
		<div class="col-sm-1">${studioNo}</div>
		<div class="col-sm-1">${costNo}</div>
		<div class="col-sm-1">${payNo}</div>
		<div class="col-sm-1">${cmProduct}</div>
		<div class="col-sm-1">${cmCompany}</div>
		<div class="col-sm-1">${cmContent}</div>
		<div class="col-sm-1">${cmCount}</div>
		<div class="col-sm-1">${cmDate}</div>
		<div class="col-sm-1">${cmServiceStart}</div>
		<div class="col-sm-1">${cmServiceEnd}</div>
		<div class="col-sm-1">${cmStatus}</div>
	</div>

</body>
</html>