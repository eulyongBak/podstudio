<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>	

<form action="/addQuestion" method="post" accept-charset="utf-8">
	<div>
		<input readonly="readonly" type="hidden" value="${sessionUser.userNo }" name="userNo" />
	</div>
	<div>
		<label>���ǻ��� : </label>
		<select name="categoryNo">
		<option value="category_21">��ĳ��Ʈ�Ű�</option>
		<option value="category_20">���۹���</option>
		<option value="category_19">������</option>
		<option value="category_18">��ۿ</option>
		<option value="category_17">�Ŀ�</option>
		<option value="category_16">����</option>
		</select>
	</div>
	<div>
		<label>�������� : </label> <input type="text" name="customercenterTitle" />
	</div>
	<div>
		<label>���ǳ��� : </label> 
		<textarea rows="10" cols ="60" name="customercenterContent"></textarea>
	</div>
	<div>
		<button>�����ϱ�</button>
	</div>
</form>
<div>
</div>