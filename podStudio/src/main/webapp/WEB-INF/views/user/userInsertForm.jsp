<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
	#emailMain, #emailSub {
	    height: 35px;
	    width: 130px;
	    display: inline
	}
	
	#selectTelecom, #subEmail	{
		height: 35px;
    	width: 130px;
    	display: inline
	}
</style>
<form id="signUpForm">
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">지역 :</label>
			<div class="col-sm-7">
				<select class="form-control" name="categoryNo">
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
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">아이디 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="userId" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">비밀번호</label>
			<div class="col-sm-7">
				<input type="password" class="form-control" name="userPw" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">닉네임 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="userNickname" /></div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">생일 :</label>
			<div class="col-sm-7">
				<input id="dateText" type="date" class="form-control" name="userBirth" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">성별 :</label>
			<div class="col-sm-7">
				<input type="radio" name="userGender" value="남" /> 남&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="radio" name="userGender" value="여" /> 여
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">이메일 :</label>
			<div class="col-sm-7">
				<input id="userEmail" type="hidden" name="userEmail" /> 
				<input id="emailMain" type="text" class="form-control" />
				@
				<input id="emailSub" type="text" class="form-control" readonly="readonly"/>
				<select id="subEmail" class="form-control">
					<option value=" ">선택하세요</option>
					<option value="naver.com">naver.com</option>
					<option value="daum.net">daum.net</option>
					<option value="google.com">google.com</option>
					<option value="">직접입력</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">통신사 :</label>
			<div class="col-sm-7">
				<select id="selectTelecom" class="form-control" name="userTelecom">
					<option value="LG">LG</option>
					<option value="KT">KT</option>
					<option value="SKT">SKT</option>
				</select>
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">전화번호 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="userPhone" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">권한:</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="userLevel" value="사용자"	readonly="readonly" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">직업 :</label>
			<div class="col-sm-7">
				<input type="text" class="form-control"name="userJob" />
			</div>
		</div>
	</div>
	<div>
		<button id="sendSignUp">회원가입</button>
		<button id="back">뒤로가기</button>
	</div>
</form>