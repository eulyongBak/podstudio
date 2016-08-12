<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
	<div>
		<label>아이디 : </label> ${ user.userId }
	</div>
	<div>
		<label>닉네임 : </label> ${ user.userNickname }
	</div>
	<div>
		<label>생일 : </label> ${ user.userBirth }
	</div>
	<div>
		<label>성별 : </label> ${ user.userGender }
	</div>
	<div>
		<label>이메일 : </label> ${ user.userEmail }
	</div>
	<div>
		<label>[통신사] 전화번호 : </label> [${ user.userTelecom }] ${ user.userPhone }
	</div>
	<div>
		<label>권한 : </label> ${ user.userLevel }
	</div>
	<div>
		<label>직업 : </label> ${ user.userJob }
	</div>
</div>
