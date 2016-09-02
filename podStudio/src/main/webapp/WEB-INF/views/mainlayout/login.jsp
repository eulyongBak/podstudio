<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
#myPage {
	background-color: white;
	color: black;
	border: 2px solid #4CAF50; /* Green */
	width: 100%;
}
 a:link { color: black; text-decoration: none;}
 a:visited { color: black; text-decoration: none;}
 a:hover { color: black; text-decoration: none;}
 a:active {color: black; text-decoration: none;}
 
</style>
<script>
	$(document).ready(function() {
		$('#signIn').click(function() {
			$('#loginAction').attr("action", "/login");
			$('#loginAction').attr("method", "POST");
			$('#loginAction').submit();
		});
		$('#logout').click(function() {
			$('#memberFormAndAction').attr("action", "/logout");
			$('#memberFormAndAction').attr("method", "POST");
			$('#memberFormAndAction').submit();
		});
		$('#myPage').click(function() {
			$('#memberFormAndAction').attr("action", "/myPodcast");
			$('#memberFormAndAction').attr("method", "POST");
			$('#memberFormAndAction').submit();
		});
	});
</script>
<c:if test="${sessionUser == null}">
	<form id="loginAction" class="form-horizontal">
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 control-label">ID</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="userId" placeholder="ID" value="id_001" />
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">PW</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" name="userPw" placeholder="Password" value="pw_001" />
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" id="signIn" class="btn btn-default">Sign in</button>
				<button class="btn btn-default"><a href="/signUp" >Sign up</a></button>
			</div>
		</div>
	</form>
</c:if>
<c:if test="${sessionUser != null}">
	<form id="memberFormAndAction">
		<input type="hidden" value="${ sessionUser.userNo }" name="userNo" />
		<div>${sessionUser.userNickname}님 환영합니다.</div>
		<div>
			<button id="logout">Logout</button>
		</div>
		<br>
		<div>
			<button id="myPage">마이 페이지</button>
		</div>
	</form>
</c:if>