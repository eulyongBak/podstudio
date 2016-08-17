<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<script>
	$(document).ready(function() {
		$('#back').click(function() {
			parent.history.back();
			return false;
		});	
			
		$('#sendEpisode').click(function() {
			$('#bannerInsertForm').attr("action", "/episodeInsert");
			$('#bannerInsertForm').attr("method", "POST");
			$('#bannerInsertForm').attr("accept-charset", "utf-8");
			$('#bannerInsertForm').submit();
		});	
	});
</script>    
<form action="/episodeInsertForm" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>
				<label>���Ǽҵ� ���� : </label>
			</td>
			<td>
				<input type="text" name="episodeTitle">
			</td>
		</tr>
		<tr>
			<td>
				<label>÷������ : </label>
			</td>
			<td>
				<input type="file" name="files" />
				<input type="checkbox" name="episodeAudio"/>
				<input type="checkbox" name="episodeVideo"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>���Ǽҵ� ���� : </label>
			</td>
			<td>
				<textarea rows="10" cols="50" name="episodeContent"> ���⿡ ������ �Է��ϼ���.</textarea>
			</td>
		</tr>
	</table>
	<input type="submit" value="����ϱ�">
	<!-- <button id="sendEpisode">����ϱ�</button>
	<button id="back">�ڷΰ���</button> -->
</form>