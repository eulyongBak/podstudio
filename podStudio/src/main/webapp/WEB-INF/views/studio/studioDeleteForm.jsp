<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<body>
	<div>
		<form action="/studioDelete" method ="post" accept-charset="utf-8">
			<input type="hidden" name="studioNo" value="${studioOne.studioNo }"/>
			<div><button>삭제</button></div>
		</form>	
	</div>
	<div>	
		<form action="/studioList" method="get" accept-charset="utf-8">
		<button>취소</button>
		</form>
	</div>
</body>

