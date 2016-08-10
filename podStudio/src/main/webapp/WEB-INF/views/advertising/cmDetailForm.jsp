<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</script>
<form id="cmDetailListFormAndAction">
	<div class="row">
		<div class="col-sm-2">
			<label>CM광고제품명</label>
		</div>
		<div class="col-sm-2">
			<label>CM광고업체명</label>
		</div>
		<div class="col-sm-2">
			<label>CM광고내용</label>
		</div>
		<div class="col-sm-2">
			<label>CM광고클릭수</label> 
		</div>
		<div class="col-sm-2">
			<label>CM광고 등록일</label> 
		</div>
		<div class="col-sm-2">
			<label>서비스시작일</label> 
		</div>
		<div class="col-sm-2">
			<label>서비스종료일</label> 
		</div>
		<div class="col-sm-3">
			<label>서비스상태</label> 
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<label>${ cmProduct }</label>
		</div>
 		<div class="col-sm-2">
			<label>${ cmCompany }</label>
		</div>
		<div class="col-sm-2">
			<label>${ cmContent }</label>
		</div>
		<div class="col-sm-2">
			<label>${ cmCount }</label>
		</div>
		<div class="col-sm-2">
			<label>${ cmDate }</label>
		</div>
		<div class="col-sm-2">
			<label>${ cmServiceStart }</label>
		</div>
		<div class="col-sm-2">
			<label>${ cmServiceEnd }</label>
		</div>
		<div class="col-sm-3">
			<label>${ cmStatus }</label>
			<label>(정상서비스 / 서비스진행 / 서비스만료)</label>
		</div>
	</div>
</form>