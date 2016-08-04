package com.factory.podstudio.episode.model;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.listen.model.Listen;
import com.factory.podstudio.podcast.model.PodCast;

public class Episode {

	// ���Ǽҵ� ��ȣ
	private String episodeNo;
	// ��ĳ��Ʈ��ȣ
	private PodCast podCast;
	// ���ƿ� ������ȣ
	private Good good;
	// û��� ������ȣ
	private Listen listen;
	// ���Ǽҵ� ����
	private String episodeTitle;
	// ���Ǽҵ� ����
	private String episodeContent;
	// ����� ����
	private String episodeAudio;
	// ��������
	private String episodeVidio;
	// ���Ǽҵ� ��Ͻð�
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
