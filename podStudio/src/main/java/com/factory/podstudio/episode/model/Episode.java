package com.factory.podstudio.episode.model;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.listen.model.Listen;
import com.factory.podstudio.podcast.model.PodCast;

public class Episode {

	// 에피소드 번호
	private String episodeNo;
	// 팟캐스트번호
	private PodCast podCast;
	// 좋아요 순위번호
	private Good good;
	// 청취수 순위번호
	private Listen listen;
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

	public PodCast getPodCast() {
		return podCast;
	}

	public void setPodCast(PodCast podCast) {
		this.podCast = podCast;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public Listen getListen() {
		return listen;
	}

	public void setListen(Listen listen) {
		this.listen = listen;
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
		return "Episode [episodeNo=" + episodeNo + ", podCast=" + podCast + ", episodeTitle=" + episodeTitle
				+ ", episodeContent=" + episodeContent + ", episodeAudio=" + episodeAudio + ", episodeVidio="
				+ episodeVidio + ", episodedate=" + episodedate + "]";
	}

}
