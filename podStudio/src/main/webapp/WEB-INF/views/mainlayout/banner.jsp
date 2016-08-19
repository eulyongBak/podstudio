<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function() {
		$('.carousel').carousel({
			interval : 1500
		});
	});
</script>
<div id="carousel-example-generic" class="carousel slide"
	data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#carousel-example-generic" data-slide-to="0"
			class="active"></li>
		<li data-target="#carousel-example-generic" data-slide-to="1"></li>
		<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		<li data-target="#carousel-example-generic" data-slide-to="3"></li>
	</ol>

	<!-- Wrapper for slides -->
	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img src="/resources/imgs/Java.png">
			<div class="carousel-caption">...</div>
		</div>
		<div class="item">
			<img src="/resources/imgs/jQuery.png">
			<div class="carousel-caption">...</div>
		</div>
		<div class="item">
			<img src="/resources/imgs/Spring.png">
			<div class="carousel-caption">...</div>
		</div>
		<div class="item">
			<img src="/resources/imgs/Tiles.png">
			<div class="carousel-caption">...</div>
		</div>
	</div>
</div>