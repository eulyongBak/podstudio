<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>	

<form action="/addNotice" id="noticeInserform" method="post" accept-charset="utf-8">
	
	<div>
		<input readonly="readonly" type="hidden" value="${sessionUser.userNo }" name="userNo" />
	</div>
	
	<div>
		<label>글 번호 : </label> <input type="text" name="noticeNo" />
	</div>

	<div>
		<label>글제목 : </label> <input type="text" name="noticeTitle" />
	</div>
	<div>
		<label>글내용 : </label> 
		<textarea rows="10" cols ="60" name="noticeContent"></textarea>
	</div>
	
	<div>
		<button>글쓰기</button>
	
	</div>
</form>
<div>
<button id="back">뒤로가기</button>
</div>