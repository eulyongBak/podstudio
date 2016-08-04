package com.factory.podstudio.podmeeting.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class PodMeeting {
	// ´ÜÆÌ»§ ¹øÈ£
	private String podMeetingNo;
	// ÆÌÄ³½ºÆ®¹øÈ£
	private PodCast podCast;
	// ¿¡ÇÇ¼Òµå¹øÈ£
	private Episode episode;
	// È¸¿ø¹øÈ£
	private User user;
	// Ä«Å×°í¸®¹øÈ£ / Áö¿ª
	private Category category;
	// ´ÜÆÌ»§ Á¦¸ñ
	private String podMeetingTitle;
	// ´ÜÆÌ»§ ³»¿ë
	private String podMeetingContent;
	// ´ÜÆÌ»§ ºñ¹Ð¹øÈ£
	private String podMeetingPw;
	// ´ÜÆÌ»§ ÀÛ¼ºÀÏÀÚ
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
