<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<script>
	$(document).ready(function() {
		$('#sendBanner').click(function() {
			$('#bannerInsertForm').attr("action", "/insertBanner");
			$('#bannerInsertForm').attr("method", "POST");
			$('#bannerInsertForm').attr("accept-charset", "utf-8");
			$('#bannerInsertForm').submit();
		});
	});
</script>

<form id="bannerInsertForm">
	<!-- <div>
		<label>��ʹ�ȣ : </label>
		<label>
			<input type="text" name="bannerNo" />
		</label>
	</div> -->
	<div>
		<label>ȸ����ȣ : </label>
		<label>(SQL Session�� �ִ� ���� Hidden�� ��� �Ѿ��)</label>
		<input type="hidden" name="userNo" value="${ sessionUser.userNo }" />
	</div>
	<div>
		<label>��ĳ��Ʈ��ȣ : </label>
		<input type="text" name="podcastNo" />
	</div>
	<div>
		<label>��Ʃ�����ȣ : </label>
		<input type="text" name="studioNo" />
	</div>
	<div>	
		<label>������ȣ : </label>
		<input type="text" name="showNo" />
	</div>
	<div>
		<label>�ܰ���ȣ : </label>
		<input type="text" name="costNo" />
	</div>
	<div>	
		<label>������ȣ : </label>
		<input type="text" name="payNo" />
	</div>
	<div>	
		<label>��ʱ����ǰ�� : </label>
		<input type="text" name="bannerProduct" />
	</div>
	<div>
		<label>��ʻ�ǰȸ�� : </label>
		<input type="text" name="bannerCompany" />
	</div>
	<div>
		<label>��ʱ������� : </label>
		<input type="text" name="bannerFileName" />
	</div>
	<div>	
		<label>��ʱ���Ŭ���� : </label>
		<input type="text" name="bannerCount" />
	</div>
	<div>	
		<label>��ʱ����񽺽��۽ð� : </label>
		<input type="date" name="bannerServiceStart" />
	</div>
	<div>	
		<label>��ʱ����񽺳��ð� : </label>
		<input type="date" name="bannerServiceEnd" />
	</div>
	<div>
		<label>��ʱ����ϻ��� : </label>
		<input type="text" name="bannerStatus" />
		<label>	(���󼭺� / ���� ������ / ���� �Ϸ�)</label>
	</div>
	<button id="sendBanner">��ʱ�����</button>
	<button id="back">������</button>
</form>