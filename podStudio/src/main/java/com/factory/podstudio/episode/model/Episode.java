package com.factory.podstudio.episode.model;


public class Episode {

	// 에피소드 번호
	private String episodeNo;
	// 팟캐스트번호
	private String podCastNo;
	// 좋아요 순위번호
	private String goodNo;
	// 청취수 순위번호
	private String listenNo;
	// 에피소드 제목
	private String episodeTitle;
	// 에피소드 내용
	private String episodeContent;
	// 오디오 파일
	private String episodeAudio;
	// 비디오파일
	private String episodeVidio;
	// 에피소드 등록시간
	private String episodedate;
	
	public String getEpisodeNo() {
		return episodeNo;
	}

	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}

	public String getPodCastNo() {
		return podCastNo;
	}

	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}

	public String getGoodNo() {
		return goodNo;
	}

	public void setGoodNo(String goodNo) {
		this.goodNo = goodNo;
	}

	public String getListenNo() {
		return listenNo;
	}

	public void setListenNo(String listenNo) {
		this.listenNo = listenNo;
	}

	public String getEpisodeTitle() {
		return episodeTitle;
	}

	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}

	public String getEpisodeContent() {
		return episodeContent;
	}

	public void setEpisodeContent(String episodeContent) {
		this.episodeContent = episodeContent;
	}

	public String getEpisodeAudio() {
		return episodeAudio;
	}

	public void setEpisodeAudio(String episodeAudio) {
		this.episodeAudio = episodeAudio;
	}

	public String getEpisodeVidio() {
		return episodeVidio;
	}

	public void setEpisodeVidio(String episodeVidio) {
		this.episodeVidio = episodeVidio;
	}

	public String getEpisodedate() {
		return episodedate;
	}

	public void setEpisodedate(String episodedate) {
		this.episodedate = episodedate;
	}

	@Override
	public String toString() {
		return "Episode [episodeNo=" + episodeNo + ", podCastNo=" + podCastNo + ", goodNo=" + goodNo + ", listenNo="
				+ listenNo + ", episodeTitle=" + episodeTitle + ", episodeContent=" + episodeContent + ", episodeAudio="
				+ episodeAudio + ", episodeVidio=" + episodeVidio + ", episodedate=" + episodedate + "]";
	}
}
