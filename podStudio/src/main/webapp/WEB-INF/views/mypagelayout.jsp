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
</head>
<body>
	<div id="wrap">
		<div class="container">
			<div class="row">
				<div id="myheader" class="col-md-12">
					<tiles:insertAttribute name="header" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<tiles:insertAttribute name="profile" />
				</div>
			</div>
			<div class="row">
				<div id="mymenu" class="col-md-3">
					<tiles:insertAttribute name="menu" />
				</div>
				<div class="col-md-9">
					<tiles:insertAttribute name="main" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>