<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<h1 id="pageTitle">AudioStreaming Sample</h1>
    <audio controls="controls" loop="loop" preload="auto">
    <source src="/resources/audioVideo/acousticbreeze.mp3" type="audio/mpeg" />
</audio>

<h1 id="pageTitle">VideoStreaming Sample</h1>
<video id="really-cool-video" class="video-js vjs-default-skin"
	controls preload="auto" width="640" height="264"
	poster="/resources/audioVideo/ksmart.png" data-setup='{}'>
	<source src="/resources/audioVideo/sampleVideo.mp4" type="video/mp4">
	<source src="/resources/audioVideo/sampleVideo.webm" type="video/webm">
</video>