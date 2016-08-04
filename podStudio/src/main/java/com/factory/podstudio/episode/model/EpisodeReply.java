package com.factory.podstudio.episode.model;

import com.factory.podstudio.good.model.Good;
import com.factory.podstudio.user.model.User;

public class EpisodeReply {

	// ���Ǽҵ� ��� ��ȣ
	private String episodeEeplyNo;
	// ���Ǽҵ� ��ȣ
	private Episode episode;
	// ȸ����ȣ
	private User user;
	// ���ƿ� ���� ��ȣ
	private Good good;
	// ��� ����
	private String episodeEeplyContent;
	// ��� ��ȣ
	private int episodeEeplyReplyNo;
	// ��� ����
	private int episodeEeplyReplyDepth;
	// ��� ����
	private int episodeEeplyReplyOrder;
	// ��� ��Ͻð�
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
