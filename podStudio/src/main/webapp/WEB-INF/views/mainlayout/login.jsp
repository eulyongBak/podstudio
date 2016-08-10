<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#myPage {
    background-color: white;
    color: black;
    border: 2px solid #4CAF50; /* Green */
    width: 100%;
}
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
			$('#memberFormAndAction').attr("action", "/myPage");
			$('#memberFormAndAction').attr("method", "GET");
			$('#memberFormAndAction').submit();
		});
	});
</script>
<c:if test="${sessionUser == null}">
	<form id="loginAction">
		<div>
			<label>ID : </label> <input type="text" name="userId" />
		</div>
		<div>
			<label>PW : </label> <input type="password" name="userPw" />
		</div>
		<div>
			<button id="signIn">Sign In</button>
			<button><a href="/signUp">Sign Up</a></button>
		</div>
	</form>
</c:if>
<c:if test="${sessionUser != null}">
	<form id="memberFormAndAction">
		<input type="hidden" value="${ sessionUser.userNo }" name="userNo" />
			<div>
				${sessionUser.userNickname}님 환영합니다.
			</div>
			<div>
				<button id="logout">Logout</button>
			</div>
			<br>
			<div>
				<button id="myPage">마이 페이지</button>	
			</div>
	</form>
</c:if>