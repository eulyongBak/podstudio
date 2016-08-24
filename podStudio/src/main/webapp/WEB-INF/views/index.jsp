<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>팀프로젝트 소개 페이지</title>
<style>
h1 {
	color: #0000ff
}

#h3Inline {
	display: inline
}

#boldLabel {
	font-weight: bold
}
</style>
</head>
<body>

	<div>
		<br /> <br />
		<h1>
			<a href="/home">팀프로젝트로 이동</a>
		</h1>
	</div>
	<div>
		<h1>교육기관 소개</h1>
	</div>
	<div>
		<h3 id="h3Inline">- 교육기관 명 :</h3>
		<label>한국스마트정보교육원</label> <label id="boldLabel"> ( <a
			href="http://www.ksmart.or.kr/">www.ksmart.or.kr</a> )
		</label>
	</div>
	<div>
		<h3 id="h3Inline">- 주소 :</h3>
		<label>전북 전주시 덕진구 기린대로 446(금암동 708-16) 2층 한국스마트정보교육원</label>
	</div>
	<div>
		<h3 id="h3Inline">- 연락처 :</h3>
		<label>TEL 063-717-1008 / FAX 063-717-1122</label>
	</div>
	<div>
		<h3 id="h3Inline">- 대표 / 이메일 :</h3>
		<label>이형열 / hyoung814@daum.net</label>
	</div>
	<br />
	<div>
		<h1>팀프로젝트 소개</h1>
	</div>
	<div>
		<h3 id="h3Inline">- 제목 :</h3>
		<label>공연 정보와 지역사회 발전에 도움을 줄 수 있는 팟캐스트 (프로젝트 부제목명 : 팟스튜디오)</label>
	</div>

	<div>
		<h3 id="h3Inline">- 참여인원 :</h3>
		<label>5명 / 박을용(팀장), 김지아, 이은우, 이건주, 고남혁(팀원)</label>
	</div>
	<div>
		<h3 id="h3Inline">- 목적 :</h3>
		<ul>
			<li>기존 시스템이 제작방법, 제작비용 등 어려운 점이 많음</li>
			<li>이원적으로 분리되어 있는 팟캐스트, 팟호스팅 사이트를 하나로 통합</li>
			<li>제작자에게는 만들기 쉬운 환경과 정보를 제공함</li>
			<li>기존 팟캐스트 사이트의 불편한 점들을 사용자 입장에서 정보 수집</li>
			<li>정치나 경제와 같은 중대사부터 지역사회의 소리를 싣는 공간으로 활용</li>
			<li>온-오프라인을 연결을 통해 지역 커뮤니티의 부재 해소</li>
			<li>지역 스튜디오와 연결하여 소규모 팟캐스트 제작자들에게 편의 제공</li>
			<li>정치, 경제등 콘텐츠에만 치우쳐져 있는 기존 팟캐스트를 다양한 분야의 체험함</li>
			<li>팟캐스트 한곳에만 집중되어있는 수익 구조를 분산시켜 지역사회 발전에 이바지</li>
			<li>사용자들에게는 사용하기 쉽고 여러 사람들과 소통하기 원할한 시스템을 개발</li>
			<li>공연정보와 연결하여 사용자들의 문화 생활 증진</li>
		</ul>
	</div>
	<div>
		<h3 id="h3Inline">- 주요기능 :</h3>
		<ul>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<div>
		<h3 id="h3Inline">- 개발환경 :</h3>
		<ul>
			<li>Spring Tool Suite (Developer Tool)</li>
			<li>MySQL(DB)</li>
			<li>Apache-Tomcat(WAS)</li>
			<li>Java(SSL)</li>
			<li>Javascript, HTML5, CSS(SSL)</li>
			<li>jQuery, Bootstrap(Framework)</li>
		</ul>
	</div>
	<div>
		<h3 id="h3Inline">- 분석설계문서 :</h3>
		<label>프로젝트 최종 보고서, </label>
	</div>
	<div>
		<h3>
			<label>- ERD : </label>
		</h3>
		<img src="<c:url value='/resources/imgs/erd.png'/>" />
		<!-- <img alt="" src="resources/imgs/erd.png"/> -->
	</div>
	<div>
		<h3>- FlowChart :</h3>
		<%-- <img src="<c:url value='/resources/imgs/erd.png'/>"/> --%>
		<!-- <img alt="" src="resources/imgs/erd.png"/> -->
	</div>

</body>
</html>