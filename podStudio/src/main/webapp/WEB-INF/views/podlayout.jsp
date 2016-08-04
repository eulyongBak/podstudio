<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css">
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<div id="wrap">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<tiles:insertAttribute name="header" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<tiles:insertAttribute name="podcasttitle" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<tiles:insertAttribute name="share" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-8">
					<tiles:insertAttribute name="main" />
				</div>
				<div class="col-md-4">
					<tiles:insertAttribute name="right" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-10">
					<tiles:insertAttribute name="bottomL" />
				</div>
				<div class="col-md-2">
					<tiles:insertAttribute name="bottomR" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>