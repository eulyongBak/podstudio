<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>	

<form action="/addQuestion" method="post" accept-charset="utf-8">
	<div>
		<input readonly="readonly" type="hidden" value="${sessionUser.userNo }" name="userNo" />
	</div>
	<div>
		<label>문의사항 : </label>
		<select name="categoryNo">
		<option value="category_21">팟캐스트신고</option>
		<option value="category_20">제작문의</option>
		<option value="category_19">방송장애</option>
		<option value="category_18">방송운영</option>
		<option value="category_17">후원</option>
		<option value="category_16">결제</option>
		</select>
	</div>
	<div>
		<label>문의제목 : </label> <input type="text" name="customercenterTitle" />
	</div>
	<div>
		<label>문의내용 : </label> 
		<textarea rows="10" cols ="60" name="customercenterContent"></textarea>
	</div>
	<div>
		<button>문의하기</button>
	</div>
</form>
<div>
</div>