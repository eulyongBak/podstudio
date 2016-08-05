<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<ul class="nav nav-tabs">
		<li class="active"><a data-toggle="tab" href="#audio">Audio</a></li>
		<li><a data-toggle="tab" href="#video">Video</a></li>
	</ul>

	<div class="tab-content">
		<div id="audio" class="tab-pane fade in active">
			<c:if test="${ episodeAudio }">
				<c:forEach var="audio" items="${ episode.episodeAudio }">

				</c:forEach>
			</c:if>
		</div>
		<div id="video" class="tab-pane fade">
			<c:if test="${ episodeVideo }">
				<c:forEach var="video" items="${ episode.episodeVideo }">

				</c:forEach>
			</c:if>
		</div>
	</div>
</div>