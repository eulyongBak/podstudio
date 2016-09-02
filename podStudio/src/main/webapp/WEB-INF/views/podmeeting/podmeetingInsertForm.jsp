<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>단팟 게시판</h1>
	<form action="/insertPodMeeting" method="post" accept-charset="UTF-8">
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">팟케스트번호:</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="podcastNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">에피소드번호:</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="episodeNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">회원번호:</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="userNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">카테고리번호:</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="categoryNo"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">단팟빵 제목:</label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="podMeetingTitle"/>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">글 내용 : </label>
				<div class="col-sm-7">
					<textarea rows="20" cols="50" class="form-control" name="podMeetingContent"></textarea>
				</div>
			</div>
		</div>
		<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">비밀번호: </label>
				<div class="col-sm-7">
					<input type="text" class="form-control" name="podMeetingPw"/></div>
			</div>
		</div>
		<div>
			<input type="submit" value="등록" />
		</div>
	</form>
</body>
</html>