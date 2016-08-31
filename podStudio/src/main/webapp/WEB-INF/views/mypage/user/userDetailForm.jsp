<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1 style="text-align: right;">회원정보보기</h1>
<hr/>
<div class="form-horizontal">
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">아이디</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.userId }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">지역</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.categoryMain }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">닉네임</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.userNickname }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">생일</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.userBirth }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">성별</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.userGender }" readonly="readonly"> 
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">이메일</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="${ user.userEmail }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">[통신사] 전화번호</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" value="[${ user.userTelecom }] ${ user.userPhone }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputEmail3" class="col-sm-2 control-label">권한</label>
		<div class="col-sm-7">
			<input type="text" class="form-control"value="${ user.userLevel }" readonly="readonly">
		</div>
	</div>
	<div class="form-group">
		<label for="inputPassword3" class="col-sm-2 control-label">직업</label>
		<div class="col-sm-7">
			<input type="text" class="form-control"value="${ user.userJob }" readonly="readonly">
		</div>
	</div>
</div>
