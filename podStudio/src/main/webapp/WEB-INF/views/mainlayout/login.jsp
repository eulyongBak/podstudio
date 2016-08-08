<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	$(document).ready(function() {
		$('#signIn').click(function() {
			$('#loginAction').attr("action", "/login");
			$('#loginAction').attr("method", "POST");
			$('#loginAction').submit();
		});

		$('#signUp').click(function() {
			$('#loginAction').attr("action", "/signUp");
			$('#loginAction').attr("method", "GET");
			$('#loginAction').submit();
		});

		$('#logout').click(function() {
			$('#memberFormAndAction').attr("action", "/logout");
			$('#memberFormAndAction').attr("method", "POST");
			$('#memberFormAndAction').submit();
		});
		$('#myProfile').click(function() {
			$('#memberFormAndAction').attr("action", "/userDetail");
			$('#memberFormAndAction').attr("method", "GET");
			$('#memberFormAndAction').submit();
		});
		$('#modifyBtn').click(function() {
			$('#memberFormAndAction').attr("action", "/modifyUser");
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
			<button id="signUp">Sign Up</button>
		</div>
	</form>
</c:if>
<c:if test="${sessionUser != null}">
	<form id="memberFormAndAction">
		<input type="hidden" value="${ sessionUser.userNo }" name="userNo" />
		${sessionUser.userNickname}님 환영합니다.
		<button id="logout">Logout</button>
		<button id="myProfile">회원정보보기</button>
		<button id="modifyBtn">회원정보수정</button>
	</form>
</c:if>