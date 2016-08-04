<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
	<div>
		<label>아이디 : </label> ${ userId }
	</div>
	<div>
		<label>닉네임 : </label> ${ userNickname }
	</div>
	<div>
		<label>생일 : </label> ${ userBirth }
	</div>
	<div>
		<label>성별 : </label> ${ userGender }
	</div>
	<div>
		<label>이메일 : </label> ${ userEmail }
	</div>
	<div>
		<label>[통신사] 전화번호 : </label> [${ userTelecome }] ${ userPhone }
	</div>
	<div>
		<label>권한 : </label> ${ userLevel }
	</div>
	<div>
		<label>직업 : </label> ${ userJob }
	</div>
</div>
