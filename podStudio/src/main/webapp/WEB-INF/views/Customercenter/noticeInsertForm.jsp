<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>	

<form action="/addNotice" id="noticeInserform" method="post" accept-charset="utf-8">
	<input readonly="readonly" type="hidden" value="${sessionUser.userNo }" name="userNo" />
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">������ : </label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="noticeTitle" />
			</div>
		</div>
	</div>
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">�۳��� :</label> 
			<div class="col-sm-7">
				<textarea rows="10" cols ="50" class="form-control" name="noticeContent"></textarea>
			</div>
		</div>
	</div>
	<div>
		<button>�۾���</button>
	
	</div>
</form>
<div>
</div>