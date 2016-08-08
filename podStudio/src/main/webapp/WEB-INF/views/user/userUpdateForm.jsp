<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>
	$(document).ready(function() {
		$('#telecom').change(function() {
			$('#ut').val($('#telecom').val());
		});
		$('#level').change(function() {
			$('#ul').val($('#level').val());
		});
		$('#modifyActionBtn').click(function() {
			$('#modifyUserForm').attr('action', '/modifyUser');
			$('#modifyUserForm').attr('method', 'POST');
			$('#modifyUserForm').attr('accept-charset', 'UTF-8');
			$('#modifyUserForm').submit();
		});
	});
</script>
<h1>회원정보수정</h1>
<form id="modifyUserForm">
	<div>
		<label>아이디 : </label> <input type="text"
			value="${ sessionUser.userId }" name="userId" />
	</div>
	<div>
		<label></label> <select name="categoryNo">
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
		<label>비밀번호 : </label> <input type="password"
			value="${sessionUser.userPw }" name="userPw" />
	</div>
	<div>
		<label>닉네임 : </label> <input type="text"
			value="${sessionUser.userNickname }" name="userNickname" />
	</div>
	<div>
		<label>생일 : </label> <input type="text"
			value="${sessionUser.userBirth }" name="userBirth" />
	</div>
	<div>
		<label>이메일 : </label> <input type="text"
			value="${sessionUser.userEmail }" name="userEmail" />
	</div>
	<div>
		<label>통신사 : </label> <input id="ut" type="text" readonly="readonly"
			name="userTelecom" value="${sessionUser.userTelecom }" /> <select
			id="telecom">
			<option value="${ sessionUser.userTelecom }">통신사를 선택하시오</option>
			<option value="SKT">SKT</option>
			<option value="LG">LG</option>
			<option value="KT">KT</option>
		</select>
	</div>
	<div>
		<label>전화번호 : </label> <input type="tel"
			value="${ sessionUser.userPhone }" name="userPhone" />
	</div>
	<div>
		<label>권한 : </label> <input id="ul" type="text"
			value="${sessionUser.userLevel }" readonly="readonly"
			name="userLevel" /> <select id="level">
			<option value="${ sessionUser.userLevel }">변경할 직업을 선택하시오</option>
			<option value="사용자">사용자</option>
			<option value="관리자">관리자</option>
			<option value="광고주">광고주</option>
			<option value="제작자">제작자</option>
			<option value="공연관계자">공연관계자</option>
		</select>
	</div>
	<div>
		<label>직업 : </label> <input type="text"
			value="${sessionUser.userJob }" name="userJob">
	</div>
	<div>
		<button id="modifyActionBtn">회원정보수정</button>
		<button class="back">돌아가기</button>
	</div>
</form>