<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(document).ready(function() {
		$('#sendCM').click(function() {
			$('#cmInsertForm').attr("action", "/insertCM");
			$('#cmInsertForm').attr("method", "POST");
			$('#cmInsertForm').attr("accept-charset", "utf-8");
			$('#cmInsertForm').submit();
		});
	});
	</script>
</head>
<body>
	<form id="cmInsertForm">
		<div>
			<label>ȸ����ȣ : </label>
			<label>(SQL Session�� �ִ� ���� Hidden�� ��� �Ѿ��)</label>
			<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
		</div>
		<div>
			<label>��ĳ��Ʈ��ȣ : </label>
			<input type="text" name="podcastNo"/>
		</div>
		<div>
			<label>��Ʃ�����ȣ : </label>
			<input type="text" name="studioNo"/>
		</div>
		
		<div>
			<label>�ܰ���ȣ : </label>
			<input type="text" name="costNo"/>
		</div>
		<div>
			<label>������ȣ : </label>
			<input type="text" name="payNo"/>
		</div>
		<div>
			<label>CM������ǰ�� : </label>
			<input type="text" name="cmProduct"/>
		</div>
		<div>
			<label>CM�����ü�� : </label>
			<input type="text" name="cmCompany"/>
		</div>
		<div>
			<label>CM������ : </label>
			<input type="text" name="cmContent"/>
		</div>
		<div>
			<label>CM����Ŭ���� : </label>
			<input type="text" name="cmCount"/>
		</div>
		<div>
			<label>���񽺽����� : </label>
			<input type="date" name="cmServiceStart"/>
		</div>
		<div>
			<label>���������� : </label>
			<input type="date" name="cmServiceEnd"/>
		</div>
		<div>
			<label>���񽺻��� : </label>
			<input type="text" name="cmStatus"/>
			<label>���󼭺� / �������� / ���񽺸���</label>
		</div>
		<button id="sendCM">CM������</button>
		<button id="back">������</button>
	</form>
</body>
</html>