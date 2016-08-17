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
				<label>에피소드 제목 : </label>
			</td>
			<td>
				<input type="text" name="episodeTitle">
			</td>
		</tr>
		<tr>
			<td>
				<label>첨부파일 : </label>
			</td>
			<td>
				<input type="file" name="files" />
				<input type="checkbox" name="episodeAudio"/>
				<input type="checkbox" name="episodeVideo"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>에피소드 내용 : </label>
			</td>
			<td>
				<textarea rows="10" cols="50" name="episodeContent"> 여기에 내용을 입력하세요.</textarea>
			</td>
		</tr>
	</table>
	<input type="submit" value="등록하기">
	<!-- <button id="sendEpisode">등록하기</button>
	<button id="back">뒤로가기</button> -->
</form>