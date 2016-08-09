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
		<table>
			<tr>
				<td>단팟빵번호:<input type="text" name="podMeetingNo"/></td>
			</tr>
			<tr>	
				<td>팟케스트번호:<input type="text" name="podcastNo"/></td>
			</tr>
			<tr>
				<td>에피소드번호:<input type="text" name="episodeNo"/></td>
			</tr>
			<tr>
				<td>회원번호:<input type="text" name="userNo"/></td>
			</tr>
			<tr>	
				<td>카테고리번호:<input type="text" name="categoryNo"/></td>
				
			</tr>
			<tr>
				<td>제목:<input type="text" name="podMeetingTitle" /></td>
			</tr>
			<tr>
				<td><textarea rows="20" cols="50" name="podMeetingContent"></textarea></td>
			</tr>
			<tr>
				<td>비밀번호: <input type="password" name="podMeetingPw"/></td>
			</tr>
			
		</table>

		<div>
			<input type="submit" value="등록" />
		</div>
	</form>
</body>
</html>