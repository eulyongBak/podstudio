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
		$('#selectCategoryNo').change(function() {
			$('#showCategoryNo').val($('#selectCategoryNo').val());
		});
		$('#selectCategoryNo').change(function() {
			if ($('#showCategoryNo').val() == '서울') {
				$('#inputCategoryNo').val('category_22');
			}else if ($('#showCategoryNo').val() == '부산') {
				$('#inputCategoryNo').val('category_23');
			}else if ($('#showCategoryNo').val() == '대구') {
				$('#inputCategoryNo').val('category_24');
			}else if ($('#showCategoryNo').val() == '인천') {
				$('#inputCategoryNo').val('category_25');
			}else if ($('#showCategoryNo').val() == '광주') {
				$('#inputCategoryNo').val('category_26');
			}else if ($('#showCategoryNo').val() == '대전') {
				$('#inputCategoryNo').val('category_27');
			}else if ($('#showCategoryNo').val() == '울산') {
				$('#inputCategoryNo').val('category_28');
			}else if ($('#showCategoryNo').val() == '세종') {
				$('#inputCategoryNo').val('category_29');
			}else if ($('#showCategoryNo').val() == '경기') {
				$('#inputCategoryNo').val('category_30');
			}else if ($('#showCategoryNo').val() == '강원') {
				$('#inputCategoryNo').val('category_31');
			}else if ($('#showCategoryNo').val() == '충북') {
				$('#inputCategoryNo').val('category_32');
			}else if ($('#showCategoryNo').val() == '충남') {
				$('#inputCategoryNo').val('category_33');
			}else if ($('#showCategoryNo').val() == '전북') {
				$('#inputCategoryNo').val('category_34');
			}else if ($('#showCategoryNo').val() == '전남') {
				$('#inputCategoryNo').val('category_35');
			}else if ($('#showCategoryNo').val() == '경북') {
				$('#inputCategoryNo').val('category_36');
			}else if ($('#showCategoryNo').val() == '경남') {
				$('#inputCategoryNo').val('category_37');
			}else if ($('#showCategoryNo').val() == '제주') {
				$('#inputCategoryNo').val('category_38');
			}
		});	
		$('#modifyActionBtn').click(function() {
			$('#modifyUserForm').attr('action', '/modifyUser');
			$('#modifyUserForm').attr('method', 'POST');
			$('#modifyUserForm').attr('accept-charset', 'UTF-8');
			$('#modifyUserForm').submit();
		});
		$('.back').click(function() {
			parent.history.back();
			return false;
		})
	});
</script>
<h1>회원정보수정</h1>
<hr>
<form id="modifyUserForm">
	<div>
		<label>아이디 : </label> <input type="text"
			value="${ sessionUser.userId }" name="userId" readonly="readonly"/>
	</div>
	<div>
		<label>지역 : </label>
		<input id="inputCategoryNo" type="hidden" value="" name="categoryNo" />
		<input id="showCategoryNo" type="text"
			value="${ user.categoryMain }" readonly="readonly"/>
		<select id="selectCategoryNo">
			<option value="${ user.categoryMain }">선택하시오</option>
			<option value="서울">서울</option>
			<option value="부산">부산</option>
			<option value="대구">대구</option>
			<option value="인천">인천</option>
			<option value="광주">광주</option>
			<option value="대전">대전</option>
			<option value="울산">울산</option>
			<option value="세종">세종</option>
			<option value="경기">경기</option>
			<option value="강원">강원</option>
			<option value="충북">충북</option>
			<option value="충남">충남</option>
			<option value="전북">전북</option>
			<option value="전남">전남</option>
			<option value="경북">경북</option>
			<option value="경남">경남</option>
			<option value="제주">제주</option>
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