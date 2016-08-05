package com.factory.podstudio.podmeeting.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class PodMeeting {
	// 단팟빵 번호
	private String podMeetingNo;
	// 팟캐스트번호
	private PodCast podCast;
	// 에피소드번호
	private Episode episode;
	// 회원번호
	private User user;
	// 카테고리번호 / 지역
	private Category category;
	// 단팟빵 제목
	private String podMeetingTitle;
	// 단팟빵 내용
	private String podMeetingContent;
	// 단팟빵 비밀번호
	private String podMeetingPw;
	// 단팟빵 작성일자
	private String podMeetingDate;

	public String getPodMeetingNo() {
		return podMeetingNo;
	}

	public void setPodMeetingNo(String podMeetingNo) {
		this.podMeetingNo = podMeetingNo;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getPodMeetingTitle() {
		return podMeetingTitle;
	}

	public void setPodMeetingTitle(String podMeetingTitle) {
		this.podMeetingTitle = podMeetingTitle;
	}

	public String getPodMeetingContent() {
		return podMeetingContent;
	}

	public void setPodMeetingContent(String podMeetingContent) {
		this.podMeetingContent = podMeetingContent;
	}

	public String getPodMeetingPw() {
		return podMeetingPw;
	}

	public void setPodMeetingPw(String podMeetingPw) {
		this.podMeetingPw = podMeetingPw;
	}

	public String getPodMeetingDate() {
		return podMeetingDate;
	}

	public void setPodMeetingDate(String podMeetingDate) {
		this.podMeetingDate = podMeetingDate;
	}

	@Override
	public String toString() {
		return "PodMeeting [podMeetingNo=" + podMeetingNo + ", podCast=" + podCast + ", episode=" + episode + ", user="
				+ user + ", category=" + category + ", podMeetingTitle=" + podMeetingTitle + ", podMeetingContent="
				+ podMeetingContent + ", podMeetingPw=" + podMeetingPw + ", podMeetingDate=" + podMeetingDate + "]";
	}

}
