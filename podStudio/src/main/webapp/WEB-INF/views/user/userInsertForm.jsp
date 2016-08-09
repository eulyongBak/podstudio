<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form id="signUpForm">
<!-- 	<div> -->
<!-- 		<label>회원번호 : </label> <input type="text" name="userNo" /> -->
<!-- 	</div> -->
	<div>
		<label>지역 : </label>
		<!-- <input type="text" name="categoryNo" /> -->
		<select name="categoryNo">
			<option value="category_22">서울</option>
			<option value="category_23">부산</option>
			<option value="category_24">대구</option>
			<option value="category_25">인천</option>
			<option value="category_26">광주</option>
			<option value="category_27">대전</option>
			<option value="category_28">울산</option>
			<option value="category_29">세종</option>
			<option value="category_30">경기</option>
			<option value="category_31">강원</option>
			<option value="category_32">충북</option>
			<option value="category_33">충남</option>
			<option value="category_34">전북</option>
			<option value="category_35">전남</option>
			<option value="category_36">경북</option>
			<option value="category_37">경남</option>
			<option value="category_38">제주</option>
		</select>
	</div>
	<div>
		<label>아이디 : </label> <input type="text" name="userId" />
	</div>
	<div>
		<label>비밀번호</label> <input type="password" name="userPw" />
	</div>
	<div>
		<label>닉네임 : </label> <input type="text" name="userNickname" />
	</div>
	<div>
		<label>생일 : </label>
		<input id="dateText" type="date" name="userBirth" />
	</div>
	<div>
		<label>성별 : </label> 
		<input type="radio" name="userGender" value="남" />남
		<input type="radio" name="userGender" value="여" />여
	</div>
	<div>
		<label>이메일 : </label>
		<input id="userEmail" type="hidden" name="userEmail" /> 
		<input id="emailMain" type="text" />
		@
		<input id="emailSub" type="text" readonly="readonly"/>
		<select id="subEmail" >
			<option value=" ">선택하세요</option>
			<option value="naver.com">naver.com</option>
			<option value="daum.net">daum.net</option>
			<option value="google.com">google.com</option>
			<option value="">직접입력</option>
		</select>
	</div>
	<div>
		<label>통신사 : </label> <select name="userTelecom">
			<option value="LG">LG</option>
			<option value="KT">KT</option>
			<option value="SKT">SKT</option>
		</select>

	</div>
	<div>
		<label>전화번호 : </label> <input type="text" name="userPhone" />
	</div>
	<div>
		<label>권한: </label> <input type="text" name="userLevel" value="사용자"
			readonly="readonly" />
	</div>
	<div>
		<label>직업 : </label> <input type="text" name="userJob" />
	</div>
	<div>
		<button id="sendSignUp">회원가입</button>
		<button id="back">뒤로가기</button>
	</div>
</form>