package com.factory.podstudio.listen.model;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class Listen {
	// 청취수순위번호
	private String listenNo;
	// 팟캐스트번호
	private PodCast podCast;
	// 에피소드번호
	private Episode episode;
	// 회원번호
	private User user;
	// 구분 / 스트리밍 / 다운로드
	private String listenPart;
	// 청취시간
	private String listenDate;

	public String getListenNo() {
		return listenNo;
	}

	public void setListenNo(String listenNo) {
		this.listenNo = listenNo;
	}

	public PodCast getPodCast() {
		return podCast;
	}

	public void setPodCast(PodCast podCast) {
		this.podCast = podCast;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getListenPart() {
		return listenPart;
	}

	public void setListenPart(String listenPart) {
		this.listenPart = listenPart;
	}

	public String getListenDate() {
		return listenDate;
	}

	public void setListenDate(String listenDate) {
		this.listenDate = listenDate;
	}

	@Override
	public String toString() {
		return "Listen [listenNo=" + listenNo + ", podCast=" + podCast + ", episode=" + episode + ", user=" + user
				+ ", listenPart=" + listenPart + ", listenDate=" + listenDate + "]";
	}

}
