<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css">
<title><tiles:getAsString name="title" /></title>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<style>
.nav-tabs {
	border-bottom: none;
}

carousel-example-generic {
	data-interval: 100;
}
</style>
<script>
	$(document).ready(function() {
		$('#back').click(function() {
			parent.history.back();
			return false;
		});

		$('#subEmail').change(function() {
			if ($('#subEmail').val().length < 1) {
				$('#emailSub').removeAttr("readonly");
			} else {
				$('#emailSub').attr("readonly", true);
			}
			$('#emailSub').val($('#subEmail').val());
		});

		$('#sendSignUp').click(function() {
			$('#signUpForm').attr("action", "/signUp");
			$('#signUpForm').attr("method", "POST");
			$('#signUpForm').attr("accept-charset", "utf-8");

			/**
				이메일 단위 테스트
			 */
			var emailMain = $('#emailMain').val();
			console.log(emailMain + "<=== emailMain");
			var emailSub = $('#emailSub').val();
			console.log(emailSub + "<=== emailSub");
			var userEmail = emailMain.concat("@").concat(emailSub);
			console.log(userEmail + "<=== userEmail");
			$('#userEmail').val(userEmail);

			$('#signUpForm').submit();
		});

	});
</script>
</head>
<body>

	<div id="wrap">
		<div class="container">
			<div class="row">
				<div class="col-md-12" id="header">
					<tiles:insertAttribute name="header" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-12" id="nav_menu">
					<tiles:insertAttribute name="nav_menu" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-9" id="banner">
					<tiles:insertAttribute name="banner" />
				</div>
				<div class="col-md-3" id="login">
					<tiles:insertAttribute name="login" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-2" id="left">
<%-- 					<tiles:insertAttribute name="left" /> --%>
				</div>
				<div class="col-md-8" id="main">
					<tiles:insertAttribute name="main" />
				</div>
				<div class="col-md-2" id="right">
<%-- 					<tiles:insertAttribute name="right" /> --%>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12" id="footer">
					<tiles:insertAttribute name="footer" />
				</div>
			</div>
		</div>
	</div>

</body>
</html>