package com.factory.podstudio.podmeeting.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class PodMeeting {
	// 단팟빵 번호
	private String podMeetingNo;
	// 팟캐스트번호
	//private PodCast podCast;
	private String podcastNo;
	// 에피소드번호
	//private Episode episode;
	private String episodeNo;
	// 회원번호
	//private User user;
	private String userNo;
	// 카테고리번호 / 지역
	//private Category category;
	//
	private String userNickname;
	private String categoryNo;
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
	public String getPodcastNo() {
		return podcastNo;
	}
	public void setPodcastNo(String podcastNo) {
		this.podcastNo = podcastNo;
	}
	public String getEpisodeNo() {
		return episodeNo;
	}
	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
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
		return "PodMeeting [podMeetingNo=" + podMeetingNo + ", podcastNo=" + podcastNo + ", episodeNo=" + episodeNo
				+ ", userNo=" + userNo + ", userNickname=" + userNickname + ", categoryNo=" + categoryNo
				+ ", podMeetingTitle=" + podMeetingTitle + ", podMeetingContent=" + podMeetingContent
				+ ", podMeetingPw=" + podMeetingPw + ", podMeetingDate=" + podMeetingDate + "]";
	}
}
