package com.factory.podstudio.episode.model;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.user.model.User;

public class EpisodeReply {

	// 에피소드 댓글 번호
	private String episodeEeplyNo;
	// 에피소드 번호
	private Episode episode;
	// 회원번호
	private User user;
	// 좋아요 순위 번호
	private Good good;
	// 댓글 내용
	private String episodeEeplyContent;
	// 답글 번호
	private int episodeEeplyReplyNo;
	// 답글 깊이
	private int episodeEeplyReplyDepth;
	// 답글 순서
	private int episodeEeplyReplyOrder;
	// 댓글 등록시간
	private String episodeEeplyDate;

	public String getEpisodeEeplyNo() {
		return episodeEeplyNo;
	}

	public void setEpisodeEeplyNo(String episodeEeplyNo) {
		this.episodeEeplyNo = episodeEeplyNo;
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

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public String getEpisodeEeplyContent() {
		return episodeEeplyContent;
	}

	public void setEpisodeEeplyContent(String episodeEeplyContent) {
		this.episodeEeplyContent = episodeEeplyContent;
	}

	public int getEpisodeEeplyReplyNo() {
		return episodeEeplyReplyNo;
	}

	public void setEpisodeEeplyReplyNo(int episodeEeplyReplyNo) {
		this.episodeEeplyReplyNo = episodeEeplyReplyNo;
	}

	public int getEpisodeEeplyReplyDepth() {
		return episodeEeplyReplyDepth;
	}

	public void setEpisodeEeplyReplyDepth(int episodeEeplyReplyDepth) {
		this.episodeEeplyReplyDepth = episodeEeplyReplyDepth;
	}

	public int getEpisodeEeplyReplyOrder() {
		return episodeEeplyReplyOrder;
	}

	public void setEpisodeEeplyReplyOrder(int episodeEeplyReplyOrder) {
		this.episodeEeplyReplyOrder = episodeEeplyReplyOrder;
	}

	public String getEpisodeEeplyDate() {
		return episodeEeplyDate;
	}

	public void setEpisodeEeplyDate(String episodeEeplyDate) {
		this.episodeEeplyDate = episodeEeplyDate;
	}

	@Override
	public String toString() {
		return "EpisodeReply [episodeEeplyNo=" + episodeEeplyNo + ", episode=" + episode + ", user=" + user + ", good="
				+ good + ", episodeEeplyContent=" + episodeEeplyContent + ", episodeEeplyReplyNo=" + episodeEeplyReplyNo
				+ ", episodeEeplyReplyDepth=" + episodeEeplyReplyDepth + ", episodeEeplyReplyOrder="
				+ episodeEeplyReplyOrder + ", episodeEeplyDate=" + episodeEeplyDate + "]";
	}

}
